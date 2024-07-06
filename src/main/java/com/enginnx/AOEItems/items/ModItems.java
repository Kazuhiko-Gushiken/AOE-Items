package com.enginnx.AOEItems.items;

import com.enginnx.AOEItems.AOEItems;
import com.enginnx.AOEItems.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AOEItems.MODID);

    public static final Supplier<BlockItem> COMPLETIONIST_TROPHY  = ITEMS.register("completionist_trophy", () -> new BlockItem(ModBlocks.COMPLETIONIST_TROPHY.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
