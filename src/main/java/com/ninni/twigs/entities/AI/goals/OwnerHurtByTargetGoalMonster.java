package com.ninni.twigs.entities.AI.goals;

import com.ninni.twigs.entities.TameableMonsterEntity;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.TargetGoal;

import java.util.EnumSet;

public class OwnerHurtByTargetGoalMonster extends TargetGoal {
        private final TameableMonsterEntity tameable;
        private LivingEntity attacker;
        private int timestamp;

        public OwnerHurtByTargetGoalMonster(TameableMonsterEntity theDefendingTameableIn) {
            super(theDefendingTameableIn, false);
            this.tameable = theDefendingTameableIn;
            this.setMutexFlags(EnumSet.of(Goal.Flag.TARGET));
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

        }