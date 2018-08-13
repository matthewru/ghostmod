package com.idtech.world;

import com.idtech.block.QuickBlock;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeCustom extends Biome {

	public BiomeCustom(BiomeProperties properties) {
		super(properties);
		this.fillerBlock = Blocks.SOUL_SAND.getDefaultState();
//		this.topBlock = QuickBlock.getBlock("Spooky Grass").getDefaultState();
//		this.topBlock = Blocks.BONE_BLOCK.getDefaultState();
		
		this.theBiomeDecorator.treesPerChunk = 10;
		this.theBiomeDecorator.generateLakes = false;
	}
	
}
