////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Axen.Dev.Team
////////////////////////////////////////////////////////////////////////////////

package me.wavelength.baseclient.module.modules.world;

import me.wavelength.baseclient.event.events.UpdateEvent;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;

public class FastPlace extends Module {
    public FastPlace() {
        super("FastPlace", "Place blocks fast", 0, Category.WORLD);
    }

    @Override
    public void setup() {
        moduleSettings.addDefault("Delay", 1);
    }

    @Override
    public void onUpdate(UpdateEvent event) {
        mc.rightClickDelayTimer = 0;
    }

    @Override
    public void onDisable() {
        mc.rightClickDelayTimer = 6;
    }
}
