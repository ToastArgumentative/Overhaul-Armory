package toast.pine.overhaularmory.Raiding.RecipeAlter;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class EndCrystalRecipe {

    public static void EndCrystalRecipe() {
        ShapedRecipe EndCrystal = new ShapedRecipe(new ItemStack(Material.END_CRYSTAL));
        EndCrystal.shape("GGG", "GNG", "OgO");
        EndCrystal.setIngredient('G', Material.GLASS);
        EndCrystal.setIngredient('N', Material.NETHER_STAR);
        EndCrystal.setIngredient('O', Material.OBSIDIAN);
        EndCrystal.setIngredient('g', Material.GHAST_TEAR);
        Bukkit.addRecipe(EndCrystal);
    }

}
