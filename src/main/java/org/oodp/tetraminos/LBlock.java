package org.oodp.tetraminos;

public class LBlock implements Tetramino {
    public int[][] structure = {
            {0, 1, 0},
            {0, 1, 0},
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
