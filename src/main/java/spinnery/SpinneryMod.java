package spinnery;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spinnery.debug.BlockRegistry;
import spinnery.debug.ContainerRegistry;
import spinnery.debug.ItemRegistry;
import spinnery.debug.ScreenRegistry;
import spinnery.registry.ResourceRegistry;

public class SpinneryMod implements ModInitializer {
	public static final String LOG_ID = "Spinnery";
	public static final Identifier MOD_ID = new Identifier(LOG_ID.toLowerCase());
	public static Logger logger = LogManager.getLogger("Spinnery");

	@Override
	public void onInitialize() {
		BlockRegistry.initialize();
		ItemRegistry.initialize();
		ScreenRegistry.initialize();
		ContainerRegistry.initialize();
		ResourceRegistry.initialize();
	}
}
