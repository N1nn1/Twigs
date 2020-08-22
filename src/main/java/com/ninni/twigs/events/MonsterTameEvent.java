package com.ninni.twigs.events;

import com.ninni.twigs.entities.TameableMonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.living.LivingEvent;

public class MonsterTameEvent extends LivingEvent
{
    private final TameableMonsterEntity monster;
    private final PlayerEntity tamer;

    public MonsterTameEvent(TameableMonsterEntity monster, PlayerEntity tamer)
    {
        super(monster);
        this.monster = monster;
        this.tamer = tamer;
    }

    public TameableMonsterEntity getMonster()
    {
        return monster;
    }

    public PlayerEntity getTamer()
    {
        return tamer;
    }
}