package com.Karkic.RuneCraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by don on 10/20/2015.
 */
public class itemCyanRuneDust extends itemRuneCraft {
   private final String name = "CyanRuneDust";
    public itemCyanRuneDust()
    {


        super();
        this.setUnlocalizedName(name);
        GameRegistry.registerItem(this,name);
        setCreativeTab(CreativeTabs.tabMisc);
    }
public String getName()
{
    return name;
}
}
