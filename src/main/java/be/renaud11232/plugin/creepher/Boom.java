package be.renaud11232.plugin.creepher;

import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import java.util.Random;

public class Boom implements Runnable {

    private final Player player;
    private final Random random;

    public Boom(Player player) {
        this.player = player;
        this.random = new Random();
    }

    @Override
    public void run() {
        double force = 0.7;
        double angle1 = Math.toRadians((random.nextDouble() * 180) - 90);
        double angle2 = Math.toRadians(random.nextDouble() * 360);
        double x = force * Math.sin(angle1) * Math.cos(angle2);
        double y = force * Math.cos(angle1);
        double z = force * Math.sin(angle1) * Math.sin(angle2);
        player.playSound(player, Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
        player.spawnParticle(Particle.EXPLOSION_HUGE, player.getEyeLocation(), 1);
        player.playSound(player, Sound.ENTITY_PLAYER_HURT, 1, 1);
        player.setVelocity(new Vector(x, y, z));
    }
}
