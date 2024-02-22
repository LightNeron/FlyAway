package me.lightneron.flyaway;

import me.lightneron.flyaway.Commands.FlyCommand;
import me.lightneron.flyaway.Listeners.ElytraListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlyAway extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic
        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }
        saveDefaultConfig();
        FlyCommand flyCommand = new FlyCommand();
        flyCommand.fly();
        getServer().getPluginManager().registerEvents(new ElytraListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
