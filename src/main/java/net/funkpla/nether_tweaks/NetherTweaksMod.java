package net.funkpla.nether_tweaks;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherTweaksMod implements ModInitializer {
    public static final String MOD_ID = "nether_tweaks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Nether Tweaks loaded.");
        AutoConfig.register(NetherTweaksConfig.class, JanksonConfigSerializer::new);
    }
}
