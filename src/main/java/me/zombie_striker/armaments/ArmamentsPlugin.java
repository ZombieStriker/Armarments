package me.zombie_striker.armaments;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArmamentsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        new Armaments(this);
        Bukkit.getPluginManager().registerEvents(new ArmamentsListener(this),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
