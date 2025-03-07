package Ecommerce;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome \nEnter 'y' if wish to Exit \nEnter any other Key if you wish to proceed ");
        String exitFlag = sc.nextLine();
        do {
            System.out.println("Enter 1 for login \nEnter 2 to register user ");
            String userOption = sc.nextLine();
            switch (userOption) {
                case "1":
                    login();
                    break;
                case "2":
                    createUser();
                    break;

                default:
                    break;
            }
        } while (!exitFlag.equals("y"));
    }

    private static void createUser() {
        System.out.println("Enter UserName ");
        String userName = sc.nextLine();
        String passWord, conformPassword;
        do {
            System.out.println("Enter Password ");
            passWord = sc.nextLine();
            System.out.println("Enter conform Password ");
            conformPassword = sc.nextLine();
            if (!passWord.equals(conformPassword))
                System.out.println("Password mismatch try typing Password again");
        } while (!passWord.equals(conformPassword));
        System.out.println("Enter Mobile Number ");
        String mobile = sc.nextLine();

        Customers newCustomer = new Customers(userName, conformPassword, mobile, Double.valueOf(10000));
        Db.userMap.put(userName, newCustomer);
        System.out.println("New User Created Successfully ");
    }

    private static boolean login() {
        System.out.println("Enter your Registered Username");
        String userName = sc.nextLine();
        String passWord;
        Customers userData;
        do {
            System.out.println("Enter Password");
            passWord = sc.nextLine();
            userData = Db.userMap.get(userName);
            if (userData == null) {
                System.out.println("\nIncorrect User name\n");
                break;
            }
            if (!userData.getPassWord().equals(passWord))
                System.out.println("\nIncorrect password - try again \n");
        } while (!userData.getPassWord().equals(passWord));
        return userData != null && userData.getPassWord().equals(passWord);
    }
    // private static
}
