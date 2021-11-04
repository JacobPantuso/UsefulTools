package com.jacob.usefultools.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class join implements Listener {

    private static Object ChatMessageType;

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(null);
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + ">> " + ChatColor.GREEN + "Welcome to the server! :)");
    }

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event){
        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        Material block = player.getWorld().getBlockAt(x,y-1,z).getType();
        if (block == Material.STONE) {
            player.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + ">> " + ChatColor.GREEN + "You are standing on Stone!");
        }
    }
}
