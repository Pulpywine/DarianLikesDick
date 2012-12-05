package me.scarfacehd2.DarianLikesDick;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DLDCommandExecutor implements CommandExecutor
{

	@SuppressWarnings("unused")
	private DarianLikesDick plugin;
	
	public DLDCommandExecutor(DarianLikesDick dld) {
		plugin = dld;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String lablel,	String[] args)
	{
		if (command.getName().equalsIgnoreCase("darianlikesdick")) return darianLikesDick(sender);
		else if (command.getName().equalsIgnoreCase("wholikesdick")) return whoLikesDick(sender);
		
		return false;
	}
	
	private boolean darianLikesDick(CommandSender sender)
	{
		sender.sendMessage(ChatColor.GREEN + "You know it's true.");
		return true;
	}
	private boolean whoLikesDick(CommandSender sender)
	{
		sender.sendMessage(ChatColor.BLUE + "Darian does!");
		return true;
		
	}
}
