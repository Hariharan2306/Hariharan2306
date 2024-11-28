package stocks;

import java.util.HashMap;

public class StocksDetails {
    public String stockName;
    public int stockQty;
    public HashMap<String,Integer> areaStock=new HashMap<>();
    public double stockRate;

    public StocksDetails(String stockName, int stockQty, HashMap<String,Integer>areaStock, double stockRate) {
        this.stockName = stockName;
        this.stockQty = stockQty;
        this.areaStock=areaStock;
        this.stockRate = stockRate;
    }

    public String toString() {
        return (stockName+"#"+stockQty+"#"+areaStock+"#"+stockRate);
    }
}
