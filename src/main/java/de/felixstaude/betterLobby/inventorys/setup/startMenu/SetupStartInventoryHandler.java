package de.felixstaude.betterLobby.inventorys.setup.startMenu;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class SetupStartInventoryHandler implements Listener {

    SetupStartInventoryItems items = new SetupStartInventoryItems();

    @EventHandler(ignoreCancelled = true)
    public void onInventoryClick(InventoryClickEvent event){
        Inventory inventory = event.getInventory();
        if(!(inventory.getHolder(false) instanceof SetupStartInventory setupInventory)){
            return;
        }
        if(event.getCurrentItem() == null){
            return;
        }

        // create new item
        if(event.getCurrentItem() == items.createNewItemItem()){

        }

        if(event.getCurrentItem() == items.editExistingItemItem()){
            // TODO
            return;
        }

        if(event.getCurrentItem() == items.cancelItem()){
            inventory.close();
        }

    }
}
