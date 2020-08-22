package com.ninni.twigs.entities;

import net.minecraft.entity.*;
import net.minecraft.world.World;


public class TameableMonsterEntity extends CreatureEntity {
    protected TameableMonsterEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }
}