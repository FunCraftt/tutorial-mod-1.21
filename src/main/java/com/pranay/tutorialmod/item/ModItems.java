package com.pranay.tutorialmod.item;

import com.pranay.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


//    ========================================================================================================
//                               RegisterModItems And Adding it in INGREDIENTS LIST
//    =======================================================================================================

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items For " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BIO_STEEL);
            entries.add(RAW_BIO_STEEL);
        });
    }

//    ========================================================================================================
//                                                       HELPER
//   =========================================================================================================

    public static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,Identifier.of(TutorialMod.MOD_ID,name),item);
    }

//    =========================================================================================================
//                                                  Adding new Item Area
//    ========================================================================================================

    public static final Item BIO_STEEL = registerItem("bio_steel",new Item(new Item.Settings()));
    public static final Item RAW_BIO_STEEL = registerItem("raw_bio_steel",new Item(new Item.Settings()));
}
