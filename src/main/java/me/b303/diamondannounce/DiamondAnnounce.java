package me.b303.diamondannounce;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

public class DiamondAnnounce extends JavaPlugin implements Listener {

	private static DiamondAnnounce instance;

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Material type = event.getBlock().getType();
		if (type == Material.DIAMOND_ORE || type == Material.EMERALD_ORE) {
			getServer().broadcastMessage(String.format("%s just mined some %s", event.getPlayer().getDisplayName(), type.toString().toLowerCase().replace("_", " ")));
		}
	}
}
