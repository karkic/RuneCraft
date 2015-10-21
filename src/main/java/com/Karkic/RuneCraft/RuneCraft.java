package com.Karkic.RuneCraft;

import com.Karkic.RuneCraft.handler.ConfigureationHandler;
import com.Karkic.RuneCraft.init.ModItems;
import com.Karkic.RuneCraft.item.itemCyanRuneDust;
import com.Karkic.RuneCraft.proxy.IProxy;
import com.Karkic.RuneCraft.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.List;

@Mod( modid= Reference.MOD_ID , name= Reference.MOD_NAME, version= Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class RuneCraft
{
    public static List<Item> namesList = new ArrayList<Item>();

    @Mod.Instance( Reference.MOD_ID)
    public static RuneCraft instance;

    @SidedProxy (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        ConfigureationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigureationHandler());

        ModItems.init();


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

            renderItem.getItemModelMesher().register(getUnlocalizedName, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((itemCyanRuneDust) getUnlocalizedName).getName(), "inventory"));
        }

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {

    }


}
