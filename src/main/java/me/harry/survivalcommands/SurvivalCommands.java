package me.harry.survivalcommands;

import me.harry.survivalcommands.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class SurvivalCommands extends JavaPlugin {

    public void onEnable() {
        getCommand("anvil").setExecutor(new AnvilCommand());
        getCommand("craft").setExecutor(new CraftCommand());
        getCommand("enchantingtable").setExecutor(new EnchantTableCommand());
        getCommand("enderchest").setExecutor(new EnderChestCommand());
        getCommand("furnace").setExecutor(new FurnaceCommand());
        getCommand("smithingtable").setExecutor(new SmithingTableCommand());
        getCommand("smoker").setExecutor(new SmokerCommand());
    }
    public void onDisable() {

    }
}
