package org.oodp;

import java.util.ArrayList;
import java.util.List;

public class SubscriberHandler {

    List<Subscriber> subscribersList = new ArrayList<>();

    void addSubscriber(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }

    void notifySubscribers(String tetramino) {
        for (Subscriber subscriber : subscribersList) {
            subscriber.handleNotification(tetramino);
        }
    }

//    void removeSubscriber(Subscriber subscriber) {
//        subscribersList.remove(subscriber);
//    }

}
