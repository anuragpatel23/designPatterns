package designpattern.creational.singleton;

public class Bus {
    //this is EAGER way of creating the singleton object
    private static Bus bus = new Bus();

    private Bus(){}
    public static Bus getBus(){
         return bus;
    }
}


/*
* Here we see object is created once and that to at the time of class description only
* */