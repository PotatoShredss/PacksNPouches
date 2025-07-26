package com.potatoshreds.ponpo.items.backpackCurios;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import nuparu.tinyinv.init.ModAttributes;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.common.capability.CurioItemCapability;

import java.util.UUID;

import static com.potatoshreds.ponpo.Config.toolBoxSlots;
import static com.potatoshreds.ponpo.Config.toolBoxStorage;

public class ToolboxCurio extends Item{
    public ToolboxCurio() {
        super(new Properties().stacksTo(1).defaultDurability(0));
    }

    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundTag unused) {
        return CurioItemCapability.createProvider(new ICurio() {

            public ItemStack getStack() {
                return stack;
            }

            public void curioTick(SlotContext slotContext){
                LivingEntity user = slotContext.entity();

                if(!user.level().isClientSide() && user.tickCount % 120 == 0){
                    user.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,180,1,false,false,false));
                }
            }

            public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext sc, UUID uuid){
                Multimap<Attribute, AttributeModifier> atts = HashMultimap.create();

                Attribute slots = ModAttributes.SLOTS.get();
                Attribute hslots = ModAttributes.HOTBAR_SLOTS.get();

                CuriosApi.addModifier(stack, slots,"inventoryslots",uuid,toolBoxStorage, AttributeModifier.Operation.ADDITION,"back");

                CuriosApi.addModifier(stack, hslots, "hotbarslots", uuid, toolBoxSlots, AttributeModifier.Operation.ADDITION, "back");

                return atts;
            }
        });
    }
}
