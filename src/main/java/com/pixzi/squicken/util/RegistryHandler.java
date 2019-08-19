package com.pixzi.squicken.util;
 
import com.pixzi.squicken.item.Basic_Item;
 
import net.minecraft.item.Item;
 
import net.minecraftforge.event.RegistryEvent.Register;
 
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
 
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
@EventBusSubscriber
 
public class RegistryHandler {
 
    @SubscribeEvent
 
    public static void registerItems(Register<Item> event) {
 
        final Item[] items = {
 
                new Basic_Item("basicitem", "basic_item")
 
        };
 
        event.getRegistry().registerAll(items);
 
    }
 
}