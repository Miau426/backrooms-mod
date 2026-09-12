package com.backrooms.block;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    
    public static final Block CUSTOM_BLOCK_1 = registerBlock("custom_block_1",
        new CustomBlock1(AbstractBlock.Settings.copy(Blocks.STONE)
            .hardness(2.0f)
            .resistance(6.0f)));
    
    public static final Block CUSTOM_BLOCK_2 = registerBlock("custom_block_2",
        new CustomBlock2(AbstractBlock.Settings.copy(Blocks.STONE)
            .hardness(2.0f)
            .resistance(6.0f)));
    
    public static final Block CUSTOM_BLOCK_3 = registerBlock("custom_block_3",
        new CustomBlock3(AbstractBlock.Settings.copy(Blocks.STONE)
            .hardness(2.0f)
            .resistance(6.0f)));
    
    private static Block registerBlock(String name, Block block) {
        return Registry.register(
            Registries.BLOCK,
            Identifier.of("backrooms", name),
            block
        );
    }
    
    public static void registerModBlocks() {
        // Blöcke werden bei Klassenladung registriert
    }
}
