package de.felixstaude.betterLobby.inventorys.setup.startMenu;

import de.felixstaude.betterLobby.BetterLobby;
import de.felixstaude.betterLobby.config.ConfigReader;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class SetupStartInventoryItems {

    BetterLobby plugin = BetterLobby.getPlugin(BetterLobby.class);
    ConfigReader configReader = new ConfigReader();

    private final NamespacedKey key = new NamespacedKey(plugin, plugin.getGlobalConfigPrefix() + "item identifier");
    private final String prefix = plugin.getGlobalConfigPrefix() + "SetupInventory - ";

    public ItemStack createNewItemItem(){
        ItemStack itemStack = new ItemStack(Material.PAPER);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString("SetupInventory.item.create_new_item")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, prefix + "create new item");

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public ItemStack editExistingItemItem(){
        ItemStack itemStack = new ItemStack(Material.DIAMOND);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString("SetupInventory.item.edit_existing_item")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, prefix + "edit existing item");

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public ItemStack cancelItem(){
        ItemStack itemStack = new ItemStack(Material.BARRIER);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString("SetupInventory.item.cancel")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING,prefix + "cancel");

        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
