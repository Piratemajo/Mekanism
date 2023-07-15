package mekanism.generators;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MekanismGenerators implements ModInitializer {

    public static final String MODID = "mekanism-generators";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public static Identifier id(String path) {
        return new Identifier(MODID, path);
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Loading {}", MODID);
    }
}