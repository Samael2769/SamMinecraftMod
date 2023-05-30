package com.example.examplemod.items;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class SamPickAxe extends PickaxeItem {
    public SamPickAxe(Tier material, int attackDamage, float attackSpeed, Properties properties) {
        super(material, attackDamage, attackSpeed, properties);
    }
}