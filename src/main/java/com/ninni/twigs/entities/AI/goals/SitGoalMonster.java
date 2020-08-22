package com.ninni.twigs.entities.AI.goals;

import com.ninni.twigs.entities.TameableMonsterEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;

import java.util.EnumSet;

public class SitGoalMonster extends Goal {
    private final TameableMonsterEntity tameable;
    private boolean isSitting;

    public SitGoalMonster(TameableMonsterEntity entityIn) {
        this.tameable = entityIn;
        this.setMutexFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    @Override
	public boolean shouldContinueExecuting() {
        return this.isSitting;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
	public boolean shouldExecute() {
        return false;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
	public void startExecuting() {
    }
    public void setSitting(boolean sitting) {
        this.isSitting = sitting;
    }
}