package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGhostPepper extends ItemFood {
	public final String name = "GhostPepper";

	public ItemGhostPepper(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.FOOD);
		
		this.setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		// TODO Auto-generated method stub
		super.onFoodEaten(stack, worldIn, player);
//		player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("fire_resistence"), 1200, 2));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 1200));
	}

}
