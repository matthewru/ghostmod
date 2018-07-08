package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemGhostHatchet extends ItemAxe {
	public static final String name = "GhostHatchet";
	protected ItemGhostHatchet(){
		super(ToolMaterial.IRON);
		this.toolMaterial = ItemMod.GHOST;
		this.maxStackSize = 1;
		this.setMaxDamage(ItemMod.GHOST.getMaxUses());
		this.attackSpeed = -3.0f;
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
