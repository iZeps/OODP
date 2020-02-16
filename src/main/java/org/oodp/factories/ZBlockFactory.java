package org.oodp.factories;

import org.oodp.tetraminos.Tetramino;
import org.oodp.tetraminos.ZBlock;

public class ZBlockFactory implements TetraminoFactory {
    @Override
    public Tetramino createTetramino() {
        return new ZBlock();
    }
}
