package org.oodp;

import org.oodp.factories.RandomFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        RandomFactory randomFactory = new RandomFactory();
        TetraminoDrawer tetraminoDrawer = new TetraminoDrawer();

        for (int i = 0; i < 10; i++) {
            tetraminoDrawer.displayTetramino(randomFactory.getRandomBlockFactory());
            Thread.sleep(1000);
        }
    }
}
