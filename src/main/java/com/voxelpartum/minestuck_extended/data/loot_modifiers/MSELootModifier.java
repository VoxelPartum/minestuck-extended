package com.voxelpartum.minestuck_extended.data.loot_modifiers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mraof.minestuck.world.lands.LandTypePair;
import com.mraof.minestuck.world.lands.LandTypes;
import com.mraof.minestuck.world.lands.terrain.TerrainLandType;
import com.mraof.minestuck.world.lands.title.TitleLandType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

public class MSELootModifier extends LootModifier {

    public final ResourceLocation inject;
    public final ResourceLocation target;

    private final Optional<TerrainLandType> terrain;
    private final Optional<TitleLandType> title;

    public static final MapCodec<MSELootModifier> CODEC = RecordCodecBuilder
            .mapCodec(inst -> LootModifier.codecStart(inst).and(inst.group(
                            ResourceLocation.CODEC.fieldOf("inject").forGetter(e -> e.inject),
                            ResourceLocation.CODEC.fieldOf("target").forGetter(e -> e.target),
                            LandTypes.TERRAIN_REGISTRY.byNameCodec().optionalFieldOf("terrain").forGetter(e -> e.terrain),
                            LandTypes.TITLE_REGISTRY.byNameCodec().optionalFieldOf("title").forGetter(e -> e.title)))
                    .apply(inst, MSELootModifier::new));

    protected MSELootModifier(LootItemCondition[] conditionsIn, ResourceLocation inject, ResourceLocation target,
                              Optional<TerrainLandType> terrain, Optional<TitleLandType> title) {
        super(conditionsIn);
        this.inject = inject;
        this.target = target;
        this.title = title;
        this.terrain = terrain;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generatedLoot,
                                                 @NotNull LootContext context) {
        TitleLandType title = getTitle(context);
        TerrainLandType terrain = getTerrain(context);
        boolean title_correct = this.title.isEmpty() || this.title.get() == title;
        boolean terrain_correct = this.terrain.isEmpty() || this.terrain.get() == terrain;
        if (title_correct && terrain_correct && context.getQueriedLootTableId().equals(target)) {
            generatedLoot.addAll(runTable(context.getLevel(), inject));
        }
        return generatedLoot;
    }

    @Nullable
    public static TitleLandType getTitle(@Nonnull LootContext context) {
        LandTypePair aspects = LandTypePair.getTypes(context.getLevel()).orElse(null);
        if (aspects != null)
            return aspects.getTitle();
        return null;
    }

    @Nullable
    public static TerrainLandType getTerrain(@Nonnull LootContext context) {
        LandTypePair aspects = LandTypePair.getTypes(context.getLevel()).orElse(null);
        if (aspects != null)
            return aspects.getTerrain();
        return null;
    }

    public static ObjectArrayList<ItemStack> runTable(ServerLevel level, ResourceLocation loot_table) {
        ResourceKey<LootTable> key = ResourceKey.create(Registries.LOOT_TABLE, loot_table);
        LootTable table = level.getServer().reloadableRegistries().getLootTable(key);
        LootParams.Builder builder = new LootParams.Builder(level);
        LootParams params = builder.create(LootContextParamSet.builder().build());
        return table.getRandomItems(params);
    }

}
