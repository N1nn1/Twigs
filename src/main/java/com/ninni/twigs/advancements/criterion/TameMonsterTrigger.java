package com.ninni.twigs.advancements.criterion;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import com.ninni.twigs.Twigs;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraft.advancements.PlayerAdvancements;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.loot.ConditionArrayParser;
import net.minecraft.loot.ConditionArraySerializer;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TameMonsterTrigger implements ICriterionTrigger<TameMonsterTrigger>, ICriterionInstance {
    private static final ResourceLocation ID = new ResourceLocation(Twigs.MOD_ID + ":" + "tame_monster");
    private final Map<PlayerAdvancements, TameMonsterTrigger.Listeners> listeners = Maps.newHashMap();
    private TameMonsterTrigger entity;

    public TameMonsterTrigger(EntityPredicate any) {
    }

    public TameMonsterTrigger() {
    }

    @Override
	public ResourceLocation getId() {
        return ID;
    }

    @Override
    public JsonObject func_230240_a_(ConditionArraySerializer p_230240_1_) {
        return null;
    }

    @Override
	public void addListener(PlayerAdvancements playerAdvancementsIn, ICriterionTrigger.Listener<TameMonsterTrigger> listener) {
        TameMonsterTrigger.Listeners tamemonstertrigger$listeners = this.listeners.get(playerAdvancementsIn);
        if (tamemonstertrigger$listeners == null) {
            tamemonstertrigger$listeners = new TameMonsterTrigger.Listeners(playerAdvancementsIn);
            this.listeners.put(playerAdvancementsIn, tamemonstertrigger$listeners);
        }

        tamemonstertrigger$listeners.add(listener);
    }

    @Override
	public void removeListener(PlayerAdvancements playerAdvancementsIn, ICriterionTrigger.Listener<TameMonsterTrigger> listener) {
        TameMonsterTrigger.Listeners tamemonstertrigger$listeners = this.listeners.get(playerAdvancementsIn);
        if (tamemonstertrigger$listeners != null) {
            tamemonstertrigger$listeners.remove(listener);
            if (tamemonstertrigger$listeners.isEmpty()) {
                this.listeners.remove(playerAdvancementsIn);
            }
        }

    }

    @Override
	public void removeAllListeners(PlayerAdvancements playerAdvancementsIn) {
        this.listeners.remove(playerAdvancementsIn);
    }

    @Override
    public TameMonsterTrigger func_230307_a_(JsonObject p_230307_1_, ConditionArrayParser p_230307_2_) {
        return null;
    }


    public void trigger(ServerPlayerEntity player, MobEntity entity) {
        TameMonsterTrigger.Listeners tamemonstertrigger$listeners = this.listeners.get(player.getAdvancements());
        if (tamemonstertrigger$listeners != null) {
            tamemonstertrigger$listeners.trigger(player, entity);
        }

    }


    static class Listeners {
        private final PlayerAdvancements playerAdvancements;
        private final Set<ICriterionTrigger.Listener<TameMonsterTrigger>> listeners = Sets.newHashSet();

        public Listeners(PlayerAdvancements playerAdvancementsIn) {
            this.playerAdvancements = playerAdvancementsIn;
        }

        public boolean isEmpty() {
            return this.listeners.isEmpty();
        }

        public void add(ICriterionTrigger.Listener<TameMonsterTrigger> listener) {
            this.listeners.add(listener);
        }

        public void remove(ICriterionTrigger.Listener<TameMonsterTrigger> listener) {
            this.listeners.remove(listener);
        }

        public void trigger(ServerPlayerEntity player, MobEntity entity) {
            List<ICriterionTrigger.Listener<TameMonsterTrigger>> list = null;

            for(ICriterionTrigger.Listener<TameMonsterTrigger> listener : this.listeners) {
                if (listener.getCriterionInstance().test(player, entity)) {
                    if (list == null) {
                        list = Lists.newArrayList();
                    }

                    list.add(listener);
                }
            }

            if (list != null) {
                for(ICriterionTrigger.Listener<TameMonsterTrigger> listener1 : list) {
                    listener1.grantCriterion(this.playerAdvancements);
                }
            }

        }
    }

    private boolean test(ServerPlayerEntity player, MobEntity entity) {
        return this.entity.test(player, entity);
    }
}