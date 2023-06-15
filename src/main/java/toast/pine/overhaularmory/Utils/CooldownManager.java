package toast.pine.overhaularmory.Utils;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class CooldownManager {

    private final Map<UUID, Integer> playerCoolDownMap = new HashMap<>();

    public CooldownManager() {
        new BukkitRunnable() {
            @Override
            public void run() {
                for (UUID uuid : playerCoolDownMap.keySet()) {
                    int time = playerCoolDownMap.get(uuid);
                    if (time <= 0) {
                        playerCoolDownMap.remove(uuid);
                    } else {
                        playerCoolDownMap.put(uuid, time - 1);
                    }
                }
            }
        }.runTaskTimer(plugin, 0, 20);
    }



    public void addCooldown(Player player, int time) {
        playerCoolDownMap.put(player.getUniqueId(), time);

    }

    public boolean isPlayerOnCooldown(Player player) {
        return playerCoolDownMap.containsKey(player.getUniqueId());
    }

    public Integer getPlayerCooldownTime(Player player) {
        return playerCoolDownMap.get(player.getUniqueId());
    }


}
