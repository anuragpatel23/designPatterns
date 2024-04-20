package designpattern.creational.singleton;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

public class Car implements Serializable, Cloneable {

    private static Car car;
    private Car(){
        //1- Solution to avoid breaking singleton. Throw exception from constructor
        /*
        //uncomment this to see the solution for breaking against reflection api
        if(car!=null){
            throw new RuntimeException("You are trying to break Singleton pattern");
        }*/
    }

    // LAZY way of initialization
    public static Car getCar(){
        //this will return object of car

        if(car == null){
                car = new Car();
        }

        return car;
    }

    /*
    *
    * 1- Constructor private
    * 2- Create Car object with the help of getCar method()
    * 3- create a private static object so that no one can access it outside
    * */

    /*
    //uncomment this method override to stop breaking singleton via serialization
    public Object readResolve(){
        return car;
    }*/

    /*
    //uncomment this for cloning method
    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        //solution for cloning method
        //return the same object instead just calling the super clone method()
        return car;
    }*/

}
