package com.potatoshreds.thca.renderer;

import com.potatoshreds.thca.items.THCAItems;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class CurioRegistry {

    public static void registerCurios(){
        CuriosRendererRegistry.register(THCAItems.HIKINGPACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.KNAPSACK.get(), PackRenderer::new);
        CuriosRendererRegistry.register(THCAItems.SMALLPOUCH.get(), PouchRenderer::new);
        CuriosRendererRegistry.register(THCAItems.TOOLBELT.get(), BeltRenderer::new);
    }
}
