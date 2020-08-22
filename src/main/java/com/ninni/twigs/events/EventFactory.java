package com.ninni.twigs.events;

import com.ninni.twigs.entities.TameableMonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;

public class EventFactory extends ForgeEventFactory {

    public static boolean onMonsterTame(TameableMonsterEntity monster, PlayerEntity tamer)
    {
        return MinecraftForge.EVENT_BUS.post(new MonsterTameEvent(monster, tamer));
    }
}
