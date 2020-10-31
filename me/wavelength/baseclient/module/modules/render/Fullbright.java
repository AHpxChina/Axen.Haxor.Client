////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Axen.Dev.Team
////////////////////////////////////////////////////////////////////////////////

package me.wavelength.baseclient.module.modules.render;

import me.wavelength.baseclient.event.events.UpdateEvent;
import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;

public class Fullbright extends Module {

    public Fullbright() {
        super("Fullbright", "Clear eyes in dark night", 0, Category.RENDER);
    }

    @Override
    public void onUpdate(UpdateEvent event) {
        mc.gameSettings.gammaSetting = 100;
    }

    @Override
    public void onDisable() {
        mc.gameSettings.gammaSetting = 0.5f;
    }
}
