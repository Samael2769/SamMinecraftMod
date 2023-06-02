package com.example.examplemod.client.renderer;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.client.models.SamEnemiEntityModel;
import com.example.examplemod.client.models.SamEnemiEntityModel;
import com.example.examplemod.entities.SamEnemiEntity;
import com.example.examplemod.entities.SamEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SamEnemiEntityRenderer extends MobRenderer<SamEnemiEntity, SamEnemiEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ExampleMod.MODID, "textures/entities/sam_enemi_entity.png");

    public SamEnemiEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SamEnemiEntityModel(ctx.bakeLayer(SamEnemiEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SamEnemiEntity entity) {
        return TEXTURE;
    }
}
