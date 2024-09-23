package Proj1;

import java.util.ArrayList;
import java.util.List;

public class ContentProvider implements Subject {
    private String name;
    private List<Observer> subscribers;

    public ContentProvider(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String content) {
        for (Observer observer : subscribers) {
            observer.update(name, content);
        }
    }

    public String getName() {
        return name;
    }
}
