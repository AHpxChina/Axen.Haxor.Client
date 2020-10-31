////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Axen.Dev.Team
////////////////////////////////////////////////////////////////////////////////

package me.wavelength.baseclient.module.modules.Player;

import me.wavelength.baseclient.event.events.UpdateEvent;
import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;
import net.minecraft.network.play.client.C03PacketPlayer;

public class Nofall extends Module {

    public Nofall() {
        super("Nofall", "No fall down damage", 0, Category.PLAYER, AntiCheat.VANILLA);
    }

    @Override
    public void onUpdate(UpdateEvent event) {
        if (mc.thePlayer.fallDistance > 2F){
            mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
        }
    }
}
