package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable{
    private String latestVideoLink;

    public void setLatestVideoLink(String latestVideoLink) {
        this.latestVideoLink = latestVideoLink;
    }

    List<Observer> observerList = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyAllSubscribers() {
        for(Observer observer:observerList){
            observer.notifyAboutNewVideo(latestVideoLink);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }
}
