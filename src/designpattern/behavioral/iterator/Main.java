package designpattern.behavioral.iterator;

public class Main {
    public static void main(String... args){
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Anurag", "1234"));
        userManagement.addUser(new User("David", "4567"));
        userManagement.addUser(new User("Steve", "7890"));

        MyIterator myIterator = userManagement.getIterator();
        while(myIterator.hasNext()){
            User user = (User) myIterator.next();
            System.out.println("name: "+user.getName()+" userId: "+user.getUserId());
        }
    }
}
