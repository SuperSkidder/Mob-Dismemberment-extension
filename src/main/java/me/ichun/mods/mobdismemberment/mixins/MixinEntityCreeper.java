package me.ichun.mods.mobdismemberment.mixins;

import me.ichun.mods.mobdismemberment.IEntityCreeper;
import net.minecraft.entity.monster.EntityCreeper;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Interface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityCreeper.class)
@Implements(@Interface(iface = IEntityCreeper.class, prefix = "mobdismemberment$"))
public class MixinEntityCreeper implements IEntityCreeper{
    @Shadow
    private int timeSinceIgnited;
    @Shadow
    private int fuseTime;

    @Override
    public int getTimeSinceIgnited() {
        return timeSinceIgnited;
    }

    @Override
    public int getFuseTime() {
        return fuseTime;
    }
}
