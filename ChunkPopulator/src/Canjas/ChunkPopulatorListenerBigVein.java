package Canjas;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;

import java.util.ArrayList;
import java.util.Random;

public class ChunkPopulatorListenerBigVein extends BlockPopulator {
    private final Material mat;
    private final int chance;

    public ChunkPopulatorListenerBigVein(Material mat, int chance) {
        this.mat = mat;
        this.chance = chance;
    }

    @Override
    public void populate(World world, Random rand, Chunk chunk) {
        Block block;
        for (int x = 0; x < 16; x++) {
            for (int y = 1; y < 70; y++) {
                for (int z = 0; z < 16; z++) {
                    block = chunk.getBlock(x, y, z);
                    int r = (int) (Math.random() * chance);
                    if (r == 3 && block.getType().compareTo(Material.STONE) == 0) {
                        switch((int) Math.random() * (10)) {
                            case 0: vein1(chunk, x, y, z);
                            case 1: vein2(chunk, x, y, z);
                            case 2: vein3(chunk, x, y, z);
                            case 3: vein4(chunk, x, y, z);
                            case 4: vein5(chunk, x, y, z);
                            case 5: vein6(chunk, x, y, z);
                            case 6: vein7(chunk, x, y, z);
                            case 7: vein8(chunk, x, y, z);
                            case 8: vein9(chunk, x, y, z);
                            case 9: vein10(chunk, x, y, z);
                        }
                    }
                }
            }
        }
    }
    private void vein1(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch (Exception e) {}
        try { chunk.getBlock(x-1, y, z).setType(mat, false); }
        catch (Exception e) {}
        try { chunk.getBlock(x, y, z+1).setType(mat, false); }
        catch (Exception e) {}
        try {  chunk.getBlock(x, y, z-1).setType(mat, false); }
        catch (Exception e) {}
    }
    private void vein2(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x-1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y+1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y-1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y, z+1).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y, z-1).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y+1, z).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein3(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y+1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y-1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y+1, z+1).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein4(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+2, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x-1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y+1, z).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein5(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y+1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x-1, y, z).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein6(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z+1).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y, z+1).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein7(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein8(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y+1, z).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein9(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y+1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y+1, z+1).setType(mat, false); }
        catch(Exception e) {}
    }
    private void vein10(Chunk chunk, int x, int y, int z) {
        try { chunk.getBlock(x, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x-1, y, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x-1, y+1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x+1, y+1, z).setType(mat, false); }
        catch(Exception e) {}
        try { chunk.getBlock(x, y, z+1).setType(mat, false); }
        catch(Exception e) {}
    }
}
