////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Axen.Dev.Team
////////////////////////////////////////////////////////////////////////////////

package me.wavelength.baseclient.module.modules.movement;

import me.wavelength.baseclient.event.events.UpdateEvent;
import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;

public class AutoWalk extends Module {
    public AutoWalk() {
        super("AutoWalk", "Auto walk forward", 0, Category.MOVEMENT);
    }

    @Override
    public void setup() {
        moduleSettings.addDefault("Swimming", true);
    }

    @Override
    public void onDisable() {
        mc.gameSettings.keyBindForward.setPressed(false);
    }

    @Override
    public void onUpdate(UpdateEvent event) {
        mc.gameSettings.keyBindForward.setPressed(true);

        if (moduleSettings.getBoolean("Swimming")){
            mc.gameSettings.keyBindJump.setPressed(mc.thePlayer.isInWater());
        }
    }
}
