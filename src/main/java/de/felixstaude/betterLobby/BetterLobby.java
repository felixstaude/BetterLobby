package de.felixstaude.betterLobby;

import de.felixstaude.betterLobby.configuration.NavigatorInventoryConfig;
import de.felixstaude.betterLobby.inventorys.setup.startMenu.SetupStartInventoryHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterLobby extends JavaPlugin {

    public String globalConfigPrefix = "BetterLobby - ";

    @Override
    public void onEnable() {

        loadDefaultConfigs();
        loadEventHandler();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public String getGlobalConfigPrefix(){
        return globalConfigPrefix;
    }

    private void loadEventHandler(){
        getServer().getPluginManager().registerEvents(new SetupStartInventoryHandler(), this);
    }

    private void loadDefaultConfigs(){
        new NavigatorInventoryConfig().loadDefaultConfig();
    }
}
