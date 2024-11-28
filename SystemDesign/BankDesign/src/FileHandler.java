package SystemDesign.BankDesign.src;
import java.io.*;
import java.util.Iterator;
import java.util.Set;

public class FileHandler {
    private static final String fileName="bank_db.txt";//for privacy of name of thr file//also if want to change file name in future have to  change everywhere
    public void initialize()throws Exception{
        File file=new File(fileName);
        BufferedReader bfr=null;

        bfr=new BufferedReader(new FileReader(file));
        String customerInfo=bfr.readLine();
//        System.out.println(customerInfo+" "+position);
        do{
            Customer customerClass=splittingStringVal(customerInfo);
            Bank.customerList.add(customerClass);
            Bank.customerMap.put(customerClass.customerId,customerClass);//changes
            customerInfo=bfr.readLine();
//            System.out.println(customerInfo+" "+position);
        }while (customerInfo!=null);
        bfr.close();

        int lastPosition =Bank.customerList.size()-1;
        Bank.accNo=Bank.customerList.get(lastPosition).accNo;//gets last persons accno and id to increment and save it for nxt person
        Bank.customerId=Bank.customerList.get(lastPosition).customerId;//using ref of Bnk class calls customerList
        //then using customerList.get(index)/*as object*/to access customerId variable in Customer class
    }
    private Customer splittingStringVal(String customerInfo){
        String[] data=customerInfo.split(" ");//this array contains first person's data only
        Customer customer=new Customer(Integer.parseInt(data[0]),
                                        Long.parseLong(data[1]),
                                        data[2],
                                        Double.parseDouble(data[3]),
                                        data[4]);
        return customer;
    }
    public void addCustomertoFile(Customer customer){//accessed only when new user is created
        File file=new File(fileName);
        BufferedWriter bfw =null;
        try {
            bfw =new BufferedWriter(new FileWriter(file,true));
            bfw.write("\n"+customer.toString());
            bfw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void finalization(){
        File file=new File(fileName);
        BufferedWriter bfw =null;
        try {
            bfw =new BufferedWriter(new FileWriter(file));

            Set keySet=Bank.customerMap.keySet();
            Iterator iterator=keySet.iterator();

            while(iterator.hasNext()) {
                int customerId=(int) iterator.next();
                Customer customer = Bank.customerMap.get(customerId);
                bfw.write(customer.toString()+"\n");
            }
            bfw.close();
        } catch (IOException e)  {
            e.printStackTrace();
        }
    }
}