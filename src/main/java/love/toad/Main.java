package love.toad;

import love.toad.events.PlayerDeathCoords;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerDeathCoords(), this);
    }
}

