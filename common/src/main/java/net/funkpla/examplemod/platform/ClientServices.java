package net.funkpla.examplemod.platform;

import net.funkpla.examplemod.platform.services.ClientPlatformHelper;
import static net.funkpla.examplemod.platform.Services.load;

public class ClientServices {
    public static final ClientPlatformHelper RENDERER = load(ClientPlatformHelper.class);
}
