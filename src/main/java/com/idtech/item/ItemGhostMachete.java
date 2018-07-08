package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemGhostMachete extends ItemSword {
	public static final String name = "GhostMachete";
	protected ItemGhostMachete(){
		super(ItemMod.GHOST);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
