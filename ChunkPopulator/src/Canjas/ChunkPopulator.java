package Canjas;

import org.bukkit.Bukkit;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.plugin.java.JavaPlugin;

public class ChunkPopulator extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListeners(), this);
    }
}