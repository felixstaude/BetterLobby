package de.felixstaude.betterLobby;

import de.felixstaude.betterLobby.configuration.NavigatorInventoryConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        loadDefaultConfigs();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void loadDefaultConfigs(){
        new NavigatorInventoryConfig().loadDefaultConfig();
    }
}
