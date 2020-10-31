////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Axen.Dev.Team
////////////////////////////////////////////////////////////////////////////////

package me.wavelength.baseclient.module.modules.movement;

import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;

public class SafeWalk extends Module {

    public SafeWalk() {
        super("SafeWalk", "Same as sneaking but now slowdown", 0, Category.MOVEMENT);
    }
}
