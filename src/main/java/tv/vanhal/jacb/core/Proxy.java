package tv.vanhal.jacb.core;

import tv.vanhal.jacb.TileBench;
import cpw.mods.fml.common.registry.GameRegistry;

public class Proxy {

	public void registerEntities() {
		GameRegistry.registerTileEntity(TileBench.class, "TileBench");
	}

	public boolean isClient() {
		return false;
	}
	
	public boolean isServer() {
		return true;
	}
}
