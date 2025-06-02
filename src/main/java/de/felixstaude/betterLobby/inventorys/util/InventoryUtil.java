package de.felixstaude.betterLobby.inventorys.util;

import de.felixstaude.betterLobby.BetterLobby;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

import javax.xml.stream.events.Namespace;

public class InventoryUtil {

    Plugin plugin = BetterLobby.getProvidingPlugin(BetterLobby.class);

    public void fillWithDefaultItem(Inventory inventory){
        for (int i = 0; i < inventory.getSize(); i++) {
            if(inventory.getItem(i) == null){
                return;
            }
            inventory.setItem(i, fillerItem());
        }

        /*
            Inventory filled with item that is set in config.yml
                > default is light_gray_stained_glass_pane
                > some metadata should be set so there is no way to manipulate them
                > remove any nametag from item
         */
    }

    private ItemStack fillerItem(){
        ItemStack fillItem = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        ItemMeta fillItemMeta = fillItem.getItemMeta();

        NamespacedKey key = new NamespacedKey(plugin, "BetterLobby - item identifier");

        fillItemMeta.displayName(Component.text("§7// CHANGE LATER //"));
        fillItemMeta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "filler item");

        fillItem.setItemMeta(fillItemMeta);

        return fillItem;
    }
}
