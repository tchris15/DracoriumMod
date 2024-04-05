package net.chris.dracorium.item;

import net.chris.dracorium.DracoriumMod;
import net.chris.dracorium.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DracoriumIngot = registerItem("dracorium_ingot", new Item(new FabricItemSettings()));


    public static final Item DracoriumHelmet = registerItem("dracorium_helmet",
            new ArmorItem(ModArmorMaterials.Dracorium, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DracoriumChestplate = registerItem("dracorium_chestplate",
            new ModArmorItem(ModArmorMaterials.Dracorium, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DracoriumLeggings = registerItem("dracorium_leggings",
            new ArmorItem(ModArmorMaterials.Dracorium, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DracoriumBoots = registerItem("dracorium_boots",
            new ArmorItem(ModArmorMaterials.Dracorium, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DracoriumIngot);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(DracoriumMod.MOD_ID, name), item);
    }

    public  static void registeredModItems(){
        DracoriumMod.LOGGER.info("Registering Mod Items for " + DracoriumMod.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
