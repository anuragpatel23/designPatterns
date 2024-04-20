package designpattern.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Singleton {
    public static void main(String... args) throws Exception, CloneNotSupportedException {

        /*
         * There is an EAGER way also which will keep the object created even if not requested.
         * */

        Bus bus1 = Bus.getBus();
        Bus bus2 = Bus.getBus();
        System.out.println(bus1.hashCode());
        System.out.println(bus2.hashCode());

        /*
        * This is LAZY way of object creation because object will not be created
        * till it is not called i.e. getCar method is called
        * */

        //just because the class constructor is private we cant create direct object
        Car car1 = Car.getCar();
        Car car2 = Car.getCar();
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        /*EAGER
        * Pros: This gives easy implementation of Singleton
        * Cons: Just because it will always create the object even if it's not required there could be a lot of memory
        * wastage
        *
        * LAZY
        * Pros: Object is not created unnecessarily, only if its needed its created.
        * Cons: it will not perform as expected with threads. Suppose 2 threads call the same get method for the first
        * time and both will get object as null and both will create that object.
        * We can overcome with this problem by using threads in a Synchronized way.
        *
        * 1- Make the method as synchronized    - Method synchronization
        * 2- Make that block where object is created as synchronized    - Block synchronization
        * */

        /*How to break Singleton Pattern?
        * 1- Using Reflection API
        * Solution
        * - if object is present then throw exception from inside Constructor
        * - use enum
        *
        * 2- Using Serialization and deserialization
        * Solution: implement readResolve method in the class
        *
        * 3- Cloning
        * Solution: return the same object while overriding the clone() method
        *
        * */

        /*

        //Uncomment this to see the Reflection API usage to break singleton pattern

        Car car = Car.getCar();
        System.out.println(car.hashCode());

        Constructor<Car> constructor = Car.class.getDeclaredConstructor();
        //just because the constructor is private we would use reflection to change it to public

        constructor.setAccessible(true);
        Car c1 = constructor.newInstance();
        Car c2 = constructor.newInstance();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());*/

        /*
        * 1- throwing Exception from inside constructor
        * */

        /*
        * 2- Using enum
        * */

        /*
        //uncomment this to see solution against reflection API

        MiniCar miniCar = MiniCar.INSTANCE;
        System.out.println(miniCar.hashCode());

        Constructor<MiniCar> construct = MiniCar.class.getDeclaredConstructor();
        MiniCar mini1 = construct.newInstance();

        // here we will get exception as there is no such method.

        System.out.println(mini1.hashCode());
        */

        /*
        * 2- Using serialization and deserialization for breaking singleton
        * */

        /*
        //uncomment this to see the breaking of singleton using serialization
        Car car3 = Car.getCar();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.obj"));
        oos.writeObject(car3);
        //serialization done
        //now deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.obj"));
        Car car4 = (Car) ois.readObject();

        System.out.println(car3.hashCode());
        System.out.println(car4.hashCode());
        */

        /*
        //uncomment this to see the breaking of singleton using cloning

        Car car5 = (Car) car1.clone();
        Car car6 = (Car) car1.clone();
        System.out.println(car5.hashCode());
        System.out.println(car6.hashCode());
        */

    }
}
