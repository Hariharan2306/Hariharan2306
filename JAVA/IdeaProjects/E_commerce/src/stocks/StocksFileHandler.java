package stocks;

import main.Ecommerce;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class StocksFileHandler {
    private final String fileName="Stocks.txt";
    public void initialize() throws IOException {//to read all data from file to stocksMap
        File file=new File(fileName);
        if(file.exists() && file.length()!=0){
            BufferedReader bfr=new BufferedReader(new FileReader(file));
            String stockInfo =bfr.readLine();
            do{
                StocksDetails stocks=stringSplitter(stockInfo);

                Ecommerce.stockMap.put(stocks.stockName, stocks);

//                {StocksDetails stockBranch=Ecommerce.stockMap.get(stocks.stockName);//to copy branch details map from file
//                stockBranch.areaStock=stocks.areaStock;
////                    System.out.println(stockBranch.areaStock);
////                    System.out.println(stocks.areaStock);
//                }
                stockInfo =bfr.readLine();
            }while(stockInfo !=null);
            bfr.close();
        }
    }
    private StocksDetails stringSplitter(String stockInfo) {
        String[] arr=stockInfo.split("#");
        HashMap<String ,Integer> convertedMapFromString =stringToMap(arr[2]);
//        System.out.println(arr[2]);
//        System.out.println(stringToMap(arr[2]));
        StocksDetails details=new StocksDetails(arr[0],Integer.parseInt(arr[1]), convertedMapFromString,Double.parseDouble(arr[3]));
        return details;
    }
    public void addStockToFile(StocksDetails stock){
        File file=new File(fileName);
        BufferedWriter bfw=null;
        try {
            bfw=new BufferedWriter(new FileWriter(file,true));
            bfw.write(stock.toString()+"\n");
            bfw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private HashMap<String,Integer> stringToMap(String mapString){
//        System.out.println(mapString);
        mapString=mapString.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(mapString);
        HashMap<String ,Integer>areaStock=new HashMap<>();
        int i;
        String key="",value="";
        for(i=0;i<mapString.length();i++){
            if((mapString.charAt(i)>='A'&& mapString.charAt(i)<='Z') || (mapString.charAt(i)>='a' && mapString.charAt(i)<='z')){//if String is alphabet
                if(!key.equals("") && !value.equals("")) {
                    areaStock.put(key,Integer.parseInt(value));
                    key="";
                    value="";
                }
                key+=mapString.charAt(i);}
            else if(mapString.charAt(i)>='0' || mapString.charAt(i)<='9'){
                value+=mapString.charAt(i);
                if(i==mapString.length()-1 && !key.equals("") && !value.equals("")){
                    areaStock.put(key,Integer.parseInt(value));
                    key="";
                    value="";
                }
            }
        }
//        System.out.println(areaStock);
        return areaStock;
    }
    public void finalization(){
        File file=new File(fileName);
        BufferedWriter bfw =null;
        try {
            bfw =new BufferedWriter(new FileWriter(file));
            Set keySet = Ecommerce.stockMap.keySet();
            Iterator itr = keySet.iterator();
            while (itr.hasNext()){
                String eachKey= (String) itr.next();
                StocksDetails data=Ecommerce.stockMap.get(eachKey);
                bfw.write(data.toString()+"\n");
            }bfw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}