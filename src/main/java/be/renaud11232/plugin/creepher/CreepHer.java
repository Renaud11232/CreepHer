package be.renaud11232.plugin.creepher;

import org.bukkit.plugin.java.JavaPlugin;

public final class CreepHer extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getCommand("creepher").setExecutor(new CreepHerCommandExecutor());
    }

    public static CreepHer getInstance() {
        return CreepHer.getPlugin(CreepHer.class);
    }
}
