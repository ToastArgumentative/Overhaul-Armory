package toast.pine.overhaularmory.Weapons.Abilities;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.ItemMeta;


import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class EnderMiteSword implements Listener {


    @EventHandler
    public static void onHitwSword(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Player swordHolder)) return;
        if (!(swordHolder.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Endermite Sword"))) return;

        for (Entity entity : event.getEntity().getNearbyEntities(50, 50, 50)){
            if( entity instanceof Endermite endermite){
                endermite.setTarget((LivingEntity) event.getEntity());
            }
        }
    }

    @EventHandler
    public static void onSwordRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Location playerLocation = player.getLocation();
        int endermites = plugin.getConfig().getInt("Swords.EnderMiteSword.numberofEndermites");
        int radius = plugin.getConfig().getInt("Swords.EnderMiteSword.radius");
        ItemMeta mainHand = player.getInventory().getItemInMainHand().getItemMeta();

        if(mainHand == null) return;

        if (!mainHand.getDisplayName().equals(ChatColor.DARK_PURPLE + "Endermite Sword")) return;

        if(!(event.getAction() == Action.RIGHT_CLICK_AIR)) return;


        if(plugin.getCooldownManager().isPlayerOnCooldown(player)) {
            int cooldownTime = plugin.getCooldownManager().getPlayerCooldownTime(player);
            player.sendMessage(ChatColor.RED + "You are on cooldown! " + ChatColor.YELLOW + cooldownTime + ChatColor.RED + " seconds left!");
            return;
        }

        spawnEndermites(playerLocation, endermites, player, radius);
        int cooldownTime = plugin.getConfig().getInt("Swords.EnderMiteSword.cooldown");
        plugin.getCooldownManager().addCooldown(player, cooldownTime);

    }

    private static void spawnEndermites(Location location, int numberofEndermites, Player player, int radius) {

        for (int i = 0; i < numberofEndermites; i++) {
            location.getWorld().spawnEntity(location, EntityType.ENDERMITE);
        }
        player.sendMessage(ChatColor.GREEN + "Endermites have been summoned!");

        for (Entity entity : player.getNearbyEntities(radius, radius, radius)) {
            if (!(entity instanceof Player nearbyPlayer)) return;
            nearbyPlayer.sendMessage(ChatColor.DARK_PURPLE + "Endermites have been summoned! by" + player.getDisplayName() + "!");
            for (Entity endermite : nearbyPlayer.getNearbyEntities(radius, radius, radius)) {
                if (!(endermite instanceof Endermite nearbyEndermite)) return;
                nearbyEndermite.setTarget(nearbyPlayer);
            }
        }

    }



}
