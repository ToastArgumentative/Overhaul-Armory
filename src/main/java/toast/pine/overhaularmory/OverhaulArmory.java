package toast.pine.overhaularmory;


import org.bukkit.Bukkit;
import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import toast.pine.overhaularmory.Armor.InfusedArmor;
import toast.pine.overhaularmory.Armor.Upgrades.UpgradeSlateWorker;
import toast.pine.overhaularmory.Materials.InfusedResources;
import toast.pine.overhaularmory.Materials.UpgradeSlate;
import toast.pine.overhaularmory.Raiding.RecipeAlter.EndCrystalRecipe;
import toast.pine.overhaularmory.Raiding.RecipeAlter.TNTRecipe;
import toast.pine.overhaularmory.Utils.CooldownManager;
import toast.pine.overhaularmory.Utils.onPlayerJoin;
import toast.pine.overhaularmory.Weapons.Abilities.BackerSword;
import toast.pine.overhaularmory.Weapons.Abilities.BeeWithMeSword;
import toast.pine.overhaularmory.Weapons.Abilities.EnderMiteSword;
import toast.pine.overhaularmory.Weapons.Abilities.HomingArrow;
import toast.pine.overhaularmory.Weapons.Bows;
import toast.pine.overhaularmory.Weapons.Swords;

public final class OverhaulArmory extends JavaPlugin {

    public static OverhaulArmory plugin;

    CooldownManager cooldownManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        cooldownManager = new CooldownManager();



        // Enabling Weapons
        if(plugin.getConfig().getBoolean("Bows.HomingArrowBow.Enabled")){
            Bows.HomingArrowBowRecipe();
            plugin.getServer().getPluginManager().registerEvents(new HomingArrow(), plugin);
        }

        if(plugin.getConfig().getBoolean("Swords.Knife.Enabled")){
            Swords.KnifeRecipe();
        }

        if(plugin.getConfig().getBoolean("Swords.EnderMiteSword.Enabled")){
            Swords.enderMiteSwordRecipe();
            plugin.getServer().getPluginManager().registerEvents(new EnderMiteSword(), plugin);
        }

        if(plugin.getConfig().getBoolean("Swords.BeeWithMe.Enabled")){
            Swords.beeWithMeRecipe();
            plugin.getServer().getPluginManager().registerEvents(new BeeWithMeSword(), plugin);
        }

        if(plugin.getConfig().getBoolean("Swords.Backer.Enabled")){
            Swords.backerSwordRecipe();
            plugin.getServer().getPluginManager().registerEvents(new BackerSword(plugin), plugin);
        }

        // Replace TNT recipe
        if(plugin.getConfig().getBoolean("Recipes.TNT.RemoveDefaultRecipe")) {
            for (Recipe recipe : Bukkit.getRecipesFor(new ItemStack(Material.TNT))) {
                if (recipe instanceof Keyed) {
                    Bukkit.removeRecipe(((Keyed) recipe).getKey());
                }
            }
            TNTRecipe.TNTRecipe();
        }

        // Remove Ender Chests
        if(plugin.getConfig().getBoolean("Recipes.EnderChest.RemoveDefaultRecipe")) {
            for (Recipe recipe : Bukkit.getRecipesFor(new ItemStack(Material.ENDER_CHEST))) {
                if (recipe instanceof Keyed) {
                    Bukkit.removeRecipe(((Keyed) recipe).getKey());
                }
            }
        }

        // Replace End Crystal recipe
        if(plugin.getConfig().getBoolean("Recipes.EndCrystal.RemoveDefaultRecipe")) {
            for (Recipe recipe : Bukkit.getRecipesFor(new ItemStack(Material.END_CRYSTAL))) {
                if (recipe instanceof Keyed) {
                    Bukkit.removeRecipe(((Keyed) recipe).getKey());
                }
            }
            EndCrystalRecipe.EndCrystalRecipe();
        }


        if(plugin.getConfig().getBoolean("UpgradeSlates.Enabled")){
            UpgradeSlate.UpgradeSlateRecipe();
            plugin.getServer().getPluginManager().registerEvents(new UpgradeSlateWorker(), plugin);
        }

