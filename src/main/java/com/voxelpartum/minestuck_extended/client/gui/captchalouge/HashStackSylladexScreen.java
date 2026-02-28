package com.voxelpartum.minestuck_extended.client.gui.captchalouge;

import com.mraof.minestuck.MinestuckConfig;
import com.mraof.minestuck.client.gui.captchalouge.SylladexScreen;
import com.mraof.minestuck.inventory.captchalogue.Modus;
import com.mraof.minestuck.network.CaptchaDeckPackets;
import com.voxelpartum.minestuck_extended.inventory.captchalogue.HashStackModus;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.gui.widget.ExtendedButton;
import net.neoforged.neoforge.network.PacketDistributor;

import static com.mraof.minestuck.client.gui.captchalouge.HashMapSylladexScreen.EJECT_BY_CHAT_OFF;
import static com.mraof.minestuck.client.gui.captchalouge.HashMapSylladexScreen.EJECT_BY_CHAT_ON;

public class HashStackSylladexScreen extends SylladexScreen {

    public HashStackModus modus;
    private Button guiButton;

    public HashStackSylladexScreen(Modus modus)
    {
        super();
        this.modus = (HashStackModus) modus;
        this.textureIndex = 4;
    }

    @Override
    public void init()
    {
        super.init();
        guiButton = new ExtendedButton((width - GUI_WIDTH)/2 + 15, (height - GUI_HEIGHT)/2 + 175, 120, 20, Component.empty(), button -> changeSetting());
        addRenderableWidget(guiButton);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float f)
    {
        guiButton.setX((width - GUI_WIDTH)/2 + 15);
        guiButton.setY((height - GUI_HEIGHT)/2 + 175);
        boolean active = MinestuckConfig.SERVER.hashmapChatModusSetting.get() == MinestuckConfig.AvailableOptions.BOTH ? modus.ejectByChat : MinestuckConfig.SERVER.hashmapChatModusSetting.get() == MinestuckConfig.AvailableOptions.ON;
        guiButton.setMessage(Component.translatable(active ? EJECT_BY_CHAT_ON : EJECT_BY_CHAT_OFF));
        guiButton.active = MinestuckConfig.SERVER.hashmapChatModusSetting.get() == MinestuckConfig.AvailableOptions.BOTH;
        super.render(guiGraphics, mouseX, mouseY, f);
    }

    @Override
    public void updateContent()
    {
        NonNullList<ItemStack> stacks = modus.getItems();
        int rows = (int) Math.sqrt(stacks.size());

        this.cards.clear();
        this.maxWidth = Math.max(mapWidth, 10 + (rows*CARD_WIDTH + (rows - 1)*5));
        this.maxHeight = (rows * CARD_HEIGHT * 2);

        int start = mapWidth/3;

        if(modus.getSize() - (rows*rows) != 0)
            this.cards.add(new ModusSizeCard(this, modus.getSize() - (rows*rows), 10, 10));

        for(int x = 0; x < rows; x++){
            for(int y=0; y < rows; y++) {
                this.cards.add(new GuiCard(stacks.get((x*rows)+y), this, x, (start-CARD_WIDTH) + x*(CARD_WIDTH + 5), 3*CARD_HEIGHT/4 + (y*3*CARD_HEIGHT/2) + 5){

                    @Override
                    public void onClick(int mouseButton) {
                        if(this.item != null && mouseButton == 1)
                            PacketDistributor.sendToServer(new CaptchaDeckPackets.GetItem(this.index, true));
                        else
                            super.onClick(mouseButton);
                    }
                });
            }
        }
    }

    @Override
    public void updatePosition() { updateContent(); }

    @Override
    public void drawGuiMap(GuiGraphics guiGraphics, int mouseX, int mouseY)
    {
        super.drawGuiMap(guiGraphics, mouseX, mouseY);
        int start = mapWidth/3;
        int rows = (int) Math.sqrt(cards.size());

        for(int i = 0; i < rows; i++)
        {
            String s = String.valueOf(i);
            int y = (3*CARD_WIDTH/2) - mapY;
            if((y +font.lineHeight + (i*(3*CARD_HEIGHT/2))) > 0 && (y + (i*(3*CARD_HEIGHT/2))) < mapHeight){
                guiGraphics.drawString(font, s, start - (3*CARD_WIDTH/2), y + (i*(3*CARD_HEIGHT/2)), 0x000000, false);
            }
            drawLine(guiGraphics, y + (i*3*CARD_HEIGHT/2) + font.lineHeight/2, rows);

        }
    }

    public void drawLine(GuiGraphics guiGraphics, int y, int rows){
        if(y < mapHeight)
            guiGraphics.fill(((mapWidth/3)-CARD_WIDTH), y, ((mapWidth/3)-CARD_WIDTH) + (rows * CARD_WIDTH), y+1,  0xFF000000);
    }

    @Override
    public ResourceLocation getCardTexture(GuiCard card) {
        return ResourceLocation.fromNamespaceAndPath("minestuck_extended", "textures/gui/icons.png");
    }

    @Override
    public int getCardTextureX(GuiCard card) {
        return CARD_WIDTH * textureIndex;
    }

    @Override
    public int getCardTextureY(GuiCard card) {
        return 0;
    }

    private void changeSetting()
    {
        if(MinestuckConfig.SERVER.hashmapChatModusSetting.get() == MinestuckConfig.AvailableOptions.BOTH)
        {
            modus.ejectByChat = !modus.ejectByChat;
            PacketDistributor.sendToServer(new CaptchaDeckPackets.SetModusParameter((byte) 0, modus.ejectByChat ? 1 : 0));
        }
    }

}
