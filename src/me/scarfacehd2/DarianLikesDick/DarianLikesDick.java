package me.scarfacehd2.DarianLikesDick;

import org.bukkit.plugin.java.JavaPlugin;

public class DarianLikesDick extends JavaPlugin
{

	@Override
	public void onEnable()
	{
		// Inizialize plugin
		loadCommands();
		
		DLDUtil.consoleMSG("info", "Enabled!");
	}
	
	@Override
	public void onDisable()
	{
		DLDUtil.consoleMSG("info", "Disabled!");
	}
	
	private void loadCommands()
	{
		//TODO
	}
}
