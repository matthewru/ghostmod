package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMod {
	
	// Material
	public static ToolMaterial GHOST;

	// Tools
	public static ItemGhostPickaxe itemGhostPickaxe;
	public static ItemGhostMachete itemGhostMachete;
	public static ItemGhostHatchet itemGhostHatchet;
	public static ItemGhostShovel itemGhostShovel;
	public static ItemGhostArmor itemGhostHelmet;
	public static ArmorMaterial GhostArmorMaterial;
	public static ItemGhostArmor itemGhostChestplate;
	public static ItemGhostPepper itemGhostPepper;
	public static void preInit(){
	
		// Materials		
		GHOST = EnumHelper.addToolMaterial("GHOST", 3, 2000, 15, 14, 20);
		GhostArmorMaterial = EnumHelper.addArmorMaterial("GhostArmorMaterial", "ghost_armor", 100, new int[]{8, 13, 13, 8}, 5, SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 0.0f);
		// Tools
		itemGhostPickaxe = new ItemGhostPickaxe();
		GameRegistry.register(itemGhostPickaxe.setRegistryName(itemGhostPickaxe.name));
		itemGhostMachete = new ItemGhostMachete();
		GameRegistry.register(itemGhostMachete.setRegistryName(itemGhostMachete.name));
		itemGhostHatchet = new ItemGhostHatchet();
		GameRegistry.register(itemGhostHatchet.setRegistryName(itemGhostHatchet.name));
		itemGhostShovel = new ItemGhostShovel();
		GameRegistry.register(itemGhostShovel.setRegistryName(itemGhostShovel.name));
		itemGhostChestplate = new ItemGhostArmor(ItemMod.GhostArmorMaterial, 0, EntityEquipmentSlot.CHEST, "GhostChestplate");
		GameRegistry.register(itemGhostChestplate.setRegistryName(itemGhostChestplate.name));
		//Food
		itemGhostPepper = new ItemGhostPepper(8, 0.7f, false);
		
		
		
		
		itemGhostHelmet = new ItemGhostArmor(ItemMod.GhostArmorMaterial, 0, EntityEquipmentSlot.HEAD, "GhostHelmet");
		GameRegistry.register(itemGhostHelmet.setRegistryName(itemGhostHelmet.name));
		GameRegistry.register(itemGhostPepper.setRegistryName(itemGhostPepper.name));
	}

	public static void init(){

		// Items
		BaseMod.proxy.registerItemInventoryRender(itemGhostPickaxe, itemGhostPickaxe.name);
		BaseMod.proxy.registerItemInventoryRender(itemGhostMachete, itemGhostMachete.name);
		BaseMod.proxy.registerItemInventoryRender(itemGhostHatchet, itemGhostHatchet.name);
		BaseMod.proxy.registerItemInventoryRender(itemGhostShovel, itemGhostShovel.name);
		BaseMod.proxy.registerItemInventoryRender(itemGhostHelmet,itemGhostHelmet.name);
		BaseMod.proxy.registerItemInventoryRender(itemGhostChestplate, itemGhostChestplate.name);
		BaseMod.proxy.registerItemInventoryRender(itemGhostPepper, itemGhostPepper.name);
	}
}