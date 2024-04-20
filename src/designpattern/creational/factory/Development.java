package designpattern.creational.factory;

public class Development {
    public static void main(String... args){
        Employee emp1 = EmployeeFactory.getEmployee("BackEnd");
        Employee emp2 = EmployeeFactory.getEmployee("FrontEnd");
        System.out.println(emp1.developer());
        System.out.println(emp2.developer());
    }
}
