package designpattern.creational.builder;

public class Main {

    public static void main(String... args){
        Employee emp = new Employee.EmployeeBuilder().setName("Anurag")
                .setAddress("NYC")
                .setEmail("abc@gmail.com")
                .setSalary(12345)
                .build();

        System.out.println(emp);
    }
}
