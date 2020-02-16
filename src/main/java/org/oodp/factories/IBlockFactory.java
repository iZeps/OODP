package org.oodp.factories;

import org.oodp.tetraminos.IBlock;
import org.oodp.tetraminos.Tetramino;

public class IBlockFactory implements TetraminoFactory {
    @Override
    public Tetramino createTetramino() {
        return new IBlock();
    }
}
