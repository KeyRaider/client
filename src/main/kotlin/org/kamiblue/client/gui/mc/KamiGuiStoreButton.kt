package org.kamiblue.client.gui.mc

import org.kamiblue.client.module.modules.player.ChestStealer
import org.kamiblue.client.util.Wrapper
import net.minecraft.client.gui.GuiButton

class KamiGuiStoreButton(x: Int, y: Int) :
    GuiButton(420420, x, y, 50, 20, "Store") {
    override fun mouseReleased(mouseX: Int, mouseY: Int) {
        if (ChestStealer.mode == ChestStealer.Mode.MANUAL) {
            ChestStealer.storing = false
            playPressSound(Wrapper.minecraft.soundHandler)
        }
        super.mouseReleased(mouseX, mouseY)
    }
}