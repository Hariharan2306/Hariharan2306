package IntPractice.Bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CustomerFileHandler {
    private static final String fileName = "Bank/bank_db.txt";

    public void initialize()throws Exception{
        File file=new File(fileName);
        BufferedReader bfr=null;

        bfr=new BufferedReader(new FileReader(file));
        String customerInfo=bfr.readLine();
        do{
            Customer customerClass = splittingStringVal(customerInfo);
            Bank.customerList.add(customerClass);
            customerInfo=bfr.readLine();
        }while (customerInfo!=null);
        bfr.close();
        int lastPosition =Bank.customerList.size()-1;
        Bank.accNo=Bank.customerList.get(lastPosition).getAccountId();
        Bank.customerId=Bank.customerList.get(lastPosition).getCustomerId();
    }


    Customer splittingStringVal(String customerInfo){
        String[] a = customerInfo.split(" ");

        Customer cObject = new Customer(Integer.parseInt(a[0]), Long.parseLong(a[1]), a[2], Double.parseDouble(a[3]), a[4]);
        return cObject;
    }
}