        // Enabling Infused Materials
        if(plugin.getConfig().getBoolean("Materials.Enabled")){
            InfusedResources.InfusedNetheriteRecipe();
            InfusedResources.InfusedEmeraldRecipe();
            InfusedResources.InfusedDiamondRecipe();
            InfusedResources.InfusedIronRecipe();
            InfusedResources.InfusedGoldRecipe();
        }

        if(plugin.getConfig().getBoolean("Armor.Enabled")) {
            if (plugin.getConfig().getBoolean("Materials.Enabled")) {
                // Infused Netherite Armor
                InfusedArmor.InfusedNetheriteHelmetRecipe();
                InfusedArmor.InfusedNetheriteChestplateRecipe();
                InfusedArmor.InfusedNetheriteLeggingsRecipe();
                InfusedArmor.InfusedNetheriteBootsRecipe();

                // Infused Emerald Armor
                InfusedArmor.InfusedEmeraldHelmetRecipe();
                InfusedArmor.InfusedEmeraldChestplateRecipe();
                InfusedArmor.InfusedEmeraldLeggingsRecipe();
                InfusedArmor.InfusedEmeraldBootsRecipe();

                // Infused Diamond Armor
                InfusedArmor.InfusedDiamondHelmetRecipe();
                InfusedArmor.InfusedDiamondChestplateRecipe();
                InfusedArmor.InfusedDiamondLeggingsRecipe();
                InfusedArmor.InfusedDiamondBootsRecipe();

                // Infused Iron Armor
                InfusedArmor.InfusedIronHelmetRecipe();
                InfusedArmor.InfusedIronChestplateRecipe();
                InfusedArmor.InfusedIronLeggingsRecipe();
                InfusedArmor.InfusedIronBootsRecipe();

                // Infused Gold Armor
                InfusedArmor.InfusedGoldHelmetRecipe();
                InfusedArmor.InfusedGoldChestplateRecipe();
                InfusedArmor.InfusedGoldLeggingsRecipe();
                InfusedArmor.InfusedGoldBootsRecipe();

            } else {
                Bukkit.getLogger().info("""
                        -----------------------------------
                        Materials not enabled!
                        
                        Please enable Materials in the
                        configuration file to use the Armors
                        -----------------------------------
                       """);
            }
        }

        // Every 5 minutes, bee's with the name "Bee With Me" will be removed
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
            for (World world : Bukkit.getWorlds()) {
                for (Entity entity : world.getEntities()) {
                    if (entity instanceof Bee) {
                        if (entity.getCustomName() != null) {
                            if (entity.getCustomName().equals("Bee With Me")) {
                                entity.remove();
                            }
                        }
                    }
                }
            }
        }, 0L, 6000L);



        plugin.getServer().getPluginManager().registerEvents(new onPlayerJoin(), plugin);

        Plugin OverhaulMonsters = plugin.getServer().getPluginManager().getPlugin("OverhaulMonsters");
        Plugin OverhaulSystems = plugin.getServer().getPluginManager().getPlugin("Overhaul-Systems");

        if (OverhaulMonsters == null || OverhaulSystems == null) {
            Bukkit.getLogger().info("""
                    
              [ Overhaul Armory ]  -----------------------------------
              [ Overhaul Armory ]  OverhaulMonsters not found!
                
              [ Overhaul Armory ]  and/or
               
              [ Overhaul Armory ]  OverhaulSystems not found!
                
              [ Overhaul Armory ]  Please install OverhaulSystems \s
              [ Overhaul Armory ]  and/or OverhaulMonsters in order
              [ Overhaul Armory ]  to use this plugin.
              [ Overhaul Armory ]  -----------------------------------
                """);
            Bukkit.getPluginManager().disablePlugin(this);
        } else {
            Bukkit.getLogger().info("""
                
               [ Overhaul Armory ] -----------------------------------
               [ Overhaul Armory ] OverhaulWeapons has been enabled!
                
               [ Overhaul Armory ] Please check the configuration file
               [ Overhaul Armory ] for more information on how to
               [ Overhaul Armory ] customize your experience.
               [ Overhaul Armory ] -----------------------------------
               """);

        }

    }


    public CooldownManager getCooldownManager() {
        return cooldownManager;
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
