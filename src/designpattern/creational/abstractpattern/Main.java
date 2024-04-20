package designpattern.creational.abstractpattern;

public class Main {
    public static void main(String... args){

        Employee emp1 = EmployeeFactory.getEmployee(new DesignerFactory());
        Employee emp2 = EmployeeFactory.getEmployee(new DeveloperFactory());

       System.out.println( emp1.name());
       System.out.println( emp2.name());
       System.out.println( emp1.salary());
       System.out.println( emp2.salary());
    }
}
