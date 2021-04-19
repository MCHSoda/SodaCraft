package com.ffc.sodacraft.util;

import com.ffc.sodacraft.SodaCraft;
import com.ffc.sodacraft.blocks.BlockItemBase;
import com.ffc.sodacraft.blocks.OreInfusedPlanks;
import com.ffc.sodacraft.items.OreItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SodaCraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SodaCraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> PURE_ADEMENIUM = ITEMS.register("pure_ademenium", OreItemBase::new);
    public static final RegistryObject<Item> AMBER_INGOT = ITEMS.register("amber_ingot", OreItemBase::new);
    public static final RegistryObject<Item> ADEMENIUM_INGOT = ITEMS.register("ademenium_ingot", OreItemBase::new);
    public static final RegistryObject<Item> PURE_AMBER = ITEMS.register("pure_amber", OreItemBase::new);

    //OreInfusedPlanks
    public static final RegistryObject<Block> ADEMENIUM_INFUSED_OAK_PLANKS = BLOCKS.register("ademenium_infused_oak_planks", OreInfusedPlanks::new);
    public static final RegistryObject<Block> ADEMENIUM_INFUSED_DARK_OAK_PLANKS = BLOCKS.register("ademenium_infused_dark_oak_planks", OreInfusedPlanks::new);




    //OreInfusedPlanks items
    public static final RegistryObject<Item> ADEMENIUM_INFUSED_OAK_PLANKS_ITEM = ITEMS.register("ademenium_infused_oak_planks", () -> new BlockItemBase(ADEMENIUM_INFUSED_OAK_PLANKS.get()));
    public static final RegistryObject<Item> ADEMENIUM_INFUSED_DARK_OAK_PLANKS_ITEM = ITEMS.register("ademenium_infused_dark_oak_planks", () -> new BlockItemBase(ADEMENIUM_INFUSED_DARK_OAK_PLANKS.get()));


}
