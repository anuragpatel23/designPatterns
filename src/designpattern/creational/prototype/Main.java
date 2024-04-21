package designpattern.creational.prototype;

public class Main {
    public static void main(String... args) throws InterruptedException {
        System.out.println("Prototype design pattern");
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.setHostname("asdfghjkl");
        databaseConnection.setDialect("Oracle");
        databaseConnection.setSid("afsdfsf");
        databaseConnection.setUsername("asdf");
        databaseConnection.setPassword("sfsdfsdf");
        databaseConnection.setPort(1234);

        databaseConnection.fetchBigTableResult();
        try {
            DatabaseConnection databaseConnection2 = (DatabaseConnection) databaseConnection.clone();
            DatabaseConnection databaseConnection3 = (DatabaseConnection) databaseConnection.clone();

        System.out.println(databaseConnection);
        databaseConnection.getDomains().remove(0);
        System.out.println(databaseConnection);
        System.out.println(databaseConnection2);
        databaseConnection2.getDomains().remove(1);
        System.out.println(databaseConnection2);
        System.out.println(databaseConnection3);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }



    }
}
