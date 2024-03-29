package love.toad.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathCoords implements Listener {
    @EventHandler
    public void playerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Location playerLocation = player.getLocation();
        String location = String.format("(%1$s, %2$s, %3$s)",
                Math.round(playerLocation.getX()),
                Math.round(playerLocation.getY()),
                Math.round(playerLocation.getZ())
        );
        Bukkit.broadcastMessage(ChatColor.RED + String.format("%1$s died at %2$s in %3$s",
                player.getName(),
                location,
                player.getWorld().getName()
        ));
    }
}

