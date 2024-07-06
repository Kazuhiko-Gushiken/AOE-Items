package com.enginnx.AOEItems.DataGen;

import com.enginnx.AOEItems.AOEItems;
import com.enginnx.AOEItems.util.NameUtility;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AOEItems.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private void specialBlock(Block block) {
        String name = NameUtility.getBlockName(block);

    }
}
