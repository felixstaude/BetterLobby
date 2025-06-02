package de.felixstaude.betterLobby.inventorys.setup.selectInventoryType;

import de.felixstaude.betterLobby.BetterLobby;
import de.felixstaude.betterLobby.config.ConfigReader;
import de.felixstaude.betterLobby.inventorys.util.InventoryUtil;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class SelectInventoryTypeInventory implements InventoryHolder {

    public final Inventory inventory;

    ConfigReader configReader = new ConfigReader();
    BetterLobby plugin = BetterLobby.getPlugin(BetterLobby.class);

    public SelectInventoryTypeInventory(BetterLobby plugin){
        this.inventory = plugin.getServer().createInventory(
                this,
                36,
                Component.text(configReader.getConfigString("SetupInventory.inventory_title.select_inventory_type")));
        new InventoryUtil().fillWithDefaultItem(inventory);
    }

    @Override
    public @NotNull Inventory getInventory(){
        return this.inventory;
    }
}


/* 23
    7
    ----- INFO -----
    9 7
    18 14
    27



 */
