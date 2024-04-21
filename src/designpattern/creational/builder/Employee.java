package designpattern.creational.builder;

import designpattern.creational.abstractpattern.EmployeeFactory;

public class Employee {

    private final String name;
    private final String email;
    private final int salary;
    private final String address;

    private Employee(EmployeeBuilder employeeBuilder){
        this.name = employeeBuilder.name;
        this.email = employeeBuilder.email;
        this.salary = employeeBuilder.salary;
        this.address = employeeBuilder.address;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        return "name: "+this.name+" address: "+this.address+" email: "+this.email+" salary: "+this.salary;
    }

    static class EmployeeBuilder{
        private String name;
        private String email;
        private int salary;
        private String address;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Employee build(){
            Employee employee = new Employee(this);
            return employee;
        }
    }
}
