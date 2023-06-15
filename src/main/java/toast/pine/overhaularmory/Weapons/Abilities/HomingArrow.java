package toast.pine.overhaularmory.Weapons.Abilities;

import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.List;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class HomingArrow implements Listener {


    @EventHandler
    public void onShoot(EntityShootBowEvent event) {
        Entity arrow = event.getProjectile();
        Player player = (Player) event.getEntity();

        if (event.getEntity() instanceof Player) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getLore() != null || player.getInventory().getItemInOffHand().getItemMeta().getLore() != null) {
                if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Homing Bow") || player.getInventory().getItemInOffHand().getItemMeta().getLore().contains("Homing Bow")) {
                    new BukkitRunnable() {
                        public void run() {
                            if (arrow.isOnGround() || arrow.isDead()) {
                                cancel();
                            } else {
                                int HomingRadius = plugin.getConfig().getInt("Bows.HomingArrowBow.HomingRadius");
                                List<Entity> nearest = arrow.getNearbyEntities(HomingRadius, HomingRadius, HomingRadius);

                                // get the direction the player is looking
                                Location playerLocation = player.getLocation();
                                Vector playerDirection = playerLocation.getDirection();
                                for (Entity target : nearest) {
                                    if (player.hasLineOfSight(target) && target instanceof LivingEntity && !target.isDead() && target != player) {
                                        if (target instanceof Enderman) {
                                            cancel();
                                            return;
                                        }
                                        // check if the entity is in front of the player
                                        Location targetLocation = target.getLocation();
                                        Vector targetDirection = targetLocation.toVector().subtract(playerLocation.toVector()).normalize();
                                        double dot = playerDirection.dot(targetDirection);
                                        if (dot > 0.5) {
                                            arrow.setVelocity(target.getLocation().toVector().subtract(arrow.getLocation().toVector()));
                                            arrow.setVelocity(arrow.getVelocity().multiply(0.75));
                                            arrow.setVelocity(arrow.getVelocity().add(new Vector(0, 0.8, 0)));
                                        }
                                    } else {
                                        cancel();
                                    }
                                }

                            }
                        }
                    }.runTaskTimer(plugin, 0L, 1L);
                } else {
                    return;
                }
            }
        }
    }
}