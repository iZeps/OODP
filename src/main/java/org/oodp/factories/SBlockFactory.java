package org.oodp.factories;

import org.oodp.tetraminos.SBlock;
import org.oodp.tetraminos.Tetramino;

public class SBlockFactory implements TetraminoFactory {
    @Override
    public Tetramino createTetramino() {
        return new SBlock();
    }
}
