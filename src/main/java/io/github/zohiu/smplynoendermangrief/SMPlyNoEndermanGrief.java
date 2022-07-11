package io.github.zohiu.smplynoendermangrief;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class SMPlyNoEndermanGrief extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new EndermanBlockChange(), this);

        this.getLogger().log(Level.INFO, ChatColor.GREEN + "Enabled.");
    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, ChatColor.RED + "Disabled.");
    }
}
