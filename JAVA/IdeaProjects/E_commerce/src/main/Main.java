package main;

import customer.CustomerAction;
import customer.CustomerFileHandler;
import customer.CustomerHandler;
import stock_manager.StockManagerFileHandler;
import stock_manager.StockManagerHandler;
import stocks.StocksFileHandler;
import stocks.StocksHandler;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerFileHandler fileHandler=new CustomerFileHandler();
        StockManagerFileHandler fileHandler1=new StockManagerFileHandler();
        StocksFileHandler fileHandler2=new StocksFileHandler();
        try {
            fileHandler.initialize();
            fileHandler1.initialize();
            fileHandler2.initialize();
        } catch (IOException e) {
            e.printStackTrace();
        }
        menu();
        try {
            fileHandler2.finalization();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void menu(){
        Scanner sc=new Scanner(System.in);
        int reOption,option,customerOrNot;
        CustomerHandler handler=new CustomerHandler();
        do{
            System.out.println("if you are a customer press 1 to continue\n" +
                    "if you are a stocks manager press -1 to continue");
            customerOrNot=sc.nextInt();

            if(customerOrNot==1) {
                System.out.println("welcome to customer area\n\n");

                System.out.println("Please enter options below to proceed\n\n" +
                        "to add new customer id press 1\n " +
                        "to shop press 2 ");

                option = sc.nextInt();

                try {
                    switch (option) {

                        case 1:
                            handler.customerSignUp();
                            break;
                        case 2:
                            if(handler.authenticate()){
                                System.out.println("authentication success\n ");
                                CustomerAction action=new CustomerAction();
                                action.Buy();
                            }
                            else
                                System.out.println("authentication failed -incorrect password\n ");
                            break;
                        default:
                            System.out.println("please enter valid options\n ");
                            break;
                    }
                }catch (Exception e){
                    System.out.println("enter valid input only\n ");
                    e.printStackTrace();
                }
            }
            else if(customerOrNot==-1){
                System.out.println("welcome to stock manager area ");

                System.out.println("Please options below to proceed\n" +
                        "to add new stocks manager id press 1\n" +
                        "to add new Stocks in market press 2");

                option=sc.nextInt();
                StockManagerHandler handler1=new StockManagerHandler();
                StocksHandler handler2=new StocksHandler();
                try {
                    switch (option) {
                        case 1:
                            handler1.stockManagerSignUp();
                            break;
                        case 2:
                            if(handler1.authenticate()){
                                System.out.println("Authentication success \n");
                                handler2.addStocks();
                            }
                            else
                                System.out.println("Authentication failed-Incorrect password");
                            break;
                        default:
                            System.out.println("enter valid options ");
                            break;
                    }
                }catch (Exception e){
                    System.out.println("please enter valid input ");
                    e.printStackTrace();
                }
            }

            else
                System.out.println("please enter valid options for customer or stock manager ");

            System.out.println("Enter 5 to check any others ");
            System.out.println("enter any other to exit ");
            reOption=sc.nextInt();
        }while (reOption==5);

        System.out.println("thank you");
    }
}