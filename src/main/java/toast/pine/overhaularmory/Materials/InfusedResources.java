package toast.pine.overhaularmory.Materials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class InfusedResources {


    public static ItemStack InfusedNetherite() {
        ItemStack InfusedNetherite = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta InfusedNetheriteMeta = InfusedNetherite.getItemMeta();
        InfusedNetheriteMeta.setCustomModelData(900);
        InfusedNetheriteMeta.setDisplayName(ChatColor.DARK_RED + "Infused Netherite");
        InfusedNetherite.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
        InfusedNetheriteMeta.setUnbreakable(true);
        InfusedNetherite.setItemMeta(InfusedNetheriteMeta);
        return InfusedNetherite;

    }

    public static ItemStack InfusedEmerald() {
        ItemStack InfusedEmerald = new ItemStack(Material.EMERALD);
        ItemMeta InfusedEmeraldMeta = InfusedEmerald.getItemMeta();
        InfusedEmeraldMeta.setDisplayName(ChatColor.GREEN + "Infused Emerald");
        InfusedEmeraldMeta.setCustomModelData(901);
        InfusedEmerald.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
        InfusedEmeraldMeta.setUnbreakable(true);
        InfusedEmerald.setItemMeta(InfusedEmeraldMeta);
        return InfusedEmerald;

    }

    public static ItemStack InfusedDiamond() {
        ItemStack InfusedDiamond = new ItemStack(Material.DIAMOND);
        ItemMeta InfusedDiamondMeta = InfusedDiamond.getItemMeta();
        InfusedDiamondMeta.setCustomModelData(901);
        InfusedDiamondMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Diamond");
        InfusedDiamond.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
        InfusedDiamondMeta.setUnbreakable(true);
        InfusedDiamond.setItemMeta(InfusedDiamondMeta);
        return InfusedDiamond;
    }

    public static ItemStack InfusedIron() {
        ItemStack InfusedIron = new ItemStack(Material.IRON_INGOT);
        ItemMeta InfusedIronMeta = InfusedIron.getItemMeta();
        InfusedIronMeta.setCustomModelData(902);
        InfusedIronMeta.setDisplayName(ChatColor.WHITE + "Infused Iron");
        InfusedIron.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
        InfusedIronMeta.setUnbreakable(true);
        InfusedIron.setItemMeta(InfusedIronMeta);
        return InfusedIron;
    }

    public static ItemStack InfusedGold() {
        ItemStack InfusedGold = new ItemStack(Material.GOLD_INGOT);
        ItemMeta InfusedGoldMeta = InfusedGold.getItemMeta();
        InfusedGoldMeta.setCustomModelData(903);
        InfusedGoldMeta.setDisplayName(ChatColor.GOLD + "Infused Gold");
        InfusedGold.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
        InfusedGoldMeta.setUnbreakable(true);
        InfusedGold.setItemMeta(InfusedGoldMeta);
        return InfusedGold;
    }


    public static void InfusedNetheriteRecipe() {
        int cookTime = plugin.getConfig().getInt("Materials.InfusedNetherite.CookTime");
        FurnaceRecipe InfusedNetherite = new FurnaceRecipe(new NamespacedKey(plugin, "InfusedNetherite"), new ItemStack(InfusedNetherite()), Material.NETHERITE_INGOT, 6f, cookTime * 20);
        Bukkit.addRecipe(InfusedNetherite);
    }

    public static void InfusedEmeraldRecipe() {
        int cookTime = plugin.getConfig().getInt("Materials.InfusedEmerald.CookTime");
        FurnaceRecipe InfusedEmerald = new FurnaceRecipe(new NamespacedKey(plugin, "InfusedEmerald"), new ItemStack(InfusedEmerald()), Material.EMERALD, 3f, cookTime);
        Bukkit.addRecipe(InfusedEmerald);
    }

    public static void InfusedDiamondRecipe() {
        int cookTime = plugin.getConfig().getInt("Materials.InfusedDiamond.CookTime");
        FurnaceRecipe InfusedDiamond = new FurnaceRecipe(new NamespacedKey(plugin, "InfusedDiamond"), new ItemStack(InfusedDiamond()), Material.DIAMOND, 3f, cookTime * 20);
        Bukkit.addRecipe(InfusedDiamond);
    }

    public static void InfusedIronRecipe() {
        int cookTime = plugin.getConfig().getInt("Materials.InfusedIron.CookTime");
        FurnaceRecipe InfusedIron = new FurnaceRecipe(new NamespacedKey(plugin, "InfusedIron"), new ItemStack(InfusedIron()), Material.IRON_INGOT, 1.5f, cookTime * 20);
        Bukkit.addRecipe(InfusedIron);
    }

    public static void InfusedGoldRecipe() {
        int cookTime = plugin.getConfig().getInt("Materials.InfusedGold.CookTime");
        FurnaceRecipe InfusedGold = new FurnaceRecipe(new NamespacedKey(plugin, "InfusedGold"), new ItemStack(InfusedGold()), Material.GOLD_INGOT, 1f, cookTime * 20);
        Bukkit.addRecipe(InfusedGold);
    }

}
