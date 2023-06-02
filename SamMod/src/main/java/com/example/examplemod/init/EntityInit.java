package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entities.SamEntity;
import com.example.examplemod.entities.SamEnemiEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Executable;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MODID);

    public static final RegistryObject<EntityType<SamEntity>> SAM_ENTITY = ENTITIES.register("sam_entity",
            () -> EntityType.Builder.of(SamEntity::new, MobCategory.CREATURE)
            .build(ExampleMod.MODID + "sam_entity"));
    public static final RegistryObject<EntityType<SamEnemiEntity>> SAM_ENEMI_ENTITY = ENTITIES.register("sam_enemi_entity",
            () -> EntityType.Builder.of(SamEnemiEntity::new, MobCategory.CREATURE)
                    .build(ExampleMod.MODID + "sam_enemi_entity"));
}
