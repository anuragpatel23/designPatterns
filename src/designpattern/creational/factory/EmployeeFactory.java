package designpattern.creational.factory;

public class EmployeeFactory {

    public static Employee getEmployee(String employeeType){
        if(employeeType.trim().equalsIgnoreCase("FrontEnd")) {
            return new FrontEndDeveloper();
        }
        else if(employeeType.trim().equalsIgnoreCase("BackEnd")) {
            return new BackendDeveloper();
        } else{
            return null;
        }
    }
}
