package net.seamus.mediterraneanmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.seamus.mediterraneanmod.MediterraneanMod;

public class ModItems {
    // DeferredRegisters being a class of registering space for a list of something(a parameter such as item, block, or mob?) in game
    // Deferred because it's only used when called upon or something
    // ctrl + left click for more info
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MediterraneanMod.MOD_ID);

    public static final RegistryObject<Item> MORROCANFLAG = ITEMS.register("morrocanflag",
            () -> new Item(new Item.Properties()));

   // called in MediterraneanMod passing modEventBus(declared in that class) as the parameter, to register it as an item
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
