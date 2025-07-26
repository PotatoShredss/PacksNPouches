package com.potatoshreds.ponpo.items;

import com.potatoshreds.ponpo.ponpo;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVETAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ponpo.MODID);

    public static final RegistryObject<CreativeModeTab> PoNPoTAB = CREATIVETAB.register("ponpo",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PoNPoItems.CATBAG.get()))
                    .title(Component.translatable("creativetab.ponpo"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(PoNPoItems.SMALLPOUCH.get());
                        pOutput.accept(PoNPoItems.LARGEPOUCH.get());
                        pOutput.accept(PoNPoItems.KNAPSACK.get());
                        pOutput.accept(PoNPoItems.SPECOPSUTILITYBELT.get());
                        pOutput.accept(PoNPoItems.BOOKBAG.get());
                        pOutput.accept(PoNPoItems.CLOTHBAG.get());
                        pOutput.accept(PoNPoItems.DAYBAG.get());
                        pOutput.accept(PoNPoItems.DRAWSTRINGBAG.get());
                        pOutput.accept(PoNPoItems.HANDMADEKNAPSACK.get());
                        pOutput.accept(PoNPoItems.HIKINGPACK.get());
                        pOutput.accept(PoNPoItems.LEATHERBAG.get());
                        pOutput.accept(PoNPoItems.MILITARYBAG.get());
                        pOutput.accept(PoNPoItems.REINFORCEDLEATHERBAG.get());
                        pOutput.accept(PoNPoItems.SPECOPSBAG.get());
                        pOutput.accept(PoNPoItems.SPECOPSUTILITYBELT.get());
                        pOutput.accept(PoNPoItems.TOOLBELT.get());
                        pOutput.accept(PoNPoItems.TOOLBOX.get());
                        pOutput.accept(PoNPoItems.CATBAG.get());
                        pOutput.accept(PoNPoItems.CATPOUCH.get());
                    }).build());
    public static void register(IEventBus eb){
        CREATIVETAB.register(eb);
    }

}
