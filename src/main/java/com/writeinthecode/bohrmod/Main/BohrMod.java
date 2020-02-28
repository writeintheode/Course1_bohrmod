package com.writeinthecode.bohrmod.Main;

import com.writeinthecode.bohrmod.Config.Config;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Config.MODID)
public class BohrMod {
    public BohrMod() {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
    }
}