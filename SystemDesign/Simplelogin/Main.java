package SystemDesign.Simplelogin;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op = 0;

        do{
            System.out.println("If you want to view your details enter 1");
            System.out.println("If you want to Create USer Enter 2 ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("redirecting to View User");
                    printUserDetails();
                    break;
                case 2:
                    System.out.println("redirecting to Create User");
                    createUser();
                    break;

                default:
                    break;
            }
            op=-1;
    
        }while(op != -1);
        sc.close();
    }
    static void createUser(){
        System.out.println("enter user name to create");
        sc.nextLine();
        String userName = sc.nextLine();

        System.out.println("enter mobile to create ");
        String mobile = sc.nextLine();
        System.out.println("enter DOB to create ");
        String dob = sc.nextLine();

        String password = "",conformPass = "";
        do{
            System.out.println("enter Password to create ");
            password = sc.next();
            System.out.println("enter conform Password ");
            conformPass = sc.next();
            if(!password.equals(conformPass))
                System.out.println("Paswword mismatch try again ");
        }while(!password.equals(conformPass));

        User user = new User(userName, mobile, dob, password, DB.id);
        DB.userDetails.put(userName, user);
        System.out.println("user Created here your Id "+DB.id++);
    }

    static void printUserDetails(){
        System.out.println("Enter user name ");
        String userName = sc.next();
        System.out.println("Enter password ");
        String password = sc.next();

        User user = DB.userDetails.get(userName);
        if(user == null){
             System.out.println("No user Exists ");
            return;
        }
        if(!user.getpassword().equals(password)){
            System.out.println("Wrong pass");
            return;
        }
        System.out.println("username - "+user.getUserName());
        System.out.println("mobile - "+user.getmobile());
        System.out.println("dob - "+user.getdob());
        System.out.println("id - "+user.getId());
    }
}
