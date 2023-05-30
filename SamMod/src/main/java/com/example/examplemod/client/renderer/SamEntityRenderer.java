package com.example.examplemod.client.renderer;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.client.models.SamEntityModel;
import com.example.examplemod.entities.SamEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SamEntityRenderer extends MobRenderer<SamEntity, SamEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ExampleMod.MODID, "textures/entities/sam_entity.png");

    public SamEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SamEntityModel(ctx.bakeLayer(SamEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SamEntity entity) {
        return TEXTURE;
    }
}
