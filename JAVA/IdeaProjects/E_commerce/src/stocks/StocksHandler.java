package stocks;

import main.Ecommerce;
import java.util.HashMap;
import java.util.Scanner;
public class StocksHandler {
    static Scanner sc=new Scanner(System.in);
    public void addStocks(){//while adding new products if same already exists qty must be updated
        //here qty is updated but is appended to the file
        System.out.println("enter the name of the product you're willing to add ");
        String name=sc.next();
        HashMap<String,Integer> areas=new HashMap<>();
        int qty=0;
//        boolean productUpdateArea=false;
//        boolean productUpdate=false;

        while(true){
            System.out.println("enter area where you'd like to make the product available");
            String area1= sc.next();
            System.out.println("enter qty in that area");
            int qty1=sc.nextInt();
            if(areas.get(area1)!=null){//if gn with same branch name twice or more qty is added
                qty1+=areas.get(area1);
//                productUpdateArea=true;
            }
            areas.put(area1,qty1);
            qty+=qty1;//tot quantity of that product
            try{
            System.out.println("any other area? if yes press 'Y' \n any other key will assume done");
            String op=sc.next();
            if(!op.equalsIgnoreCase("y"))
                break;
            }catch(Exception e){
                break;
            }
        }

        System.out.println("enter rate of the product you've added ");
        double rate= sc.nextDouble();

        if(Ecommerce.stockMap.get(name)!=null){//if there already exist product in same name
            System.out.println("product of same name already exists, press 'Y' to update details ");
            String op=sc.next();//if yes update further details
            if(op.equalsIgnoreCase("y")){
//                productUpdate=true;
                qty+=Ecommerce.stockMap.get(name).stockQty;//adding qty to existing qty
                rate=Ecommerce.stockMap.get(name).stockRate;//over writing existing rate
            }
            else{
                System.out.println("please re log in");//else ask them to re login
                return;}
        }
        StocksDetails stocks=new StocksDetails(name,qty,areas,rate);
        Ecommerce.stockMap.put(name,stocks);

        StocksFileHandler handler=new StocksFileHandler();

//        if(productUpdate || productUpdateArea)
//            handler.finalization();
//        else
            handler.addStockToFile(stocks);

        System.out.println("stock added successfully ");
    }
}
