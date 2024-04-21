package designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();

    String videoTitle;

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void notifyChanges(String videoTitle) {
        for(Observer ob: this.subscribers){
            ob.notified(videoTitle);;
        }
    }
}
