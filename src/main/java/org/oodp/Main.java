package org.oodp;

import org.oodp.factories.RandomFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        RandomFactory randomFactory = new RandomFactory();
        TetraminoDrawer tetraminoDrawer = new TetraminoDrawer();
        Recorder recorder = new Recorder(tetraminoDrawer);

        for (int i = 0; i < 100; i++) {
            tetraminoDrawer.displayTetramino(randomFactory.getRandomBlockFactory());
            Thread.sleep(100);
        }
        recorder.printStatistics();
    }
}
