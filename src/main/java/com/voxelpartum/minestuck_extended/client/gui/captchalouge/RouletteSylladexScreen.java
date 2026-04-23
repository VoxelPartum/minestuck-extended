package com.voxelpartum.minestuck_extended.client.gui.captchalouge;

import com.mraof.minestuck.client.gui.captchalouge.SylladexScreen;
import com.mraof.minestuck.inventory.captchalogue.Modus;
import com.voxelpartum.minestuck_extended.MinestuckExtendedConfig;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.gui.widget.ExtendedButton;

import java.util.Random;

public class RouletteSylladexScreen extends SylladexScreen {

    private Button guiButton;

    public RouletteSylladexScreen(int windowId, Inventory inventory, Modus modus)
    {
        super(windowId, inventory, modus);
        this.textureIndex = 0;
    }

    @Override
    public void init()
    {
        super.init();
        guiButton = new ExtendedButton(xOffset + BUTTON_X_OFFSET, yOffset + BUTTON_Y_OFFSET + BUTTON_HEIGHT * 2 + 6, BUTTON_WIDTH, BUTTON_HEIGHT, Component.empty(), button -> spinModus());
        addRenderableWidget(guiButton);
    }

    @Override
    public int getCardTextureX(GuiCard card) {
        return CARD_WIDTH * (canUse((RouletteCard) card) ? textureIndex: textureIndex+1);
    }

    @Override
    public int getCardTextureY(GuiCard card) {
        return 0;
    }
    @Override
    public ResourceLocation getCardTexture(GuiCard card){
        return ResourceLocation.fromNamespaceAndPath("minestuck_extended", "textures/gui/icons.png");
    }

    @Override
    public void updateContent()
    {
        NonNullList<ItemStack> stacks = modus.getItems();
        int randIndex = modus.getNonEmptyCards() == 0 ? 0 : new Random().nextInt(MinestuckExtendedConfig.SERVER.useFullRoulette.get() ? modus.getSize() : modus.getNonEmptyCards());
        int radius = (50 + ((stacks.size() * stacks.size()) /16));
        this.cards.clear();
        this.maxWidth = Math.max(mapWidth, (2 * (radius + X_OFFSET)));
        this.maxHeight = Math.max(mapHeight, (2 * (radius + Y_OFFSET)));
        super.updateContent();
        for(int i = 0; i < stacks.size(); i++){
            this.cards.add(new RouletteCard(stacks.get(i), this, i,
                    ((maxWidth - X_OFFSET)/2) + (int) (radius * Math.sin(2*Math.PI*i / stacks.size())),
                    ((maxHeight-Y_OFFSET)/2) + (int) (radius * Math.cos(2*Math.PI*i / stacks.size())),
                    i == randIndex));
        }
        updatePosition();
    }

    @Override
    public void updatePosition()
    {
        int randIndex = modus.getNonEmptyCards() == 0 ? 0 : new Random().nextInt(MinestuckExtendedConfig.SERVER.useFullRoulette.get() ? modus.getSize() : modus.getNonEmptyCards());
        int radius = (int) (50 + ((double) (cards.size() * cards.size()) /16));
        this.maxWidth = Math.max(mapWidth, (2 * (radius + X_OFFSET)));
        this.maxHeight = Math.max(mapHeight, (2 * (radius + Y_OFFSET)));
        for(int i = 0; i < cards.size(); i++)
        {
            RouletteCard card = (RouletteCard) cards.get(i);
            card.xPos = ((maxWidth - X_OFFSET)/2) + (int) (radius * Math.cos(-2*Math.PI*i / cards.size()));
            card.yPos = ((maxHeight - Y_OFFSET)/2) + (int) (radius * Math.sin(-2*Math.PI*i / cards.size()));
            card.isUsable = card.index == randIndex;
        }
    }

    public boolean canUse(RouletteCard card){
        return card.isUsable;
    }

    public static class RouletteCard extends GuiCard{
        RouletteSylladexScreen gui;
        public boolean isUsable;

        public RouletteCard(ItemStack item, RouletteSylladexScreen gui, int index, int xPos, int yPos, boolean isUsable){
            super(item, gui, index, xPos, yPos);
            this.gui = gui;
            this.isUsable = isUsable;
        }

        @Override
        public void onClick(int mouseButton){
            if(gui.canUse(this))
                super.onClick(mouseButton);
            gui.updateContent();
        }
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float f)
    {
        guiButton.setMessage(Component.translatable("minestuck_extended.spin_modus"));
        super.render(guiGraphics, mouseX, mouseY, f);
    }

    private void spinModus(){
        //Ill get to it later?
    }

}