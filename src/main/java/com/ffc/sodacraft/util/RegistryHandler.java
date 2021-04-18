package com.ffc.sodacraft.util;

import com.ffc.sodacraft.SodaCraft;
import com.ffc.sodacraft.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SodaCraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> PURE_ADEMENIUM = ITEMS.register("pure_ademenium", ItemBase::new);
    public static final RegistryObject<Item> AMBER_INGOT = ITEMS.register("amber_ingot", ItemBase::new);

}
