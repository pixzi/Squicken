package com.pixzi.squicken.item;

import com.pixzi.squicken.SquickenMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Basic_Item extends Item {

    public Basic_Item(String unlocalizedName, String registryName) {

        setTranslationKey(SquickenMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);

    }

}