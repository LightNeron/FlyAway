package me.lightneron.flyaway.Listeners;

import me.lightneron.flyaway.ConfigValues;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ElytraListener implements Listener {
    ConfigValues values = new ConfigValues();
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemStack chestplate = player.getInventory().getChestplate();
        if (player.hasPermission("flyaway.elytra")) {
            if (!(chestplate == null || chestplate.getType() != Material.ELYTRA)) {
                if (player.getAllowFlight() && !player.getGameMode().equals(GameMode.CREATIVE)) {
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    player.sendMessage(MiniMessage.miniMessage().deserialize(values.FlyPrefix() + " " + values.ElytraFlyOff()));
                }

            }
        }
    }
}
