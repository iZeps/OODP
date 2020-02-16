package org.oodp.factories;

import org.oodp.tetraminos.TBlock;
import org.oodp.tetraminos.Tetramino;

public class TBlockFactory implements TetraminoFactory {
    @Override
    public Tetramino createTetramino() {
        return new TBlock();
    }
}
