package toast.pine.overhaularmory.Utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class onPlayerJoin implements Listener {

    @EventHandler
    public static void onPlayerJoinGame(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (plugin.getConfig().getBoolean("Players.AllowCreatorRoles")) {
            if (player.getName().equals("ToastARG")) {
                player.setPlayerListName(ChatColor.DARK_RED + "[Overhaul Engineer] " + ChatColor.RED + player.getName());
            } else if (player.getName().equals("JuicyQT")) {
                player.setPlayerListName(ChatColor.DARK_RED + "[Overhaul Engineer] " + ChatColor.RED + player.getName());
            } else if (player.getName().equals("SpanglesLUL")) {
                player.setPlayerListName(ChatColor.DARK_BLUE + "[Overhaul World Creator] " + ChatColor.BLUE + player.getName());
            } else {
                player.setPlayerListName(ChatColor.GREEN + "[Human] " + ChatColor.GRAY + player.getName());
            }
        }

        if(event.getPlayer().hasPlayedBefore()){
            event.getPlayer().sendMessage(ChatColor.GREEN + "Welcome back to the server!");
        } else {
            event.getPlayer().sendMessage(ChatColor.GREEN + "Welcome to the server! I recommend you go to the discord server, to figure out what to do.");

            if (plugin.getConfig().getBoolean("Players.HaveAllRecipes")) {
                plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), "recipe give " + event.getPlayer().getName() + " *");
            }
        }
    }
}
