package toast.pine.overhaularmory.Weapons;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import toast.pine.overhaularmory.OverhaulArmory;

import java.util.List;
import java.util.UUID;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class Swords {



    private Swords(OverhaulArmory plugin) {
        OverhaulArmory.plugin = plugin;
    }




    private static ItemStack Knife(){
        ItemStack knife = new ItemStack(Material.IRON_SWORD);
        ItemMeta knifeMeta = knife.getItemMeta();
        assert knifeMeta != null;
        knifeMeta.setCustomModelData(2);
        knifeMeta.setDisplayName(ChatColor.BOLD + " " + ChatColor.WHITE + "Knife");
        knifeMeta.setUnbreakable(plugin.getConfig().getBoolean("Swords.Knife.Unbreakable"));
        double damage = plugin.getConfig().getDouble("Swords.Knife.Damage");
        List<String> lore = plugin.getConfig().getStringList("Swords.Knife.Lore");

        knifeMeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
        knifeMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", damage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
        if(plugin.getConfig().getBoolean("Swords.Knife.giveSwiftness")){
            lore.add(ChatColor.AQUA + "+" + damage + " Attack Damage" );
            lore.add(ChatColor.AQUA + "+7.5% Movement Speed");
            knifeMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.075, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
            knifeMeta.setLore(lore);
        }
        else if(plugin.getConfig().getBoolean("Swords.Knife.Unbreakable")){
            lore.add(ChatColor.AQUA + "+" + damage + " Attack Damage" );
            lore.add(ChatColor.AQUA + "Unbreakable");

            knifeMeta.setLore(lore);
        }
        else {
            lore.add(ChatColor.AQUA + "+" + damage + " Attack Damage" );
            knifeMeta.setLore(lore);
        }
        knife.setItemMeta(knifeMeta);
        return knife;
    }

    public static void KnifeRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "knife"), Knife());
        recipe.shape("   ", " I ", " S ");
        recipe.setIngredient('I', Material.IRON_BLOCK);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe);
    }



    private static ItemStack enderMiteSword(){
        ItemStack enderMiteSword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta enderMiteSwordMeta = enderMiteSword.getItemMeta();
        assert enderMiteSwordMeta != null;
        enderMiteSwordMeta.setCustomModelData(3);
        enderMiteSwordMeta.setDisplayName(ChatColor.DARK_PURPLE + "Endermite Sword");

        enderMiteSwordMeta.setUnbreakable(plugin.getConfig().getBoolean("Swords.EnderMiteSword.Unbreakable"));

        double damage = plugin.getConfig().getDouble("Swords.EnderMiteSword.Damage");
        List<String> lore = plugin.getConfig().getStringList("Swords.EnderMiteSword.Lore");

        enderMiteSwordMeta.setLore(lore);
        enderMiteSwordMeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
        enderMiteSwordMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", damage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        enderMiteSword.setItemMeta(enderMiteSwordMeta);
        return enderMiteSword;
    }


    public static void enderMiteSwordRecipe() {
        ShapedRecipe recipe = new ShapedRecipe( new NamespacedKey(plugin, "EnderMiteSword"), enderMiteSword());
        recipe.shape(" E ", " E ", " S ");
        recipe.setIngredient('E', Material.ENDER_PEARL);
        recipe.setIngredient('S', Material.DRAGON_EGG);
        Bukkit.addRecipe(recipe);
    }


    private static ItemStack beeWithMe() {
        ItemStack beeWithMe = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta beeWithMeMeta = beeWithMe.getItemMeta();
        assert beeWithMeMeta != null;
        beeWithMeMeta.setCustomModelData(4);

        beeWithMeMeta.setDisplayName(ChatColor.GOLD + "Bee With Me");
        beeWithMeMeta.setUnbreakable(plugin.getConfig().getBoolean("Swords.BeeWithMe.Unbreakable"));

        double damage = plugin.getConfig().getDouble("Swords.BeeWithMe.Damage");
        List<String> lore = plugin.getConfig().getStringList("Swords.BeeWithMe.Lore");

        beeWithMeMeta.setLore(lore);
        beeWithMeMeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
        beeWithMeMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", damage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        beeWithMe.setItemMeta(beeWithMeMeta);
        return beeWithMe;
    }

    public static void beeWithMeRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "BeeWithMe"), beeWithMe());
        recipe.shape("BNB", "BSB", "BNB");
        recipe.setIngredient('B', Material.HONEYCOMB);
        recipe.setIngredient('S', Material.NETHERITE_SWORD);
        recipe.setIngredient('N', Material.NETHER_STAR);
        Bukkit.addRecipe(recipe);
    }


     private static ItemStack backerSword() {
        ItemStack backerSword = new ItemStack(Material.IRON_SWORD);
        ItemMeta backerMeta = backerSword.getItemMeta();

        assert backerMeta != null;
        backerMeta.setCustomModelData(5);
        backerMeta.setDisplayName(ChatColor.RED + "I take It back!");
        backerMeta.setUnbreakable(plugin.getConfig().getBoolean("Swords.Backer.Unbreakable"));

        double damage = plugin.getConfig().getDouble("Swords.Backer.Damage");
        List<String> lore = plugin.getConfig().getStringList("Swords.Backer.Lore");

        backerMeta.setLore(lore);
        backerMeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
        backerMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", damage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        backerSword.setItemMeta(backerMeta);
        return backerSword;

     }

     public static void backerSwordRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "BackerSword"), backerSword());
        recipe.shape(" B ", " B ", " S ");
        recipe.setIngredient('B', Material.ENDER_EYE);
        recipe.setIngredient('S', Material.FERMENTED_SPIDER_EYE);
        Bukkit.addRecipe(recipe);
     }













}
