package de.felixstaude.betterLobby.inventorys.setup.startMenu;

import de.felixstaude.betterLobby.BetterLobby;
import de.felixstaude.betterLobby.config.ConfigReader;
import de.felixstaude.betterLobby.inventorys.util.InventoryUtil;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class SetupStartInventory implements InventoryHolder {

    public final Inventory inventory;
    ConfigReader configReader = new ConfigReader();
    SetupStartInventoryItems items = new SetupStartInventoryItems();

    public SetupStartInventory(BetterLobby plugin){
        this.inventory = plugin.getServer().createInventory(
                        this,
                        InventoryType.HOPPER,
                        Component.text(configReader.getConfigString(
                                "SetupInventory.inventory_title.create_or_edit")));

        inventory.setItem(0, items.createNewItemItem());
        inventory.setItem(2, items.editExistingItemItem());
        inventory.setItem(4, items.cancelItem());

        new InventoryUtil().fillWithDefaultItem(inventory);
    }

    @Override
    public @NotNull Inventory getInventory(){
        return this.inventory;
    }

    public void openInventory(Player player){

        player.openInventory(inventory);
    }


}

/*
TODO:
    setup inventory:
        > create new item or edit existing one
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