package com.idtech.entity;

import com.idtech.BaseMod;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityMod {

	public static int currentEntityId = 0;
	
	public static void preInit() {
		
		createEntityWithEgg(EntityGhost.class, "CustomMob", 0xD7D7D7, 0x000000);
		BaseMod.proxy.registerEntityRenderers();
	}
	
	public static void init() {
		
	}
	
	public static void createEntityWithEgg(Class entityClass, String entityName, int solidColor, int spotColor) {
			int entityId = currentEntityId++;
			EntityRegistry.registerModEntity(new ResourceLocation(BaseMod.MODID, entityName), entityClass, entityName, entityId, BaseMod.instance, 250, 1, true, solidColor, spotColor);
			
	}
	
	
}
	

