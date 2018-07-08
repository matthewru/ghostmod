package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemGhostShovel extends ItemSpade {
	public static final String name = "GhostShovel";
	protected ItemGhostShovel(){
		super(ItemMod.GHOST);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
