package com.idtech.recipe;

import com.idtech.item.ItemMod;
import com.idtech.item.QuickItem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeMod {
	
	public static void init(){
		// Add your crafting recipes here.
		GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemGhostMachete,1),
						" xx",
						"xx ",
						"y  ",
						'x', QuickItem.getItem("GhostIngot"),
						'y', Items.BLAZE_ROD);
		GameRegistry.addShapelessRecipe(new ItemStack(QuickItem.getItem("GhostIngot")), Items.DIAMOND, Items.BLAZE_POWDER);
		GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemGhostPickaxe,1),
				"xxx",
				" y ",
				" y ",
				'x', QuickItem.getItem("GhostIngot"),
				'y', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemGhostHatchet,1),
				" xx",
				" yx",
				" y ",
				'x', QuickItem.getItem("GhostIngot"),
				'y', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemGhostShovel,1),
				" x ",
				" y ",
				" y ",
				'x', QuickItem.getItem("GhostIngot"),
				'y', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemGhostHelmet,1),
				"xxx",
				"xyx",
				"   ",
				'x', QuickItem.getItem("GhostIngot"),
				'y', Blocks.GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemGhostChestplate,1),
				"xyx",
				"xxx",
				"xxx",
				'x', QuickItem.getItem("GhostIngot"),
				'y', Items.BLAZE_POWDER);
		GameRegistry.addShapelessRecipe(new ItemStack(QuickItem.getItem("GhostNugget"), 8), QuickItem.getItem("GhostIngot"));
		GameRegistry.addShapedRecipe(new ItemStack(QuickItem.getItem("GhostIngot"),1),
				"xxx",
				"xyx",
				"xxx",
				'x', QuickItem.getItem("GhostNugget"),
				'y', Blocks.SOUL_SAND);
		GameRegistry.addSmelting(new ItemStack(QuickItem.getItem("Old Ghost Coin")), new ItemStack(QuickItem.getItem("GhostNugget"),1), 0.5f);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemMod.itemGhostPepper, 3), QuickItem.getItem("GhostNugget"), Items.APPLE);
				

	}
	
}
