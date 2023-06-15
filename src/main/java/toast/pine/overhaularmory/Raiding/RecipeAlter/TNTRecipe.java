package toast.pine.overhaularmory.Raiding.RecipeAlter;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class TNTRecipe {

    public static void TNTRecipe() {
        ShapedRecipe tnt = new ShapedRecipe(new ItemStack(Material.TNT));
        tnt.shape("idi", "gsg", "idi");
        tnt.setIngredient('i', Material.IRON_INGOT);
        tnt.setIngredient('g', Material.GUNPOWDER);
        tnt.setIngredient('s', Material.SAND);
        tnt.setIngredient('d', Material.DIAMOND);
        Bukkit.addRecipe(tnt);
    }
}
