package com.enginnx.AOEItems.blocks;

import com.enginnx.AOEItems.AOEItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AOEItems.MODID);

    public static final Supplier<Block> COMPLETIONIST_TROPHY = BLOCKS.register("completionist_trophy", () -> new CompletionistTrophy(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
