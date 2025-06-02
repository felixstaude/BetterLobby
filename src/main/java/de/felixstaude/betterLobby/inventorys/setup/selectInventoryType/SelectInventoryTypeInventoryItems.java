package de.felixstaude.betterLobby.inventorys.setup.selectInventoryType;

import de.felixstaude.betterLobby.BetterLobby;
import de.felixstaude.betterLobby.config.ConfigReader;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class SelectInventoryTypeInventoryItems {

    BetterLobby plugin = BetterLobby.getPlugin(BetterLobby.class);
    ConfigReader configReader = new ConfigReader();

    private final NamespacedKey key = new NamespacedKey(plugin, plugin.getGlobalConfigPrefix() + "item identifier");
    private final String prefix = plugin.getGlobalConfigPrefix() + "SetupInventory - ";
    private final String dataTypePrefix = "SetupInventory.item.";
    public ItemStack chestItem(){
        ItemStack itemStack = new ItemStack(Material.CHEST);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString(dataTypePrefix + "chest_item")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, prefix + " chest item");

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public ItemStack barrelItem(){
        ItemStack itemStack = new ItemStack(Material.BARREL);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString(dataTypePrefix + "barrel_item")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, prefix + " barrel item");

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public ItemStack hopperItem(){
        ItemStack itemStack = new ItemStack(Material.HOPPER);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString(dataTypePrefix + "hopper_item")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, prefix + "hopper_item");

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public ItemStack AnvilItem(){
        ItemStack itemStack = new ItemStack(Material.ANVIL);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString(dataTypePrefix + "anvil_item")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, prefix + "anvil_item");

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public ItemStack FurnaceItem(){
        ItemStack itemStack = new ItemStack(Material.FURNACE);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.displayName(Component.text(configReader.getConfigString(dataTypePrefix + "furnace_item")));
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, prefix + "furnace_item");

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
}
