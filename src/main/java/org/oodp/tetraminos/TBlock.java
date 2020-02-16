package org.oodp.tetraminos;

public class TBlock implements Tetramino {
    public int[][] structure = {
            {0, 0, 0},
            {1, 1, 1},
            {0, 1, 0}
    };

    @Override
    public int[][] getStructure() {
        return structure;
    }

    @Override
    public void setStructure(int[][] structure) {
        this.structure = structure;
    }

    @Override
    public void display() {
        System.out.println("██ ██ ██\n   ██\n");
    }
}
