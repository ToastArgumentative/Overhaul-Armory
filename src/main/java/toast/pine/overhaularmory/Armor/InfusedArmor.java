package toast.pine.overhaularmory.Armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import toast.pine.overhaularmory.Materials.InfusedResources;

import java.util.UUID;

import static toast.pine.overhaularmory.OverhaulArmory.plugin;

public class InfusedArmor {
/*
Infused Netherite Armor ItemStacks
 */
    public static ItemStack InfusedNetheriteHelmet() {
        ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setCustomModelData(1000);
        helmetMeta.setDisplayName(ChatColor.RED + "Infused Netherite Helmet");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedNetherite.Helmet.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedNetherite.Helmet.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedNetherite.Helmet.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedNetherite.Helmet.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Helmet.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedNetherite.Helmet.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Helmet.AttackSpeed");

        helmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.max_health", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armor_toughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockback_resistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movement_speed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attack_damage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attack_speed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));

        helmet.setItemMeta(helmetMeta);
        return helmet;
    }

    public static ItemStack InfusedNetheriteChestplate() {
        ItemStack chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemMeta chestplateMeta = chestplate.getItemMeta();
        chestplateMeta.setCustomModelData(1001);
        chestplateMeta.setDisplayName(ChatColor.RED + "Infused Netherite Chestplate");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedNetherite.Chestplate.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedNetherite.Chestplate.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedNetherite.Chestplate.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedNetherite.Chestplate.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Chestplate.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedNetherite.Chestplate.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Chestplate.AttackSpeed");

        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));

        chestplate.setItemMeta(chestplateMeta);
        return chestplate;

    }

    public static ItemStack InfusedNetheriteLeggings() {
        ItemStack leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setCustomModelData(1002);
        leggingsMeta.setDisplayName(ChatColor.RED + "Infused Netherite Leggings");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedNetherite.Leggings.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedNetherite.Leggings.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedNetherite.Leggings.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedNetherite.Leggings.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Leggings.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedNetherite.Leggings.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Leggings.AttackSpeed");

        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));

        leggings.setItemMeta(leggingsMeta);
        return leggings;

    }

    public static ItemStack InfusedNetheriteBoots() {
        ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setCustomModelData(1003);
        bootsMeta.setDisplayName(ChatColor.RED + "Infused Netherite Boots");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedNetherite.Boots.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedNetherite.Boots.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedNetherite.Boots.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedNetherite.Boots.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Boots.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedNetherite.Boots.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedNetherite.Boots.AttackSpeed");

        bootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));

        boots.setItemMeta(bootsMeta);
        return boots;
    }

