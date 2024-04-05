package net.chris.dracorium.datagen;

import net.chris.dracorium.block.ModBlocks;
import net.chris.dracorium.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DracoriumBlock);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DracoriumIngot, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DracoriumHelmet));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DracoriumChestplate));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DracoriumLeggings));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DracoriumBoots));



    }
}
