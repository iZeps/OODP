package org.oodp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recorder implements Subscriber {

    private List<String> listOfTetraminos = new ArrayList<>();

    public Recorder(TetraminoDrawer tetraminoDrawer) {
        tetraminoDrawer.addSubscriber(this);
    }

    @Override
    public void handleNotification(String tetramino) {
        listOfTetraminos.add(tetramino);
    }

    public void printStatistics() {
        List<String> distinctCharacters =  listOfTetraminos.stream().distinct().collect(Collectors.toList());

        for (String string: distinctCharacters) {
            String replace = string.replace("org.oodp.tetraminos.", "");
            int i = (int) listOfTetraminos.stream().filter(s -> s.contains(replace)).count();
            System.out.println(replace + ": " + i);
        }

    }
}