/*
Recipe Creation for Infused Netherite Armor
 */


    public static void InfusedNetheriteHelmetRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedNetheriteHelmet"), InfusedNetheriteHelmet());
        recipe.shape("NNN", "N N", "   ");
        recipe.setIngredient('N', new RecipeChoice.ExactChoice(InfusedResources.InfusedNetherite()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedNetheriteChestplateRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedNetheriteChestplate"), InfusedNetheriteChestplate());
        recipe.shape("N N", "NNN", "NNN");
        recipe.setIngredient('N', new RecipeChoice.ExactChoice(InfusedResources.InfusedNetherite()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedNetheriteLeggingsRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedNetheriteLeggings"), InfusedNetheriteLeggings());
        recipe.shape("NNN", "N N", "N N");
        recipe.setIngredient('N', new RecipeChoice.ExactChoice(InfusedResources.InfusedNetherite()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedNetheriteBootsRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedNetheriteBoots"), InfusedNetheriteBoots());
        recipe.shape("   ", "N N", "N N");
        recipe.setIngredient('N', new RecipeChoice.ExactChoice(InfusedResources.InfusedNetherite()));
        Bukkit.addRecipe(recipe);
    }




    /*
    Infused Emerald Armor
     */

    public static ItemStack InfusedEmeraldHelmet() {
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setCustomModelData(1004);
        helmetMeta.setDisplayName(ChatColor.GREEN + "Infused Emerald Helmet");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedEmerald.Helmet.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedEmerald.Helmet.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedEmerald.Helmet.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedEmerald.Helmet.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Helmet.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedEmerald.Helmet.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Helmet.AttackSpeed");

        helmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));

        helmet.setItemMeta(helmetMeta);
        return helmet;
    }

    public static ItemStack InfusedEmeraldChestplate() {
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestplateMeta = chestplate.getItemMeta();
        chestplateMeta.setCustomModelData(1005);
        chestplateMeta.setDisplayName(ChatColor.GREEN + "Infused Emerald Chestplate");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedEmerald.Chestplate.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedEmerald.Chestplate.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedEmerald.Chestplate.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedEmerald.Chestplate.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Chestplate.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedEmerald.Chestplate.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Chestplate.AttackSpeed");

        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));

        chestplate.setItemMeta(chestplateMeta);
        return chestplate;
    }

    public static ItemStack InfusedEmeraldLeggings() {
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setCustomModelData(1006);
        leggingsMeta.setDisplayName(ChatColor.GREEN + "Infused Emerald Leggings");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedEmerald.Leggings.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedEmerald.Leggings.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedEmerald.Leggings.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedEmerald.Leggings.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Leggings.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedEmerald.Leggings.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Leggings.AttackSpeed");

        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));

        leggings.setItemMeta(leggingsMeta);
        return leggings;
    }

    public static ItemStack InfusedEmeraldBoots() {
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setCustomModelData(1007);
        bootsMeta.setDisplayName(ChatColor.GREEN + "Infused Emerald Boots");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedEmerald.Boots.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedEmerald.Boots.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedEmerald.Boots.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedEmerald.Boots.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Boots.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedEmerald.Boots.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedEmerald.Boots.AttackSpeed");

        bootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));

        boots.setItemMeta(bootsMeta);
        return boots;
    }


    /*
    Recipe Creation for Infused Emerald Armor
     */


    public static void InfusedEmeraldHelmetRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedEmeraldHelmet"), InfusedEmeraldHelmet());
        recipe.shape("EEE", "E E", "   ");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(InfusedResources.InfusedEmerald()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedEmeraldChestplateRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedEmeraldChestplate"), InfusedEmeraldChestplate());
        recipe.shape("E E", "EEE", "EEE");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(InfusedResources.InfusedEmerald()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedEmeraldLeggingsRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedEmeraldLeggings"), InfusedEmeraldLeggings());
        recipe.shape("EEE", "E E", "E E");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(InfusedResources.InfusedEmerald()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedEmeraldBootsRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedEmeraldBoots"), InfusedEmeraldBoots());
        recipe.shape("   ", "E E", "E E");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(InfusedResources.InfusedEmerald()));
        Bukkit.addRecipe(recipe);
    }



    /*
    Infused Diamond Armor
     */

    public static ItemStack InfusedDiamondHelmet() {
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setCustomModelData(1008);
        helmetMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Diamond Helmet");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedDiamond.Helmet.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedDiamond.Helmet.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedDiamond.Helmet.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedDiamond.Helmet.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Helmet.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedDiamond.Helmet.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Helmet.AttackSpeed");

        helmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));

        helmet.setItemMeta(helmetMeta);
        return helmet;
    }

    public static ItemStack InfusedDiamondChestplate() {
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestplateMeta = chestplate.getItemMeta();
        chestplateMeta.setCustomModelData(1009);
        chestplateMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Diamond Chestplate");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedDiamond.Chestplate.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedDiamond.Chestplate.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedDiamond.Chestplate.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedDiamond.Chestplate.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Chestplate.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedDiamond.Chestplate.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Chestplate.AttackSpeed");

        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));

        chestplate.setItemMeta(chestplateMeta);
        return chestplate;
    }

    public static ItemStack InfusedDiamondLeggings() {
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setCustomModelData(1010);
        leggingsMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Diamond Leggings");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedDiamond.Leggings.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedDiamond.Leggings.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedDiamond.Leggings.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedDiamond.Leggings.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Leggings.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedDiamond.Leggings.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Leggings.AttackSpeed");

        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));

        leggings.setItemMeta(leggingsMeta);
        return leggings;
    }

    public static ItemStack InfusedDiamondBoots(){
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setCustomModelData(1011);
        bootsMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Diamond Boots");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedDiamond.Boots.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedDiamond.Boots.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedDiamond.Boots.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedDiamond.Boots.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Boots.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedDiamond.Boots.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedDiamond.Boots.AttackSpeed");

        bootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));

        boots.setItemMeta(bootsMeta);
        return boots;
    }

    /*
    Recipe Creation for Infused Diamond Armor
     */


    public static void InfusedDiamondHelmetRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedDiamondHelmet"), InfusedDiamondHelmet());
        recipe.shape("DDD", "D D", "   ");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(InfusedResources.InfusedDiamond()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedDiamondChestplateRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedDiamondChestplate"), InfusedDiamondChestplate());
        recipe.shape("D D", "DDD", "DDD");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(InfusedResources.InfusedDiamond()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedDiamondLeggingsRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedDiamondLeggings"), InfusedDiamondLeggings());
        recipe.shape("DDD", "D D", "D D");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(InfusedResources.InfusedDiamond()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedDiamondBootsRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedDiamondBoots"), InfusedDiamondBoots());
        recipe.shape("   ", "D D", "D D");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(InfusedResources.InfusedDiamond()));
        Bukkit.addRecipe(recipe);
    }



    /*
    Infused Iron Armor
     */

    public static ItemStack InfusedIronHelmet() {
        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setCustomModelData(1012);
        helmetMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Iron Helmet");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedIron.Helmet.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedIron.Helmet.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedIron.Helmet.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedIron.Helmet.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Helmet.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedIron.Helmet.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Helmet.AttackSpeed");

        helmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));

        helmet.setItemMeta(helmetMeta);
        return helmet;
    }

    public static ItemStack InfusedIronChestplate() {
        ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta chestplateMeta = chestplate.getItemMeta();
        chestplateMeta.setCustomModelData(1013);
        chestplateMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Iron Chestplate");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedIron.Chestplate.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedIron.Chestplate.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedIron.Chestplate.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedIron.Chestplate.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Chestplate.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedIron.Chestplate.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Chestplate.AttackSpeed");

        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));

        chestplate.setItemMeta(chestplateMeta);
        return chestplate;
    }

    public static ItemStack InfusedIronLeggings() {
        ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setCustomModelData(1014);
        leggingsMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Iron Leggings");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedIron.Leggings.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedIron.Leggings.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedIron.Leggings.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedIron.Leggings.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Leggings.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedIron.Leggings.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Leggings.AttackSpeed");

        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));

        leggings.setItemMeta(leggingsMeta);
        return leggings;
    }

    public static ItemStack InfusedIronBoots() {
        ItemStack boots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setCustomModelData(1015);
        bootsMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Iron Boots");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedIron.Boots.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedIron.Boots.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedIron.Boots.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedIron.Boots.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Boots.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedIron.Boots.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedIron.Boots.AttackSpeed");

        bootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));

        boots.setItemMeta(bootsMeta);
        return boots;
    }

    /*
    Infused Iron Recipe
     */

    public static void InfusedIronHelmetRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedIronHelmet"), InfusedIronHelmet());
        recipe.shape("III", "I I", "   ");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(InfusedResources.InfusedIron()));
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void InfusedIronChestplateRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedIronChestplate"), InfusedIronChestplate());
        recipe.shape("I I", "III", "III");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(InfusedResources.InfusedIron()));
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void InfusedIronLeggingsRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedIronLeggings"), InfusedIronLeggings());
        recipe.shape("III", "I I", "I I");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(InfusedResources.InfusedIron()));
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void InfusedIronBootsRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedIronBoots"), InfusedIronBoots());
        recipe.shape("   ", "I I", "I I");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(InfusedResources.InfusedIron()));
        Bukkit.getServer().addRecipe(recipe);
    }


    /*
    Infused Gold Armor
     */

    public static ItemStack InfusedGoldHelmet(){
        ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setCustomModelData(1016);
        helmetMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Gold Helmet");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedGold.Helmet.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedGold.Helmet.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedGold.Helmet.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedGold.Helmet.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Helmet.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedGold.Helmet.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Helmet.AttackSpeed");

        helmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD));

        helmet.setItemMeta(helmetMeta);
        return helmet;
    }

    public static ItemStack InfusedGoldChestplate(){
        ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
        ItemMeta chestplateMeta = chestplate.getItemMeta();
        chestplateMeta.setCustomModelData(1017);
        chestplateMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Gold Chestplate");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedGold.Chestplate.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedGold.Chestplate.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedGold.Chestplate.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedGold.Chestplate.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Chestplate.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedGold.Chestplate.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Chestplate.AttackSpeed");

        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
        chestplateMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));

        chestplate.setItemMeta(chestplateMeta);
        return chestplate;
    }

    public static ItemStack InfusedGoldLeggings(){
        ItemStack leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setCustomModelData(1018);
        leggingsMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Gold Leggings");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedGold.Leggings.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedGold.Leggings.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedGold.Leggings.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedGold.Leggings.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Leggings.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedGold.Leggings.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Leggings.AttackSpeed");

        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));
        leggingsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS));

        leggings.setItemMeta(leggingsMeta);
        return leggings;
    }

    public static ItemStack InfusedGoldBoots() {
        ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setCustomModelData(1019);
        bootsMeta.setDisplayName(ChatColor.DARK_AQUA + "Infused Gold Boots");

        double maxHealth = plugin.getConfig().getDouble("Armor.InfusedGold.Boots.HealthBoost");
        double armor = plugin.getConfig().getDouble("Armor.InfusedGold.Boots.Armor");
        double toughness = plugin.getConfig().getDouble("Armor.InfusedGold.Boots.ArmorToughness");
        double knockbackResistance = plugin.getConfig().getDouble("Armor.InfusedGold.Boots.KnockbackResistance");
        double movementSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Boots.Speed");
        double attackDamage = plugin.getConfig().getDouble("Armor.InfusedGold.Boots.AttackDamage");
        double attackSpeed = plugin.getConfig().getDouble("Armor.InfusedGold.Boots.AttackSpeed");

        bootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armor", armor, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", toughness, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", knockbackResistance, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", movementSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", attackSpeed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));


        boots.setItemMeta(bootsMeta);
        return boots;
    }

    public static void InfusedGoldHelmetRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedGoldHelmet"), InfusedGoldHelmet());
        recipe.shape("GGG", "G G");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(InfusedResources.InfusedGold()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedGoldChestplateRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedGoldChestplate"), InfusedGoldChestplate());
        recipe.shape("G G", "GGG", "GGG");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(InfusedResources.InfusedGold()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedGoldLeggingsRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedGoldLeggings"), InfusedGoldLeggings());
        recipe.shape("GGG", "G G", "G G");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(InfusedResources.InfusedGold()));
        Bukkit.addRecipe(recipe);
    }

    public static void InfusedGoldBootsRecipe(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "InfusedGoldBoots"), InfusedGoldBoots());
        recipe.shape("G G", "G G");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(InfusedResources.InfusedGold()));
        Bukkit.addRecipe(recipe);
    }



}
