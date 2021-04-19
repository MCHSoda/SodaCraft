package com.ffc.sodacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreInfusedPlanks extends Block {



    public OreInfusedPlanks() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(4.5f, 5.5f)
                .lightValue(9)
                .sound(SoundType.WOOD)
                .harvestLevel(2)
                .harvestTool(ToolType.AXE)


        );
    }
}
