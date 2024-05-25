package com.enginnx.AOEItems.items;

import com.enginnx.AOEItems.AOEItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AOEItems.MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AOEItems.MODID);

    public static final Supplier<Item> COMPLETIONIST_TROPHY  = ITEMS.registerItem("completionist_trophy", Item::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
