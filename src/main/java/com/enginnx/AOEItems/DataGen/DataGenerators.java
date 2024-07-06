package com.enginnx.AOEItems.DataGen;

import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGenerators {

    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = event.getGenerator().getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();


            generator.addProvider(true, new ModLangENProvider(output));
            generator.addProvider(true, new ModItemStateProvider(output, existingFileHelper));

            new ModLangENProvider(output);
        } catch (RuntimeException e) {
            LogUtils.getLogger().error("Failed to generate data", e);
        }
    }
}

