package com.ffc.sodacraft.items;

import com.ffc.sodacraft.SodaCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class OreItemBase extends Item {
    public OreItemBase() {
        super(new Item.Properties().group(SodaCraft.TAB));
    }
}
