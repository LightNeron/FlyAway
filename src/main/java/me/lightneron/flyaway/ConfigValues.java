package me.lightneron.flyaway;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class ConfigValues {
    public String FlyPrefix() {
        return Objects.requireNonNull(JavaPlugin.getPlugin(FlyAway.class).getConfig().getString("FlyPrefix"));
    }

    public String ElytraFlyOff() {
        return  Objects.requireNonNull(JavaPlugin.getPlugin(FlyAway.class).getConfig().getString("ElytraFlyOff"));
    }

    public String FlyOn() {
      return Objects.requireNonNull(JavaPlugin.getPlugin(FlyAway.class).getConfig().getString("FlyOn"));
    }

    public String FlyOff() {
        return Objects.requireNonNull(JavaPlugin.getPlugin(FlyAway.class).getConfig().getString("FlyOff"));
    }

    public String FlyNoPermission() {
        return Objects.requireNonNull(JavaPlugin.getPlugin(FlyAway.class).getConfig().getString("FlyNoPermission"));
    }

    public String NoElytra() {
        return Objects.requireNonNull(JavaPlugin.getPlugin(FlyAway.class).getConfig().getString("NoElytra"));
    }
}
