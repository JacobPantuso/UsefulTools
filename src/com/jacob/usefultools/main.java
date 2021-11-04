package com.jacob.usefultools;

import com.jacob.usefultools.commands.commandLibrary;
import com.jacob.usefultools.events.join;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Fired when the server enables the plugin
        commandLibrary commands = new commandLibrary();
        getServer().getPluginManager().registerEvents(new join(), this);
        getCommand("help").setExecutor(commands);
        getCommand("gmc").setExecutor(commands);
        getCommand("gms").setExecutor(commands);
        getCommand("gma").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[UsefulTools]: Plugin loaded with no issues.");
    }
    @Override
    public void onDisable() {
        // Fired when the server stops and disables all plugins
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[UsefulTools]: Plugin disabled.");
    }
}
