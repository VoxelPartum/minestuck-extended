package com.voxelpartum.minestuck_plus.client.gui.captchalouge;

import com.mraof.minestuck.client.gui.captchalouge.SylladexScreen;
import com.mraof.minestuck.inventory.captchalogue.Modus;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.Random;

public class RouletteSylladexScreen extends SylladexScreen {

    public Modus modus;

    public RouletteSylladexScreen(Modus modus)
    {
        super();
        this.modus = modus;
        this.textureIndex = 0;
    }

    @Override
    public ResourceLocation getCardTexture(GuiCard card) {
        return ResourceLocation.fromNamespaceAndPath("minestuck_plus", "textures/gui/icons.png");
    }

    @Override
    public int getCardTextureY(GuiCard card) {
        return 0;
    }

    @Override
    public void updateContent()
    {
        NonNullList<ItemStack> stacks = modus.getItems();
        int radius = (50 + ((stacks.size() * stacks.size()) /16));
        this.cards.clear();
        this.maxWidth = Math.max(mapWidth, (2 * (radius + X_OFFSET)));
        this.maxHeight = Math.max(mapHeight, (2 * (radius + Y_OFFSET)));
        super.updateContent();
        for(int i = 0; i < stacks.size(); i++){
            this.cards.add(new RouletteCard(stacks.get(i), this, i,
                    ((maxWidth - X_OFFSET)/2) + (int) (radius * Math.sin(2*Math.PI*i / stacks.size())),
                    ((maxHeight-Y_OFFSET)/2) + (int) (radius * Math.cos(2*Math.PI*i / stacks.size())) ));
        }

    }

    @Override
    public void updatePosition()
    {
        int radius = (int) (50 + ((double) (cards.size() * cards.size()) /16));
        this.maxWidth = Math.max(mapWidth, (2 * (radius + X_OFFSET)));
        this.maxHeight = Math.max(mapHeight, (2 * (radius + Y_OFFSET)));
        for(int i = 0; i < cards.size(); i++)
        {
            GuiCard card = cards.get(i);
            card.xPos = ((maxWidth - X_OFFSET)/2) + (int) (radius * Math.sin(2*Math.PI*i / cards.size()));
            card.yPos = ((maxHeight - Y_OFFSET)/2) + (int) (radius * Math.cos(2*Math.PI*i / cards.size()));
        }
    }

    public boolean canUse(GuiCard card){

        if(cards.size()==1)
            return true;

        int randomIndex = new Random().nextInt(cards.size());
        return card.index == randomIndex;
    }

    public static class RouletteCard extends GuiCard{
        RouletteSylladexScreen gui;

        public RouletteCard(ItemStack item, RouletteSylladexScreen gui, int index, int xPos, int yPos){
            super(item, gui, index, xPos, yPos);
            this.gui = gui;
        }

        @Override
        public void onClick(int mouseButton){
            if(gui.canUse(this) || mouseButton==2)
                super.onClick(mouseButton);
        }
    }

}
