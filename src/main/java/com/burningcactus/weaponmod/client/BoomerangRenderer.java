package com.burningcactus.weaponmod.client;

import com.burningcactus.weaponmod.WeaponMod;
import com.burningcactus.weaponmod.entity.BoomerangEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

public class BoomerangRenderer extends EntityRenderer<BoomerangEntity> {
    private final ResourceLocation TEXTURE = new ResourceLocation(WeaponMod.MODID, "textures/entity/boomerang.png");
    private BoomerangModel model = new BoomerangModel();
    protected BoomerangRenderer(EntityRendererManager renderManager) {
        super(renderManager);
    }

    @Override
    public void render(BoomerangEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.push();
        IVertexBuilder vertexBuilder = ItemRenderer.getBuffer(bufferIn, model.getRenderType(getEntityTexture(entityIn)), false, false);
        model.setRotationAngles(entityIn, 0, 0, entityIn.ticksExisted + partialTicks, entityYaw, 0);
        model.render(matrixStackIn, vertexBuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.pop();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    @Override
    public ResourceLocation getEntityTexture(BoomerangEntity entity) {
        return TEXTURE;
    }
}
