package com.ninni.twigs.network;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.network.message.IMessage;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class PacketHandler {

    private static final String PROTOCOL_VERSION = "1";
    private static int nextId = 0;

    public static SimpleChannel instance;

    public static void init() {
    }

    private static <T> void register(Class<T> clazz, IMessage<T> message)
    {
        instance.registerMessage(nextId++, clazz, message::encode, message::decode, message::handle);
    }

}
