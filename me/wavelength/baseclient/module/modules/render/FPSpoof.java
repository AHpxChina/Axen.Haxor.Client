////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Axen.Dev.Team
////////////////////////////////////////////////////////////////////////////////

package me.wavelength.baseclient.module.modules.render;

import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;

public class FPSpoof extends Module {
    public FPSpoof() {
        super("FPSpoof", "Set a fake fps", 0, Category.RENDER);
    }

    @Override
    public void setup() {
        moduleSettings.addDefault("Multiple", 10);
    }
}
