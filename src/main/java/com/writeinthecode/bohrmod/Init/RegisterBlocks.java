package com.writeinthecode.bohrmod.Init;

import com.writeinthecode.bohrmod.Blocks.BohrOreAttributes;
import com.writeinthecode.bohrmod.Config.Config;
import com.writeinthecode.bohrmod.Items.ItemFromBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Config.MODID, bus = Bus.MOD)
public class RegisterBlocks {
    public static final Block bohrOre = new BohrOreAttributes();

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        bohrOre.setRegistryName(Config.MODID, "bohr_ore");
        registry.register(bohrOre);
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(new ItemFromBlock(bohrOre, new Item.Properties().group(CreativeTabs.overworld)));
    }

}