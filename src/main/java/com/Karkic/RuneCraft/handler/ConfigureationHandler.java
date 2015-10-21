package com.Karkic.RuneCraft.handler;



import com.Karkic.RuneCraft.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;



/**
 * Created by don on 10/19/2015.
 */
public class ConfigureationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
     if (configuration == null)
     {
         configuration = new Configuration(configFile);
         loadConfigureation();
     }

    }
    @SubscribeEvent
    public void onConfigurationChangeEvent (ConfigChangedEvent.OnConfigChangedEvent event)
    {

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfigureation();
        }
    }
    private static void loadConfigureation()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "test config value");
        if (configuration.hasChanged())
        {
            configuration.save();
        }

    }
}
