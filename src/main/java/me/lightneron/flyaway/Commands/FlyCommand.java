package me.lightneron.flyaway.Commands;

import dev.jorel.commandapi.CommandAPICommand;
import me.lightneron.flyaway.ConfigValues;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FlyCommand {
    ConfigValues values = new ConfigValues();
    public void fly() {
        new CommandAPICommand("fly")
                .executesPlayer((player, commandArguments) -> {
                    ItemStack chestplate = player.getInventory().getChestplate();
                    if (player.hasPermission("flyaway.use")) {
                        if (!(chestplate == null || chestplate.getType() != Material.ELYTRA) || player.hasPermission("flyaway.bypass")) {
                            if (!player.getAllowFlight()) {
                                player.setAllowFlight(true);
                                player.setFlying(true);
                                player.sendMessage(MiniMessage.miniMessage().deserialize(values.FlyPrefix() + " " + values.FlyOn()));
                            } else {
                                player.setAllowFlight(false);
                                player.setFlying(false);
                                player.sendMessage(MiniMessage.miniMessage().deserialize(values.FlyPrefix() + " " + values.FlyOff()));
                            }
                        } else {
                            player.sendMessage(MiniMessage.miniMessage().deserialize(values.FlyPrefix() + " " + values.NoElytra()));
                        }
                    } else {
                        player.sendMessage(MiniMessage.miniMessage().deserialize(values.FlyPrefix() + " " + values.FlyNoPermission()));

                    }
                })
                .register();
    }
}
