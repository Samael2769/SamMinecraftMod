package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.client.models.SamEntityModel;
import com.example.examplemod.client.renderer.SamEntityRenderer;
import com.example.examplemod.init.EntityInit;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.SAM_ENTITY.get(), SamEntityRenderer::new);
    }
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SamEntityModel.LAYER_LOCATION, SamEntityModel::createBodyLayer);
    }
}