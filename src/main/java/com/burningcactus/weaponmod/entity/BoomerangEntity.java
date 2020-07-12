package com.burningcactus.weaponmod.entity;

import com.burningcactus.weaponmod.item.BoomerangItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class BoomerangEntity extends Entity implements IProjectile {
    private static final DataParameter<Optional<UUID>> THROWER_ID = EntityDataManager.createKey(BoomerangEntity.class, DataSerializers.OPTIONAL_UNIQUE_ID);
    private UUID shooterID;
    private byte maxTargets;
    private Set<Entity> targets;

    public BoomerangEntity(EntityType<? extends BoomerangEntity> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);
    }

    public BoomerangEntity(World worldIn, UUID thrower, byte maxTargets, Set<Entity> targets) {
        super(ModEntities.BOOMERANG_ENTITY, worldIn);
        this.maxTargets = maxTargets;
        this.shooterID = thrower;
        this.targets = targets;
    }

    /**
     * Copied from AbstractArrowEntity, this returns the shooter as an Entity.
     * @return
     */
    @Nullable
    public Entity getShooter() {
        return this.shooterID != null && this.world instanceof ServerWorld ? ((ServerWorld)this.world).getEntityByUuid(this.shooterID) : null;
    }

    @Override
    protected void registerData() {
        dataManager.register(THROWER_ID, Optional.empty());
    }

    @Override
    protected void readAdditional(CompoundNBT compound) {
        shooterID = compound.getUniqueId("thrower_id");
    }

    @Override
    protected void writeAdditional(CompoundNBT compound) {
        compound.putUniqueId("thrower_id", shooterID);
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {

    }

    public void shoot() {

    }

    @Override
    public void tick() {

    }

    public void hitEntity(@Nonnull Entity entityIn) {
        if(entityIn instanceof ItemEntity) {

        }
        else if(entityIn instanceof LivingEntity) {
            DamageSource source = DamageSource.causeThrownDamage(this, entityIn);
            Entity shooter = this.getShooter();
        }
    }

}
