package com.pixzi.squicken;

import org.apache.logging.log4j.Logger;
 
import com.pixzi.squicken.proxy.ServerProxy;
import com.pixzi.squicken.proxy.IProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
     modid = SquickenMod.MODID, 
     name = SquickenMod.NAME, 
	 version = SquickenMod.VERSION, 
	 acceptedMinecraftVersions = "[1.12.2]")
	 
public class SquickenMod 
{
	public static final String MODID = "squicken";
    public static final String NAME = "Squicken";
    public static final String VERSION = "1.0.0";
    public static final String acceptedMCV = "[1.12.2]";
	public static final String CLIENT = "com.pixzi.squicken.proxy.ClientProxy";
    public static final String SERVER = "com.pixzi.squicken.proxy.ServerProxy";

	@SidedProxy(clientSide = SquickenMod.CLIENT, serverSide = SquickenMod.SERVER)
    public static IProxy proxy;
	
	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
        proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
    }

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
    }

}