package net.chris.dracorium.item;

import net.chris.dracorium.DracoriumMod;
import net.chris.dracorium.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.chris.dracorium.DracoriumMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Dracorium_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DracoriumMod.MOD_ID, "dracorium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dracorium"))
                    .icon(() -> new ItemStack(ModItems.DracoriumIngot)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DracoriumIngot);
                        entries.add(ModBlocks.DracoriumBlock);

                        entries.add(ModItems.DracoriumHelmet);
                        entries.add(ModItems.DracoriumChestplate);
                        entries.add(ModItems.DracoriumLeggings);
                        entries.add(ModItems.DracoriumBoots);


                    }).build());


    public static void registerItemGroups() {
        DracoriumMod.LOGGER.info("Registering Item Groups for " + DracoriumMod.MOD_ID);
    }
}
