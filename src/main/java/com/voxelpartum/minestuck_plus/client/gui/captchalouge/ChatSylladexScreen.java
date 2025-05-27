package com.voxelpartum.minestuck_plus.client.gui.captchalouge;

import com.mraof.minestuck.client.gui.captchalouge.SylladexScreen;
import com.mraof.minestuck.inventory.captchalogue.Modus;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class ChatSylladexScreen extends SylladexScreen {

    private Modus modus;

    public ChatSylladexScreen(Modus modus)
    {
        super();
        this.modus = modus;
        this.textureIndex = 1;
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
        this.cards.clear();
        this.maxWidth = Math.max(mapWidth, 10 + (stacks.size()*CARD_WIDTH + (stacks.size() - 1)*5));
        this.maxHeight = mapHeight;
        super.updateContent();
        int start = Math.max(5, (this.mapWidth - (stacks.size() * 21 + (stacks.size() - 1) * 5)) / 2);

        for(int i = 0; i < stacks.size(); ++i) {
            this.cards.add(new GuiCard(stacks.get(i), this, -1,
                    start + i * 26,
                    (this.mapHeight - 26) / 2));
        }

    }

    @Override
    public void updatePosition()
    {
        int columns = (cards.size() + 1)/2;
        this.maxWidth = Math.max(mapWidth, 10 + (columns*CARD_WIDTH + (columns - 1)*5));
        this.maxHeight = mapHeight;

        int start = Math.max(5, (mapWidth - (columns*CARD_WIDTH + (columns - 1)*5))/2);
        for(int i = 0; i < cards.size(); i++)
        {
            GuiCard card = cards.get(i);
            card.xPos = start + i/2*(CARD_WIDTH + 5);
            card.yPos = (mapHeight - 2*CARD_HEIGHT - 5)/2 + (i%2)*(CARD_HEIGHT + 5);
        }
    }

    private class ChatCard extends GuiCard{
        public ChatCard(ItemStack item, ChatSylladexScreen gui, int i, int i1, int i2){
            super(item, gui, i,i1,i2);
        }

        @Override
        public void onClick(int mouseButton){
            if(mouseButton!=0){
                super.onClick(mouseButton);
            }
        }
    }

}
