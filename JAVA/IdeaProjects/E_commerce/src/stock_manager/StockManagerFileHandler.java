package stock_manager;

import main.Ecommerce;
import stock_manager.StockManagerDetails;

import java.io.*;
public class StockManagerFileHandler {
    private final String fileName="StockManagerPersonalDetails.txt";
    public void initialize() throws IOException {//to read all data from file to sMap
        File file=new File(fileName);
        if(file.length()!=0 && file.exists()){
            BufferedReader bfr=new BufferedReader(new FileReader(file));
            String ManagerInfo =bfr.readLine();
            //        System.out.println(ManagerInfo);
            do{
                StockManagerDetails manager=stringSplitter(ManagerInfo);
//                System.out.println(manager);
                Ecommerce.sMap.put(manager.sId,manager);
//                System.out.println(main.Ecommerce.sMap);
                ManagerInfo =bfr.readLine();
            }while(ManagerInfo !=null);
            bfr.close();
        }
    }
    public void addManagerToFile(StockManagerDetails manager){
        File file=new File(fileName);
        try {
            BufferedWriter bfw=new BufferedWriter(new FileWriter(file,true));
            bfw.write(manager.toString()+"\n");
            bfw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private StockManagerDetails stringSplitter(String customerInfo){
        String[] data=customerInfo.split(" ");
//        System.out.println(data[0]);
        StockManagerDetails manager=new StockManagerDetails(Integer.parseInt(data[0]),data[1],data[2],data[3],data[4]);
        return manager;
    }
}