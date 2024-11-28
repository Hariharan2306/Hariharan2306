package customer;

import main.Ecommerce;
import stocks.StocksDetails;
import java.util.Scanner;

public class CustomerAction {
    Scanner sc=new Scanner(System.in);
    public void Buy(){
        System.out.println("the name of the product you like to buy ");
        String pName=sc.next();
        System.out.println("enter location of delivery to the product ");
        String pDelivery=sc.next();
        System.out.println("enter quantity of the product you'd like to buy ");
        int qty= sc.nextInt();

        if(Ecommerce.stockMap.get(pName)!=null){
            StocksDetails stock=Ecommerce.stockMap.get(pName);
//            System.out.println(stock.areaStock);
            if(stock.areaStock.get(pDelivery)>=qty){//prblm the map containing branch is not properly initialized but is properly finalized
                stock.stockQty-=qty;//updating in main qty
                System.out.println("product purchase success ");
                int newBranchQty=stock.areaStock.get(pDelivery)-qty;//gets new qty as per the branch
                stock.areaStock.put(pDelivery,newBranchQty);//updates the map of branch
            }
            else
                System.out.println("Stock not available in your area ");
        }
        else
            System.out.println("no such product exists ");
    }
}