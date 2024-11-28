package customer;

import main.Ecommerce;

import java.io.*;
public class CustomerFileHandler {
    private final String fileName="CustomerPersonalDetails.txt";
    public void initialize() throws IOException {//to read all data from file to sMap
        File file=new File(fileName);
        if(file.length()!=0 && file.exists()){
            BufferedReader bfr=new BufferedReader(new FileReader(file));
            String customerInfo=bfr.readLine();
    //        System.out.println(customerInfo);
            do{
                CustomerDetails customer=stringSplitter(customerInfo);
    //            System.out.println(customer);
                Ecommerce.cMap.put(customer.name,customer);
    //            System.out.println(customer.CustomerHandler.sMap);
                customerInfo=bfr.readLine();
            }while(customerInfo!=null);
            bfr.close();
        }
    }
    public void addCustomerToFile(CustomerDetails customer){
        File file=new File(fileName);
        try {
            BufferedWriter bfw=new BufferedWriter(new FileWriter(file,true));
            bfw.write(customer.toString()+"\n");
            bfw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private CustomerDetails stringSplitter(String customerInfo){
        String[] data=customerInfo.split(" ");
        CustomerDetails customer=new CustomerDetails(data[0],data[1],data[2],data[3],data[4]);
        return customer;
    }
}