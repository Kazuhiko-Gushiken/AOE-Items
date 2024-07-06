package com.enginnx.AOEItems.DataGen;

import com.enginnx.AOEItems.AOEItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AOEItems.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    private void item(Item item) {
        String name = item.toString();
        getBuilder(name).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", "item/" + name);
    }
}
