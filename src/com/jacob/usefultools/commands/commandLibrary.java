package com.jacob.usefultools.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandLibrary implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) { return true; } // Checks to see if player is running command
        Player player = (Player) sender;

        // /help
        if (cmd.getName().equalsIgnoreCase("help")) {
            player.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + ">> " + ChatColor.GREEN + "UsefulTools" + ChatColor.DARK_GRAY + "" + ChatColor.BOLD + " <<");
            player.sendMessage(ChatColor.RED + "/help " + ChatColor.GRAY + "Displays the help menu");
            player.sendMessage(ChatColor.RED + "/gm(s,c,a) " + ChatColor.GRAY + " Change your gamemode quickly to (survival,creative, or adventure)");
        }

        // /gmc
        if (cmd.getName().equalsIgnoreCase("gmc")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + ">> " + ChatColor.GREEN + "Your gamemode has been set to creative");
        }

        // /gms
        if (cmd.getName().equalsIgnoreCase("gms")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + ">> " + ChatColor.GREEN + "Your gamemode has been set to survival");
        }

        // /gma
        if (cmd.getName().equalsIgnoreCase("gma")) {
            player.setGameMode(GameMode.ADVENTURE);
            player.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + ">> " + ChatColor.GREEN + "Your gamemode has been set to adventure");
        }
        return true;
    }
}
