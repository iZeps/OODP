package org.oodp;

import org.oodp.tetraminos.Tetramino;

public class Rotation {

    public static int[][] rotate(Tetramino tetramino){
        int[][] before = tetramino.getStructure();
        int[][] after = new int[before[0].length][before.length];
        for (int i = 0; i < before.length; i++)
            for (int j = 0; j < before[0].length; j++)
                after[j][i] = before[i][j];
        return after;
    }
}