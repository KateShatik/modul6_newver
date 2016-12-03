/**
 * Created by Катя on 04.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        User[] user = new User[5];
        user[0] = new User(100,"Popov","Kostya",1500,2000);
        user[1]= new User(101,"Semida","Lera",2500,7000);
        user[2] = new User(102,"Shilkova","Marina",6500,2000);
        user[3] = new User(101,"Semida","Lera",2500,7000);
        user[4] = new User(102,"Shilkova","Marina",6500,2000);


        System.out.println("uniqueUsers");
        for(int i=0; i<UserUtil.uniqueUsers(user).length;i++){
            System.out.println(UserUtil.uniqueUsers(user)[i]);}

        System.out.println("usersWithContitionalBalance 2000");
        for(int i=0; i<UserUtil.usersWithContitionalBalance(user,2000).length;i++){
            System.out.println(UserUtil.usersWithContitionalBalance(user,2000)[i]);}

        System.out.println("paySalaryToUsers");
        User[] paySalaryToUsers = new User[user.length];
        paySalaryToUsers=UserUtil.paySalaryToUsers(user);
        for(int i=0; i<user.length;i++){
            System.out.println(paySalaryToUsers[i]);}

        System.out.println("getUsersId");
        for(int i=0; i<user.length;i++){
            System.out.println(UserUtil.getUsersId(user)[i]);}

        System.out.println("deleteEmptyUsers");
        User[] deleteEmptyUsers = new User[user.length];
        deleteEmptyUsers=UserUtil.deleteEmptyUsers(user);
        for(int i=0; i<user.length;i++){
            System.out.println(deleteEmptyUsers[i]);}
    }
}
