package org.oodp;

import org.oodp.factories.TetraminoFactory;
import org.oodp.tetraminos.Tetramino;

import java.util.Random;

import static org.oodp.Rotation.rotate;

public class TetraminoDrawer {

    public void  displayTetramino(TetraminoFactory tf) {
        Tetramino tetramino = tf.createTetramino();
        TetraminoParser tetraminoParser = new TetraminoParser();
        Random random = new Random();

        rotateXTimes(tetramino,random.nextInt(3));

        System.out.println(tetraminoParser.parseStructure(tetramino));
    }

    private void rotateXTimes(Tetramino tetramino, int number) {
        for (int i = 0; i < number; i++) {
            tetramino.setStructure(rotate(tetramino));
        }
    }

}
