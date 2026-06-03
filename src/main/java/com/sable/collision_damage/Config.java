package com.sable.collision_damage;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue OVERRIDE_SABLE_FRAGILE_BLOCKS = BUILDER
            .comment("If disabled, fragile sable blocks are handled in this addon.")
            .define("overrideSableFragileBlocks", false);

    public static final ModConfigSpec.DoubleValue MIN_BREAK_SPEED = BUILDER
            .comment("Minimum speed")
            .defineInRange("minBreakSpeed", 15.0D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue STATIC_SLOWDOWN_PER_BLOCK = BUILDER
            .comment("\n")
            .comment("Static slowdown from block destruction")
            .defineInRange("staticSlowdownPerBlock", 3.0D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue BLOCK_BURST_COUNT_BASE = BUILDER
            .comment("\n")
            .comment("Block particles: base quantity")
            .defineInRange("blockBurstCountBase", 4.0D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue BLOCK_BURST_COUNT_PER_SPEED = BUILDER
            .comment("Block particles: addition of quantity per 1 m/s")
            .defineInRange("blockBurstCountPerSpeed", 0.1D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue BLOCK_BURST_SPEED_BASE = BUILDER
            .comment("Particle block: base velocity of dispersion")
            .defineInRange("blockBurstSpeedBase", 0.4D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue BLOCK_BURST_SPEED_PER_SPEED = BUILDER
            .comment("Particle block: increase speed by 1 m/s")
            .defineInRange("blockBurstSpeedPerSpeed", 0.01D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue MAX_BLOCK_PARTICLES_PER_COLLISION = BUILDER
            .comment("Max particle block per collision")
            .defineInRange("maxBlockParticlesPerCollision", 200.0D, 1.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue UCK_COUNT_BASE = BUILDER
            .comment("\n")
            .comment("sparks: base quantity")
            .defineInRange("uckCountBase", 1.0D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue UCK_COUNT_PER_SPEED = BUILDER
            .comment("sparks: increase in quantity per 1 m/s")
            .defineInRange("uckCountPerSpeed", 0.04D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue UCK_SPEED = BUILDER
            .comment("sparks: static velocity of dispersion")
            .defineInRange("uckSpeed", 0.23D, 0.0D, Double.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue MAX_UCK_PARTICLES_PER_COLLISION = BUILDER
            .comment("Max sparks per hit")
            .defineInRange("maxUckParticlesPerCollision", 200.0D, 1.0D, Double.MAX_VALUE);

    static final ModConfigSpec SPEC = BUILDER.build();

    private Config() {
    }
}
