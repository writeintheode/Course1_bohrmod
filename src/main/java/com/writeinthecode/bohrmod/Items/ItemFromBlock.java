package com.writeinthecode.bohrmod.Items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class ItemFromBlock extends BlockItem {
    public ItemFromBlock(Block blockIn, Properties builder) {
        super(blockIn, builder);
        setRegistryName(blockIn.getRegistryName());
    }
}
