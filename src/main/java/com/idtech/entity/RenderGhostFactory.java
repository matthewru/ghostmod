package com.idtech.entity;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGhostFactory implements IRenderFactory<EntityLiving> {
	
	public static final RenderGhostFactory INSTANCE = new RenderGhostFactory();

	@Override
	public Render<? super EntityLiving> createRenderFor(RenderManager manager) {
		return new RenderGhost(manager, new ModelZombie(), 0.5f);
	}
}


