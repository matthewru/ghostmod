package com.idtech.item;


import java.util.Iterator;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGhostArmor extends ItemArmor {

	public final String name;
	public ItemGhostArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot armorType, String name) {
		super(materialIn, renderIndexIn, armorType);
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot,
			String type) {
		
		if(slot == EntityEquipmentSlot.LEGS) {
			return "examplemod:textures/models/armor/custom_armor_layer_2.png";
		}
		return "examplemod:textures/models/armor/ghost_armor_layer_1.png";
	
	
	
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
			super.onArmorTick(world, player, itemStack);
			Iterator<ItemStack> armorList = player.getArmorInventoryList().iterator();
			while(armorList.hasNext()) {
					Item armor = armorList.next().getItem();
					if(armor instanceof ItemGhostArmor) {
							ItemGhostArmor item = (ItemGhostArmor) armor;
							
							
							if(item.name.equals(ItemMod.itemGhostHelmet.name)) {
									player.addPotionEffect(new PotionEffect(Potion.getPotionById(14), 100));
							}
							
							if(item.name.equals(ItemMod.itemGhostChestplate.name)) {
								player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 100));
						}
							
							
					}
			}
	}
	
	
	
}

	