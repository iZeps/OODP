package org.oodp;

import org.oodp.tetraminos.Tetramino;

import java.util.Arrays;

public class TetraminoParser {

    public String parseStructure(Tetramino tetramino) {

        String result = Arrays.deepToString(tetramino.getStructure())
                .replace("1", Constants.BLOCK)
                .replace("0", "  ")
                .replace("],","\n")
                .replace(", ", " ")
                .replace("[[", "")
                .replace(" [", "")
                .replace("]]", "\n");

        return result;
    }

}
