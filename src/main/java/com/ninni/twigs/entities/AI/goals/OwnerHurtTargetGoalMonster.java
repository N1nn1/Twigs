package com.ninni.twigs.entities.AI.goals;

import com.ninni.twigs.entities.TameableMonsterEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.TargetGoal;

import java.util.EnumSet;

public class OwnerHurtTargetGoalMonster extends TargetGoal {
    private final TameableMonsterEntity tameable;
    private LivingEntity attacker;
    private int timestamp;

    public OwnerHurtTargetGoalMonster(TameableMonsterEntity theEntityTameableIn) {
        super(theEntityTameableIn, false);
        this.tameable = theEntityTameableIn;
        this.setMutexFlags(EnumSet.of(Goal.Flag.TARGET));
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
	public boolean shouldExecute() {
        return false;
    }

}