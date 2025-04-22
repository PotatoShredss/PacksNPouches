package com.potatoshreds.thca.items;

import com.potatoshreds.thca.thca;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVETAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, thca.MODID);

    public static final RegistryObject<CreativeModeTab> THCATAB = CREATIVETAB.register("thca",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(THCAItems.HIKINGPACK.get()))
                    .title(Component.translatable("creativetab.thca"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(THCAItems.SMALLPOUCH.get());
                        pOutput.accept(THCAItems.LARGEPOUCH.get());
                        pOutput.accept(THCAItems.KNAPSACK.get());
                        pOutput.accept(THCAItems.SPECOPSUTILITYBELT.get());
                        pOutput.accept(THCAItems.BOOKBAG.get());
                        pOutput.accept(THCAItems.CLOTHBAG.get());
                        pOutput.accept(THCAItems.DAYBAG.get());
                        pOutput.accept(THCAItems.DRAWSTRINGBAG.get());
                        pOutput.accept(THCAItems.HANDMADEKNAPSACK.get());
                        pOutput.accept(THCAItems.HIKINGPACK.get());
                        pOutput.accept(THCAItems.LEATHERBAG.get());
                        pOutput.accept(THCAItems.MILITARYBAG.get());
                        pOutput.accept(THCAItems.REINFORCEDLEATHERBAG.get());
                        pOutput.accept(THCAItems.SPECOPSBAG.get());
                        pOutput.accept(THCAItems.SPECOPSUTILITYBELT.get());
                        pOutput.accept(THCAItems.TOOLBELT.get());
                        pOutput.accept(THCAItems.TOOLBOX.get());
                    }).build());
    public static void register(IEventBus eb){
        CREATIVETAB.register(eb);
    }

}
