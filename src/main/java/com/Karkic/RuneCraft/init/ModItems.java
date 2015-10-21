package com.Karkic.RuneCraft.init;

import com.Karkic.RuneCraft.item.itemCyanRuneDust;
import com.Karkic.RuneCraft.item.itemRuneCraft;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by don on 10/20/2015.
 */
public class ModItems {
    public static final itemRuneCraft CyanRuneDust = new itemCyanRuneDust();

    public static void init ()
    {
        GameRegistry.registerItem(CyanRuneDust, "CyanRuneDust");
    }
}

