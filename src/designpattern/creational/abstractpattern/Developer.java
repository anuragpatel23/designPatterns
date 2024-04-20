package designpattern.creational.abstractpattern;

public class Developer implements Employee{
    @Override
    public int salary(){
        return 1000;
    }

    @Override
    public String name(){
        return "Developer";
    }
}
