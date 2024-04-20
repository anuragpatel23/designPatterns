package designpattern.creational.abstractpattern;

public class Designer implements Employee{
    @Override
    public String name() {
        return "Designer";
    }

    @Override
    public int salary() {
        return 20000;
    }
}
