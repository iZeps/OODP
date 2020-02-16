package org.oodp.factories;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFactory {

    List<TetraminoFactory> factoryList = Arrays.asList(
            new IBlockFactory(),
            new OBlockFactory(),
            new SBlockFactory(),
            new ZBlockFactory(),
            new JBlockFactory(),
            new LBlockFactory(),
            new TBlockFactory());

    public TetraminoFactory getRandomBlockFactory() {
        int randomNumber = new Random().nextInt(factoryList.size());

        return factoryList.get(randomNumber);
    }

}
