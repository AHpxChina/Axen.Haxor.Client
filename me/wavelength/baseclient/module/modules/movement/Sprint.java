////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Axen.Dev.Team
////////////////////////////////////////////////////////////////////////////////

package me.wavelength.baseclient.module.modules.movement;

import me.wavelength.baseclient.event.events.UpdateEvent;
import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", "Auto sprint when you move forward", 0 , Category.MOVEMENT);
    }

    @Override
    public void onUpdate(UpdateEvent event) {
        if (moduleSettings.getBoolean("MultiDir")){
            mc.thePlayer.setSprinting((mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown()
                    || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown()) && !mc.thePlayer.isUsingItem() && !mc.thePlayer.isSneaking());
        }
        else{
            mc.thePlayer.setSprinting(mc.gameSettings.keyBindForward.isKeyDown() && !mc.thePlayer.isUsingItem() && !mc.thePlayer.isSneaking());
        }
    }

    @Override
    public void setup() {
        moduleSettings.addDefault("MultiDir", false);
    }

    @Override
    public void onDisable() {
        super.onDisable();

        mc.thePlayer.setSprinting(false);
    }
}
