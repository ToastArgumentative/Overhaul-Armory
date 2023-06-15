package toast.pine.overhaularmory.Weapons.Abilities;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import toast.pine.overhaularmory.OverhaulArmory;


public class BackerSword implements Listener {
    static OverhaulArmory plugin;

    public BackerSword(OverhaulArmory plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public static void onRightClickOfBacker(PlayerInteractEvent event){
        if(!(event.getAction() == Action.RIGHT_CLICK_AIR)) return;
        if(!(event.getItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Backer Sword"))) return;
        Player player = event.getPlayer();






        if(plugin.getCooldownManager().isPlayerOnCooldown(player)) {
            int cooldownTime = plugin.getCooldownManager().getPlayerCooldownTime(player);
            player.sendMessage(ChatColor.RED + "You are on cooldown! " + ChatColor.YELLOW + cooldownTime + ChatColor.RED + " seconds left!");
        } else {

            int cooldownTime = plugin.getConfig().getInt("Swords.Backer.cooldown");
            plugin.getCooldownManager().addCooldown(player, cooldownTime);
            Location playerLocation = player.getLocation();
            for (int i = 0; i < 7; i++){
                player.getWorld().spawnEntity(playerLocation, EntityType.BAT);
            }

            player.teleport(playerLocation.setDirection(playerLocation.getDirection().multiply(-10)));
            player.sendMessage(ChatColor.GREEN + "You have teleported!");


        }



    }
}
