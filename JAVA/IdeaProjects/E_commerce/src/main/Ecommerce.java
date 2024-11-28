package main;

import customer.CustomerDetails;
import stock_manager.StockManagerDetails;
import stocks.StocksDetails;
import java.util.HashMap;

public class Ecommerce {
    public static HashMap<Integer , StockManagerDetails> sMap =new HashMap<>();
    public static HashMap<String , CustomerDetails> cMap =new HashMap<>();
    public static HashMap<String , StocksDetails> stockMap=new HashMap<>();
    public static int sId;

}
