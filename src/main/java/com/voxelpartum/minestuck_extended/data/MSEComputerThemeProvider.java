package com.voxelpartum.minestuck_extended.data;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import com.mraof.minestuck.computer.theme.ComputerTheme;
import com.mraof.minestuck.computer.theme.ComputerThemes;
import com.voxelpartum.minestuck_extended.client.MSEComputerThemes;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class MSEComputerThemeProvider implements DataProvider {

    private final Map<ResourceLocation, ComputerTheme.Data> computerThemes = new HashMap<>();
    private final PackOutput output;

    public MSEComputerThemeProvider(PackOutput output)
    {
        this.output = output;
    }

    protected void add(ResourceLocation id, int textColor)
    {
        ResourceLocation textureLocation = id.withPath(name -> "textures/gui/theme/" + name + ".png");
        add(id, new ComputerTheme.Data(textureLocation, textColor));
    }

    protected void add(ResourceLocation id, ComputerTheme.Data data)
    {
        computerThemes.put(id, data);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {

        add(MSEComputerThemes.BONER, 0xFF780B);

        Path outputPath = output.getOutputFolder(PackOutput.Target.RESOURCE_PACK);
        List<CompletableFuture<?>> futures = new ArrayList<>(computerThemes.size());

        for(Map.Entry<ResourceLocation, ComputerTheme.Data> entry : computerThemes.entrySet())
        {
            Path themePath = getPath(outputPath, entry.getKey());
            JsonElement encodedTheme = ComputerTheme.Data.CODEC.encodeStart(JsonOps.INSTANCE, entry.getValue()).getOrThrow();
            futures.add(DataProvider.saveStable(cache, encodedTheme, themePath));
        }
        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

    }

    private static Path getPath(Path outputPath, ResourceLocation id)
    {
        return outputPath.resolve(id.getNamespace() + "/" + ComputerThemes.PATH + "/" + id.getPath() + ".json");
    }

    @Override
    public String getName() {
        return "MSE Computer Themes";
    }
}
