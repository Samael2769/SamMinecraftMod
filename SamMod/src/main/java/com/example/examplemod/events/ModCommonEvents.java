package com.example.examplemod.events;

import com.example.examplemod.entities.SamEntity;
import com.example.examplemod.init.EntityInit;
import com.example.examplemod.ExampleMod;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(EntityInit.SAM_ENTITY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, SamEntity::canSpawn);
        });
    }

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.SAM_ENTITY.get(), SamEntity.getExampleAttributes().build());
    }
}