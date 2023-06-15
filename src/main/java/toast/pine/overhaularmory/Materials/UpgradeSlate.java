package toast.pine.overhaularmory.Materials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class UpgradeSlate {

    private static ItemStack UpgradeSlate(){
        ItemStack UpgradeSlate = new ItemStack(Material.GLASS_PANE);
        ItemMeta UpgradeSlateMeta = UpgradeSlate.getItemMeta();
        UpgradeSlateMeta.setDisplayName(ChatColor.GOLD + "Upgrade Slate Health");

        // hide attributes
        UpgradeSlateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        List<String> lore = plugin.getConfig().getStringList("UpgradeSlates.UpgradeSlate.Lore");
        lore.add(ChatColor.AQUA + "+" + plugin.getConfig().getInt("UpgradeSlates.UpgradeSlate.UpgradeValue") + " Max Health");
        lore.add(ChatColor.AQUA + "+" + plugin.getConfig().getInt("UpgradeSlates.UpgradeSlate.UpgradeValue") + " Armor");
        lore.add(ChatColor.AQUA + "+" + plugin.getConfig().getInt("UpgradeSlates.UpgradeSlate.UpgradeValue") + " Damage");
        UpgradeSlateMeta.setLore(lore);
        UpgradeSlate.setItemMeta(UpgradeSlateMeta);
        return UpgradeSlate;

    }

    public static void UpgradeSlateRecipe() {
        ShapedRecipe UpgradeSlateRecipe = new ShapedRecipe(new NamespacedKey(plugin, "UpgradeSlate"), UpgradeSlate());
        UpgradeSlateRecipe.shape("aaa", "aha", "aaa");
        UpgradeSlateRecipe.setIngredient('a', Material.NETHER_STAR);
        UpgradeSlateRecipe.setIngredient('h', Material.ENCHANTED_GOLDEN_APPLE);
        Bukkit.addRecipe(UpgradeSlateRecipe);
    }




}

