package designpattern.behavioral.observer;

public class Main {

    public static void main(String... args) {

        YouTubeChannel channel = new YouTubeChannel();
        Subscriber anurag = new Subscriber("Anurag");
        Subscriber robert = new Subscriber("Robert");
        Subscriber david = new Subscriber("David");
        Subscriber steve = new Subscriber("Steve");

        channel.subscribe(anurag);
        channel.subscribe(robert);
        channel.subscribe(david);
        channel.subscribe(steve);
        channel.notifyChanges("Design Pattern");
    }
}
