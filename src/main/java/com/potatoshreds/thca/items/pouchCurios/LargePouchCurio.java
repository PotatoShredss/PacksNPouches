package com.potatoshreds.thca.items.pouchCurios;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.nbt.CompoundTag;
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

import static com.potatoshreds.thca.Config.largePouchSlots;

public class LargePouchCurio extends Item{
    public LargePouchCurio() {
        super(new Properties().stacksTo(1).defaultDurability(0));
    }

    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundTag unused) {
        return CurioItemCapability.createProvider(new ICurio() {

            public ItemStack getStack() {
                return stack;
            }

            public void curioTick(SlotContext slotContext){

            }

            public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext sc, UUID uuid){
                Multimap<Attribute, AttributeModifier> atts = HashMultimap.create();

                Attribute hslots = ModAttributes.HOTBAR_SLOTS.get();

                CuriosApi.addModifier(stack, hslots,"hotbarslotsM",uuid, largePouchSlots, AttributeModifier.Operation.ADDITION,"belt");


                return atts;
            }
        });
    }
}
