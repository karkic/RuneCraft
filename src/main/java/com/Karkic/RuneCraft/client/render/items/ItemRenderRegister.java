package com.Karkic.RuneCraft.client.render.items;

import com.Karkic.RuneCraft.init.ModItems;
import com.Karkic.RuneCraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by don on 10/20/2015.
 */
public final class ItemRenderRegister {
public static void registerItemRenderer(){
    reg(ModItems.CyanRuneDust);
}
    public static void reg(Item item){
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
            .register(item, 0 , new ModelResourceLocation(Reference.MOD_ID.toLowerCase()+":" + item.getUnlocalizedName().substring(5)
                    , "inventory"));
}

}

