package toast.pine.overhaularmory.Armor.Upgrades;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class UpgradeSlateWorker implements Listener {

    @EventHandler
    public void UpgradeSlate(InventoryClickEvent event) {
        assert event.getCursor() != null;
        assert event.getCurrentItem() != null;

        ItemMeta cursor = event.getCursor().getItemMeta();
        ItemMeta clicked = event.getCurrentItem().getItemMeta();
        Player player = (Player) event.getWhoClicked();


        if (cursor == null || clicked == null) { return; }
        if (!clicked.hasAttributeModifiers()) { return; }


        if(event.getAction() == InventoryAction.SWAP_WITH_CURSOR) {

            if (event.getCursor().getAmount() > 1) {
                player.sendMessage(ChatColor.RED + "Please use 1 upgrade slate at a time, DO NOT STACK!");
                event.setCancelled(true);
                return;
            }

            AttributeModifier health = clicked.getAttributeModifiers(Attribute.GENERIC_MAX_HEALTH).iterator().next();
            AttributeModifier armor = clicked.getAttributeModifiers(Attribute.GENERIC_ARMOR).iterator().next();
            AttributeModifier damage = clicked.getAttributeModifiers(Attribute.GENERIC_ATTACK_DAMAGE).iterator().next();

            EquipmentSlot healthSlot = health.getSlot();
            EquipmentSlot armorSlot = armor.getSlot();
            EquipmentSlot attackDamageSlot = damage.getSlot();

            assert healthSlot != null;
            assert armorSlot != null;
            assert attackDamageSlot != null;

            double healthValue = health.getAmount();
            double armorValue = armor.getAmount();
            double damageValue = damage.getAmount();

            double upgradeValue = plugin.getConfig().getInt("UpgradeSlates.UpgradeSlate.UpgradeValue");

            double newHealthValue = healthValue + upgradeValue;
            double newArmorValue = armorValue + upgradeValue;
            double newAttackDamageValue = damageValue + upgradeValue;

            clicked.removeAttributeModifier(Attribute.GENERIC_MAX_HEALTH, health);
            clicked.removeAttributeModifier(Attribute.GENERIC_ARMOR, armor);
            clicked.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

            AttributeModifier newHealth = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", newHealthValue, AttributeModifier.Operation.ADD_NUMBER, healthSlot);
            AttributeModifier newArmor = new AttributeModifier(UUID.randomUUID(), "generic.armor", newArmorValue, AttributeModifier.Operation.ADD_NUMBER, armorSlot);
            AttributeModifier newAttackDamage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", newAttackDamageValue, AttributeModifier.Operation.ADD_NUMBER, attackDamageSlot);

            clicked.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, newHealth);
            clicked.addAttributeModifier(Attribute.GENERIC_ARMOR, newArmor);
            clicked.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, newAttackDamage);

            event.getCurrentItem().setItemMeta(clicked);
            event.setCancelled(true);
            event.setCursor(null);

            player.sendMessage(ChatColor.GREEN + "Successfully upgraded your item!");


            }

    }




}


