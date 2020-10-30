package me.wavelength.baseclient.module.modules.movement;

import me.wavelength.baseclient.event.events.UpdateEvent;
import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;

public class Step extends Module {
    public Step() {
        super("Step", "Step on a block instantly", 0, Category.MOVEMENT, AntiCheat.VANILLA);
    }

    @Override
    public void setup() {
        moduleSettings.addDefault("Height", 1F);
    }

    @Override
    public void onUpdate(UpdateEvent event) {
        mc.thePlayer.stepHeight = moduleSettings.getFloat("Height");
    }
}
