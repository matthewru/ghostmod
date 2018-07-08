package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemGhostPickaxe extends ItemPickaxe {

	public static final String name = "GhostPickaxe";
	protected ItemGhostPickaxe(){
		super(ItemMod.GHOST);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
