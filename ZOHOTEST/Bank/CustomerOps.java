package Bank;

import java.util.Scanner;

public class CustomerOps {
    Scanner sc = new Scanner(System.in);
    public void addCustomers(){
        System.out.println("Enter customer Name ");
        String name = sc.next();
        String pasString,reTypePass;
        
        do{
            System.out.println("Enter Password ");
            pasString = sc.next();
            System.out.println("Kindly retype password ");
            reTypePass = sc.next();
            if(!pasString.equals(reTypePass))
                System.out.println("password mismatch try again ");
        }while(!pasString.equals(reTypePass));

        Customer c = new Customer(++Bank.customerId, ++Bank.accNo, name, Bank.INITIALBALANCE, encryption(pasString));
        Bank.customerList.add(c);
        Bank.customerMap.put(name, c);
    }

    String encryption(String s){
        String op = "";
        for(char i: s.toCharArray()){
            if(i == '9')
                op+= "10";
            else if(i == 'z')
                op += 'a';
            else if(i == 'Z')
                op += 'A';
            else op += (char)(i+1);
        }
        return op;
    }
    
    void listCustomers(){
        System.out.println("Listing Customers ");
        System.out.println();

        for(Customer el: Bank.customerList){
            System.out.println(el.getCustomerId()+" "+ el.getAccountId()+" "+ el.getName()+" "+ el.getBalance()+" "+el.getPassword());
        }
    }

    boolean authentication(String userName,String userPass){
        // System.out.println("Enter name ");
        // String userName = sc.next();
        // System.out.println("Enter password ");
        // String userPass = sc.next();

        Customer c = Bank.customerMap.get(userName);
        if(c == null){
            System.out.println("No User Found ");
            return false;
        }
        String dbPass  = c.getPassword();
        
        return dbPass.equals(encryption(userPass));
    }
}
