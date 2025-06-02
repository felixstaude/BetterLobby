package de.felixstaude.betterLobby.config;

public class ConfigReader {

    public String getConfigString(String key){
        if(key.equalsIgnoreCase("SetupInventory.inventory_title.create_or_edit")){
            return "You want to create a new item or edit an existing one?";
        }
        if(key.equalsIgnoreCase("SetupInventory.item.create_new_item")){
            return "Create a new item";
        }
        if(key.equalsIgnoreCase("SetupInventory.inventory_title.select_inventory_type")){
            return "Select Inventory Type";
        }
        return null;
    }
}
