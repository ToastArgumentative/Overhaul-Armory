package toast.pine.overhaularmory.Weapons;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import toast.pine.overhaularmory.OverhaulArmory;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class Bows {


    private Bows(OverhaulArmory plugin) {
        OverhaulArmory.plugin = plugin;
    }

    public static ItemStack HomingArrowBow() {
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setCustomModelData(1);
        bowMeta.setDisplayName(ChatColor.DARK_AQUA + "Homing Arrow Bow");
        bowMeta.setUnbreakable(plugin.getConfig().getBoolean("Bows.HomingArrowBow.Unbreakable"));
        bowMeta.setLore(plugin.getConfig().getStringList("Bows.HomingArrowBow.Lore"));
        bow.setItemMeta(bowMeta);
        return bow;
    }

    public static void HomingArrowBowRecipe() {
        ShapedRecipe HomingArrowBow = new ShapedRecipe(new ItemStack(HomingArrowBow()));
        HomingArrowBow.shape("SsN", "SRs", "SsN");
        HomingArrowBow.setIngredient('S', Material.STICK);
        HomingArrowBow.setIngredient('s', Material.STRING);
        HomingArrowBow.setIngredient('R', Material.FIREWORK_ROCKET);
        HomingArrowBow.setIngredient('N', Material.NETHER_STAR);
        Bukkit.addRecipe(HomingArrowBow);
    }




}
