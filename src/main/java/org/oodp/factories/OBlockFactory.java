package org.oodp.factories;

import org.oodp.tetraminos.OBlock;
import org.oodp.tetraminos.Tetramino;

public class OBlockFactory implements TetraminoFactory {
    @Override
    public Tetramino createTetramino() {
        return new OBlock();
    }
}
