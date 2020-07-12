package com.burningcactus.weaponmod.client;

import com.burningcactus.weaponmod.entity.BoomerangEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BoomerangModel extends EntityModel<BoomerangEntity> {
	private final ModelRenderer boomerang;

	public BoomerangModel() {
		textureWidth = 32;
		textureHeight = 32;

		boomerang = new ModelRenderer(this);
		boomerang.setRotationPoint(0.0F, 24.0F, 0.0F);
		boomerang.setTextureOffset(0, 11).addBox(-6.0F, -4.0F, 4.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		boomerang.setTextureOffset(0, 0).addBox(4.0F, -4.0F, -6.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(BoomerangEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		boomerang.rotateAngleY = ageInTicks * (float)Math.PI/6F;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		boomerang.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}