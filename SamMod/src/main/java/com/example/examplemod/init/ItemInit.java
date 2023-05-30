package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.items.*;
import com.example.examplemod.util.SamArmorMaterial;
import com.example.examplemod.util.SamItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    public static final RegistryObject<Item> SAM_ITEM = ITEMS.register("sam_item",
            () -> new SamItem(new Item.Properties().tab(ModCreativeTab.instance))
    );
    public static final RegistryObject<Item> SAM_FOOD = ITEMS.register("sam_food",
            () -> new SamFood(new Item.Properties().tab(ModCreativeTab.instance).food(new FoodProperties.Builder().nutrition(5).saturationMod(2).build()))
    );
    public static final RegistryObject<Item> SAM_PICKAXE = ITEMS.register("sam_pickaxe",
            () -> new SamPickAxe(SamItemTier.SAM_ITEM,1, -3.0F, new Item.Properties().tab(ModCreativeTab.instance)));

    public static final RegistryObject<Item> SAM_SWORD = ITEMS.register("sam_sword",
            () -> new SamSword(SamItemTier.SAM_ITEM, 5, -1.0F, new Item.Properties().tab(ModCreativeTab.instance)));

    public static final RegistryObject<Item> SAM_HELMET = ITEMS.register("sam_helmet",
            () -> new SamArmor(SamArmorMaterial.SAM_ITEM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> SAM_CHESTPLATE = ITEMS.register("sam_chestplate",
            () -> new SamArmor(SamArmorMaterial.SAM_ITEM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> SAM_LEGGINGS = ITEMS.register("sam_leggings",
            () -> new SamArmor(SamArmorMaterial.SAM_ITEM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> SAM_BOOTS = ITEMS.register("sam_boots",
            () -> new SamArmor(SamArmorMaterial.SAM_ITEM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTab.instance)));

    public static class ModCreativeTab extends CreativeModeTab {
        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "sam");
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SAM_ITEM.get());
        }
    }
}
