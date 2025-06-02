package de.felixstaude.betterLobby.configuration;

import de.felixstaude.betterLobby.BetterLobby;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class NavigatorInventoryConfig {

    private final BetterLobby plugin = BetterLobby.getPlugin(BetterLobby.class);
    private final File file = new File(plugin.getDataFolder(), "/inventorys/navigator.yml");
    private final YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

    public void loadDefaultConfig(){

        saveNavigatorInventoryConfig();
    }

    public void saveNavigatorInventoryConfig(){
        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
