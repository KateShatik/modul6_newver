/**
 * Created by Катя on 04.12.2016.
 */
public class UserUtil {

    public static  User[] uniqueUsers(User[] users) {

        User[] uniqueUsers= new User[users.length];

        int index=0;
        for(int i=0; i< users.length;i++) {
            User curr = users[i];
            boolean flag = false;
            for (int j = 0; j < index; j++) {
                if (uniqueUsers[j].equals(curr)) flag = true;
            }
            if (flag == false) {
                uniqueUsers[index] = curr;
                index++;
            }
        }
        User[] uniqueUsers2= new User[index];
        for(int k=0; k<index;k++){
            uniqueUsers2[k]= uniqueUsers[k];
        }
        return uniqueUsers2;
    }

    public  static  User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersWithContitionalBalance = new User[users.length];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                usersWithContitionalBalance[index] = users[i];
                index++;
            }
        }
        User[] usersWithContitionalBalance2 = new User[index];
        for(int i=0; i<index; i++){
            usersWithContitionalBalance2[i]=usersWithContitionalBalance[i];
        }
        return usersWithContitionalBalance2;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            int balance = users[i].getBalance();
            users[i].setBalance(users[i].getSalary()+balance);
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] id = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            id[i] = users[i].getId();
        }
        return id;
    }

    public static  User[] deleteEmptyUsers(User[] users) {
        User[] newArrayOfUsers = new User[users.length];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (!(users[i].equals(null))) {
                newArrayOfUsers[index] = users[i];
                index++;
            }
        }
        return newArrayOfUsers;
    }
}
