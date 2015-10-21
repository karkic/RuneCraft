package com.Karkic.RuneCraft.client.gui;

import com.Karkic.RuneCraft.handler.ConfigureationHandler;
import com.Karkic.RuneCraft.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import scala.reflect.internal.Trees;

/**
 * Created by don on 10/19/2015.
 */
public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig (GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement (ConfigureationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigureationHandler.configuration.toString()));

    }
}
