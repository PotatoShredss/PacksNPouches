package com.potatoshreds.thca.renderer;

import com.potatoshreds.thca.items.THCAItems;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class CurioRegistry {

    public static void registerCurios(){
        CuriosRendererRegistry.register(THCAItems.SMALLPOUCH.get(), PouchRenderer::new);
        CuriosRendererRegistry.register(THCAItems.LARGEPOUCH.get(), PouchRenderer::new);
        CuriosRendererRegistry.register(THCAItems.TOOLBELT.get(), BeltRenderer::new);
        CuriosRendererRegistry.register(THCAItems.SPECOPSUTILITYBELT.get(), BeltRenderer::new);
        CuriosRendererRegistry.register(THCAItems.CATPOUCH.get(), PouchRenderer::new);

        CuriosRendererRegistry.register(THCAItems.HIKINGPACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.KNAPSACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.DAYBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.BOOKBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.SPECOPSBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.TOOLBOX.get(), ToolBoxPackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.DRAWSTRINGBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.CLOTHBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.HANDMADEKNAPSACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.LEATHERBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.MILITARYBAG.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.CATBAG.get(), PackRenderer::new);
    }
}
