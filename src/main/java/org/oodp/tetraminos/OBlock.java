package org.oodp.tetraminos;

public class OBlock implements Tetramino {
    public int[][] structure = {
            {1, 1},
            {1, 1}
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
        System.out.println("██ ██\n██ ██\n");
    }
}
