package org.oodp.factories;

import org.oodp.tetraminos.LBlock;
import org.oodp.tetraminos.Tetramino;

public class LBlockFactory implements TetraminoFactory {
    @Override
    public Tetramino createTetramino() {
        return new LBlock();
    }
}
