package de.felixstaude.betterLobby.inventorys.setup;

import de.felixstaude.betterLobby.BetterLobby;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class SetupInventory implements InventoryHolder {

    public final Inventory inventory;

    public SetupInventory(BetterLobby plugin){
        this.inventory = plugin.getServer().createInventory(this, 54);

    }

    @Override
    public Inventory getInventory(){
        return this.inventory;
    }


}

/*
TODO:
    setup inventory:
        o set inventory type
        o chest:
            o amount of rows
                o click on glass pane, marks rows light green, click again to confirm
            o open inventory with the amount of rows filled with light gray stained glass pane
            o click on any item to change, maybe open creative inventory, click on item you want?
            o name item with color codes & functions (how??)
            o set item lore
            o confirm or delete -> hopper inventory
                o left delete (red stained glass pane)
                o middle the item
                o right confirm (light green stained glass pane)
            o next item
            o close inventory to see next confirmation for this inventory
            o data saved in file for this inventory, so every inventory has his own file with data
        o anvil
        o brewsingtand
        o hopper
        o barrel
        o dispenser
        o workbench?
        o beacon? -> for vip shit like speed boost and jump boost
        o others?

 */