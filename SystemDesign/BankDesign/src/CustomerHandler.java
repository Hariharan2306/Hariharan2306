package SystemDesign.BankDesign.src;
import java.util.Scanner;
public class CustomerHandler {
    public void addNewCustomer() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter new name ");
        String name=sc.nextLine();

        System.out.println("enter new password ");
        String password=sc.nextLine();

        System.out.println("please re-type your new password for confirmation ");
        String retypePassword=sc.nextLine();

        if(!(retypePassword.equals(password))){
            System.out.println("user creation canceled --password and retyped password mismatch ");
            return;
        }
        if(!validPassword(password)){
            System.out.println("user creation canceled --password not acceptable ");
            return;
        }
        password=(encryptedPassword(password));

//        System.out.println(Bank.customerId);
        Bank.customerId++;
//        System.out.println(Bank.accNo);
        Bank.accNo++;
//        System.out.println(Bank.customerId+" "+Bank.accNo);
        Customer c=new Customer(Bank.customerId,
                Bank.accNo,
                name,
                Bank.INITIALBALANCE,
                password);//setter constructor
        Bank.customerList.add(c);//creating new element in arraylist
        Bank.customerMap.put(Bank.customerId,c);//also mapping the id to whole customer details
        FileHandler customer=new FileHandler();
        customer.addCustomertoFile(c);
        logTransaction(Bank.customerId);
    }
    private void logTransaction(int customerId){
        Transaction trans=new Transaction(1,"opening",10000,10000);
        TransactionFileHandler handler=new TransactionFileHandler();
        handler.writeTransaction(customerId,trans);
    }
    private boolean validPassword(String password){
         char[] pass=password.toCharArray();
         int i;
         for(i=0;i< pass.length;i++){
             if(('a'<=pass[i]&&pass[i]<='z') || ('A'<=pass[i]&&pass[i]<='Z') || ('0'<=pass[i]&&pass[i]<='9'))
                 continue;
             else
                 return false;
         }
        return true;
    }
    private String encryptedPassword(String password){
        char[] encryptPassArr =password.toCharArray();
        int i;
        for(i=0; i< encryptPassArr.length; i++){
            switch (encryptPassArr[i]){
                case '9':
                    encryptPassArr[i]='0';
                    break;
                case 'Z':
                    encryptPassArr[i]='A';
                    break;
                case 'z':
                    encryptPassArr[i]='a';
                    break;
                default:
                    encryptPassArr[i]= (char) (encryptPassArr[i]+1);
                    break;
            }
        }
        return String.valueOf(encryptPassArr);
    }
    public boolean authentication(){//changes
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bank id ");
        int id=sc.nextInt();
        System.out.println("enter password ");
        String password=sc.next();

        password=encryptedPassword(password);
        Customer c=Bank.customerMap.get(id);

        if(c==null){//case1 where there is no value and key present in the hashmap
//            System.out.println("no user found ");// which is no user for given id
            return false;}
        if(password.equals(c.password))
            return true;
        else
            return false;
    }
}