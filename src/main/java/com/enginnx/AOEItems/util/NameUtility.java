package com.enginnx.AOEItems.util;

import com.enginnx.AOEItems.AOEItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class NameUtility {

    public static String getBlockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).toString().replace(AOEItems.MODID + ":", "");
    }
}
