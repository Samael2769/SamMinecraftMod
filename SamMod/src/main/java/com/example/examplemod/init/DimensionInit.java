package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.checkerframework.checker.signature.qual.Identifier;

public class DimensionInit {
    public static final ResourceKey<Level> SAM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(ExampleMod.MODID, "sam_world"));
    public static final ResourceKey<DimensionType> SAM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation("sam_world"));

    public static void register() {
        System.out.println("Registering ModDimensions for " + ExampleMod.MODID);
    }
}
