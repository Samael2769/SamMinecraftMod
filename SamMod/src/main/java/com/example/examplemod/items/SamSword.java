package com.example.examplemod.items;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SamSword extends SwordItem {

    public SamSword(Tier material, int attackDamage, float attackSpeed, Properties properties) {
        super(material, attackDamage, attackSpeed, properties);
    }
}
