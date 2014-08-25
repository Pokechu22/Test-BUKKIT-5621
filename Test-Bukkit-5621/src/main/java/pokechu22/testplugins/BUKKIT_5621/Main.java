package pokechu22.testplugins.BUKKIT_5621;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("Starting tests for BUKKIT-5621 - Please have a player join.");
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onLogin(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("[BUKKIT-5621 TESTS]: Use the given items to preform tests.");
        
        player.getInventory().clear();
        
        //TODO: Add these tests, each an item with a different name.
    }
    
    @EventHandler
    public void onItemToss(PlayerDropItemEvent event) {
        
    }
}
