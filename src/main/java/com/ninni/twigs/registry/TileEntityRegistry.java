package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class TileEntityRegistry {


    public static <T extends TileEntity> TileEntityType<T> register(String id, TileEntityType.Builder<T> builder)
    {
        TileEntityType<T> type = builder.build(null);
        type.setRegistryName(Twigs.MOD_ID, id);
        return type;
    }
}
