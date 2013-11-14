package info.crispylipz.cljoinclock;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("CLJoinClock has been enabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        int item = getConfig().getInt("item", 347);
        event.getPlayer().getInventory().addItem(new ItemStack(item));
    }

    @Override
    public void onDisable() {
        getLogger().info("CLJoinClock has been disabled!");
    }


}
