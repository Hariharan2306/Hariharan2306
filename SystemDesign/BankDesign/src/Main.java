package SystemDesign.BankDesign.src;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileHandler handler=new FileHandler();
        try {
            handler.initialize();//to write all the data from file to arraylist
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(Bank.customerMap);
        menu();
        handler.finalization();
    }
    public static void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input as given below " +
                "\n 1-create new user \n 2-Deposit \n 3-Withdraw \n 4-Fund transfer");
        try{
            int option=sc.nextInt();
            CustomerHandler handler1=new CustomerHandler();
            ATM atm=new ATM();
            switch (option){
                case 1:
                    handler1.addNewCustomer();
                    break;
                case 2:
                    if(handler1.authentication()){
                        System.out.println("authentication success \n");
                         atm.deposit();
                    }
                    else
                        System.out.println("invalid user or no user found ");
                    break;
                case 3:
                    if(handler1.authentication()){
                        System.out.println("authentication success \n");
                        atm.withdraw();
                    }
                    else
                        System.out.println("invalid user or no user found ");
                    break;
                case 4:
                    if(handler1.authentication()){
                        System.out.println("authentication success \n");
                        atm.fundTransfer();
                    }
                    else
                        System.out.println("invalid user or no user found ");
                    break;
                default:
                    System.out.println("invalid option ");
                    break;
            }
        }catch (Exception e){
            System.out.println("enter options of given above only ");
        }
    }
}