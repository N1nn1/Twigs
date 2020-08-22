package com.ninni.twigs;

import com.ninni.twigs.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TwigsItemGroup extends ItemGroup
{
    public TwigsItemGroup()
    {
        super("twigs");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.reinforced_oak_planks);
    }
}
