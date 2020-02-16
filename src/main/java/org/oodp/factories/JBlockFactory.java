package org.oodp.factories;

import org.oodp.tetraminos.JBlock;
import org.oodp.tetraminos.Tetramino;

public class JBlockFactory implements TetraminoFactory {
    @Override
    public Tetramino createTetramino() {
        return new JBlock();
    }
}
