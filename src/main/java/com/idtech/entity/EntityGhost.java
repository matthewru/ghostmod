package com.idtech.entity;

import com.idtech.item.QuickItem;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityGhost extends EntityMob {

	public EntityGhost(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
	}
	
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		
		this.targetTasks.addTask(1,  new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2,  new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}
	
	
	@Override
	public void dropFewItems(boolean recentlyHit, int lootLevel) {
		int quantity = this.rand.nextInt(4) + 1;
		
		for (int i = 0; i < quantity; i++) {
			if (this.isBurning()) {
				this.dropItem(QuickItem.getItem("GhostNugget"), 1);
			}
			else {
				this.dropItem(QuickItem.getItem("Old Ghost Coin"), 1);
			}
		}
	} 
}
	

