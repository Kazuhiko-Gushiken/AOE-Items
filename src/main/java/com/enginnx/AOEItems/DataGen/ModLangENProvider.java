package com.enginnx.AOEItems.DataGen;

import com.enginnx.AOEItems.AOEItems;
import com.enginnx.AOEItems.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLangENProvider extends LanguageProvider {
    public ModLangENProvider(PackOutput output) {
        super(output, AOEItems.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.COMPLETIONIST_TROPHY, "Completionist Trophy");
    }
}
