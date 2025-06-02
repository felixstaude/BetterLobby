package de.felixstaude.betterLobby.inventorys.setup;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.lang.annotation.Annotation;

public class SetupInventoryHandler implements EventHandler {

    @EventHandler(priority = EventPriority.NORMAL)
    public void onInventoryClick(InventoryClickEvent event){
        Inventory inventory = event.getInventory();

        if(!(inventory.getHolder(false) instanceof SetupInventory setupInventory)){
            return;
        }
    }

    @Override
    public EventPriority priority() {
        return null;
    }

    @Override
    public boolean ignoreCancelled() {
        return false;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
