package toast.pine.overhaularmory.Weapons.Abilities;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class BeeWithMeSword implements Listener {


    static int numberOfBees = plugin.getConfig().getInt("Swords.BeeWithMe.numberofBeesPerHit");

    @EventHandler
    public static void onHitWithSword(EntityDamageByEntityEvent event){

        Entity entity = event.getEntity();

        if(!(event.getDamager() instanceof Player damager)) return;

        assert damager.getInventory().getItemInMainHand().getItemMeta() != null;
        if(damager.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Bee With Me")){
            damager.sendMessage(ChatColor.GOLD + "You are swarming " + entity.getName() + " with bees!");
            entity.sendMessage(ChatColor.GOLD + "You are being swarmed by bees from " + damager.getName() + "!");
            for (int i = 0; i < numberOfBees; i++){
                Location spawnLocal = damager.getLocation().add(3, 3, 3);

                // get bees in a 50 radius and have them target the entity
                for( Entity entities : damager.getWorld().getNearbyEntities(spawnLocal, 50, 50, 50)){
                    if(entities instanceof Bee bee1){
                        bee1.setTarget((LivingEntity) entity);
                    }
                }

                Bee bee = (Bee) damager.getWorld().spawnEntity(spawnLocal, EntityType.BEE);
                bee.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(50);
                bee.setHealth(50);
                bee.setCustomName("Bee With Me");
                bee.setCustomNameVisible(false);
                bee.setTarget((LivingEntity) entity);
                bee.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(12);
                bee.getAttribute(Attribute.GENERIC_FLYING_SPEED).setBaseValue(4);
                bee.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(2);

            }


        }
    }




}
