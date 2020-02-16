package org.oodp;

import org.oodp.factories.RandomFactory;

public class Main {
    public static void main(String[] args) {

        RandomFactory randomFactory = new RandomFactory();
        Screen screen = new Screen();

        for (int i = 0; i < 10; i++) {
            screen.displayTetramino(randomFactory.getRandomBlockFactory());
        }
    }
}
