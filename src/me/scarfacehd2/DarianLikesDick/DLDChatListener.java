package me.scarfacehd2.DarianLikesDick;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class DLDChatListener implements Listener
{
	@EventHandler (priority = EventPriority.MONITOR)
	public void onChatMessage(AsyncPlayerChatEvent e)
	{
		// Define variables
		Player p = e.getPlayer();

		if (e.getMessage().contains("darian") || e.getMessage().contains("dick")) scarTalk(p,e);
	}

	private void scarTalk(Player p, AsyncPlayerChatEvent e)
	{
		// Set message
		String message = (ChatColor.GRAY + "[A]" + ChatColor.GOLD + "Dad: Darian sucks dick.");
		
		// Broadcast the message
		for (Player player : Bukkit.getOnlinePlayers())	player.sendMessage(message);
	}
}
