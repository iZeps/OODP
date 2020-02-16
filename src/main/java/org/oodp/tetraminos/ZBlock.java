package org.oodp.tetraminos;

public class ZBlock implements Tetramino {
    public int[][] structure = {
            {0, 0, 0},
            {1, 1, 0},
            {0, 1, 1}
    };

    @Override
    public int[][] getStructure() {
        return structure;
    }

    @Override
    public void setStructure(int[][] structure) {
        this.structure = structure;
    }
}
