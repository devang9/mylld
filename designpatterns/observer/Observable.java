package designpatterns.observer;

public interface Observable {
    void subscribe(Observer observer);
    void notifyAllSubscribers();
    void unsubscribe(Observer observer);
}
