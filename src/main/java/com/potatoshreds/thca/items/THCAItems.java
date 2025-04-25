package com.potatoshreds.thca.items;


import com.potatoshreds.thca.items.backpackCurios.*;
import com.potatoshreds.thca.items.pouchCurios.LargePouchCurio;
import com.potatoshreds.thca.items.pouchCurios.SmallPouchCurio;
import com.potatoshreds.thca.items.pouchCurios.SpecOpsUtilityBeltCurio;
import com.potatoshreds.thca.items.pouchCurios.ToolBeltCurio;
import com.potatoshreds.thca.thca;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class THCAItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, thca.MODID);
    public static final RegistryObject<Item> SMALLPOUCH = ITEMS.register("smallpouch", SmallPouchCurio::new);
    public static final RegistryObject<Item> LARGEPOUCH = ITEMS.register("largepouch", LargePouchCurio::new);
    public static final RegistryObject<Item> KNAPSACK = ITEMS.register("knapsack", KnapsackCurio::new);
    public static final RegistryObject<Item> BOOKBAG = ITEMS.register("bookbag", BookBagCurio::new);
    public static final RegistryObject<Item> CLOTHBAG = ITEMS.register("clothbag", ClothBagCurio::new);
    public static final RegistryObject<Item> DAYBAG = ITEMS.register("daybag", DayBagCurio::new);
    public static final RegistryObject<Item> DRAWSTRINGBAG = ITEMS.register("drawstringbag", DrawstringBagCurio::new);
    public static final RegistryObject<Item> HANDMADEKNAPSACK = ITEMS.register("handmadeknapsack", HandmadeKnapsackCurio::new);
    public static final RegistryObject<Item> HIKINGPACK = ITEMS.register("hikingpack", HikingPackCurio::new);
    public static final RegistryObject<Item> LEATHERBAG = ITEMS.register("leatherbag", LeatherBagCurio::new);
    public static final RegistryObject<Item> MILITARYBAG = ITEMS.register("militarybag", MilitaryBagCurio::new);
    public static final RegistryObject<Item> REINFORCEDLEATHERBAG = ITEMS.register("reinforcedleatherbag", ReinforcedLeatherBagCurio::new);
    public static final RegistryObject<Item> SPECOPSBAG = ITEMS.register("specopsbag", SpecOpsBagCurio::new);
    public static final RegistryObject<Item> SPECOPSUTILITYBELT = ITEMS.register("specopsutilitybelt", SpecOpsUtilityBeltCurio::new);
    public static final RegistryObject<Item> TOOLBELT = ITEMS.register("toolbelt", ToolBeltCurio::new);
    public static final RegistryObject<Item> TOOLBOX = ITEMS.register("toolbox", ToolboxCurio::new);
    public static void register(IEventBus eB){
        ITEMS.register(eB);
    }
}
