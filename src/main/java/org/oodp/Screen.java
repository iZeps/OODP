package org.oodp;

import org.oodp.factories.TetraminoFactory;

public class Screen {

    public void displayTetramino(TetraminoFactory tf) {
        tf.createTetramino().display();
    }

}
