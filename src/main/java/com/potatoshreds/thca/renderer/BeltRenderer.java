package com.potatoshreds.thca.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

public class BeltRenderer implements ICurioRenderer {
    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(
            ItemStack itemStack,
            SlotContext slotContext,
            PoseStack poseStack,
            RenderLayerParent<T, M> renderLayerParent,
            MultiBufferSource multiBufferSource,
            int lightV,
            float limbSwing,
            float limbSwingAmount,
            float partialTicks,
            float ageInTicks,
            float netHeadYaw,
            float headPitch ){
        LivingEntity entity = slotContext.entity();
        if(!itemStack.isEmpty()){
            poseStack.pushPose();
            ICurioRenderer.translateIfSneaking(poseStack, entity);
            ICurioRenderer.rotateIfSneaking(poseStack, entity);
            poseStack.mulPose(Axis.ZP.rotationDegrees(180));
            poseStack.translate(0,-0.125,0.375);
            Minecraft.getInstance().getItemRenderer().renderStatic(
                    itemStack, ItemDisplayContext.HEAD, lightV, OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, entity.level(), 0
            );
            poseStack.popPose();
        }
    }
}
