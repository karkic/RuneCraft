package com.Karkic.RuneCraft.item;

import com.Karkic.RuneCraft.reference.Reference;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by don on 10/20/2015.
 */
public class itemRuneCraft extends Item
{


    public itemRuneCraft()
    {
        super();
    }
    @Override
     public String getUnlocalizedName ()
    {
       return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName (String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") +1 );
    }
}



