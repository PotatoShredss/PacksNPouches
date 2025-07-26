package com.potatoshreds.ponpo.renderer;

import com.potatoshreds.ponpo.items.PoNPoItems;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class CurioRegistry {

    public static void registerCurios(){
        CuriosRendererRegistry.register(PoNPoItems.SMALLPOUCH.get(), PouchRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.LARGEPOUCH.get(), PouchRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.TOOLBELT.get(), BeltRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.SPECOPSUTILITYBELT.get(), BeltRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.CATPOUCH.get(), PouchRenderer::new);

        CuriosRendererRegistry.register(PoNPoItems.HIKINGPACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.KNAPSACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.DAYBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.BOOKBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.SPECOPSBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.TOOLBOX.get(), ToolBoxPackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.DRAWSTRINGBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.CLOTHBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.HANDMADEKNAPSACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.LEATHERBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.MILITARYBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.CATBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(PoNPoItems.REINFORCEDLEATHERBAG.get(), PackRenderer::new);
    }
}
