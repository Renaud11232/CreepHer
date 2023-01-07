package be.renaud11232.plugin.creepher;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreepHerCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            return false;
        }
        Player player = Bukkit.getPlayer(args[0]);
        if (player == null) {
            return false;
        }
        Bukkit.getScheduler().runTask(CreepHer.getInstance(), new Tssss(player));
        Bukkit.getScheduler().runTaskLater(CreepHer.getInstance(), new Boom(player), 30);
        sender.sendMessage(ChatColor.GREEN + "You just creeped " + player.getName());
        return true;
    }
}
