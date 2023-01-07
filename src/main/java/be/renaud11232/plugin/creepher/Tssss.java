package be.renaud11232.plugin.creepher;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class Tssss implements Runnable {

    private final Player player;

    public Tssss(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        player.playSound(player, Sound.ENTITY_CREEPER_PRIMED, 1, 1);
    }
}
