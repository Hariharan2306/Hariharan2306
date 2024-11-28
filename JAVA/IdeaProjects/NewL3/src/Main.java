import java.io.*;
import java.util.Scanner;
public class Main {
    static Details cNames[]=new Details[100];             //customer names
    static Details cPasswords[]=new Details[100];         //customer passwords
    static Details skNames[]=new Details[100];            //shopkeeper names
    static Details skPasswords[]=new Details[100];        //shopkeeper passwords
    static Details IDs[]=new Details[100];               //shopkeeper ids
    static ProductDetails productNames[]=new ProductDetails[100];       //names of the product present
    static ProductDetails productRate[]=new ProductDetails[100];        //rates if the products
    static ProductDetails productCount[]=new ProductDetails[100];       //counts of the product that is present
    static Details wallet[]=new Details[100];          //to make a wallet for customer
    static int sk=0;                                    //no of shopkeepers in total
    static int c=0;                                     //no of customers in total
    static int p=0;                                     //no of products in total
    static int ID=200;                                  //shopkeeper id begins here
    static int option;
    static int againOption;                             //do u want to give another entry
    static Scanner sc=new Scanner(System.in);

//    static File cNameFile =new File("Customer Names.txt");          //creating files for each arrays
//    static File cPasswordFile =new File("Customer Passwords.txt");
//    static File skNameFile =new File("ShopKeeper Names.txt");
//    static File skPasswordFile =new File("Shopkeeper Passwords.txt");
//    static File skIDsFile =new File("Shopkeeper ID numbers.txt");
//    static File productNameFile =new File("Products.txt");
//    static File productCountsFile =new File("Quantity of Products.txt");
//    static File productRatesFile =new File("Rate of Products.txt");
//    static File WalletsFile =new File("Wallet.txt");
//    static File shopKeeperCountFile =new File("Count of the ShopKeeper created.txt" );
//    static File customerCountFile =new File("Count of the Customer created.txt");
//
//    static ObjectOutputStream oos=null;
//    static ObjectInputStream ois=null;

    //Main obj=new Main();

    public static void main(String[] args) throws Exception{
        do{
            System.out.println("\n if you are a customer press 1 ");
            System.out.println("\n if you are a shopKeeper press 2 ");
            System.out.println("\n enter 3 to view no  of shopkeepers and customers present ");
            System.out.println("\n enter 4 to view lis of products available ");
            option=sc.nextInt();
            switch(option){
                case 1:
                    customer();
                    break;
                case 2:
                    shopKeeper();
                    break;
                case 3:
//                    if(shopKeeperCountFile.isFile()){
//                        ois=new ObjectInputStream(new FileInputStream(shopKeeperCountFile));//copying val back from file to sk
//                        sk= (int) ois.readObject();
//                        ois.close();
//                    }
//                    if(customerCountFile.isFile()){
//                        ois=new ObjectInputStream(new FileInputStream(customerCountFile));//copying val back from file to c
//                        c=(int)ois.readObject();
//                        ois.close();
//                    }
                    System.out.println("\n no of customers "+c);
                    System.out.println("\n no of shopkeepers "+sk);
                    break;
                case 4:
                    if(p==0)
                        System.out.println("\n no products available ");
                    else{
                        System.out.println("\n available products ");
                        for(int i=0;i<p;i++)
                            System.out.println(productNames[i].getProductNames() + " (rate)-"+productRate[i].getProductRate() +" (Qty)-"+ productCount[i].getProductCount());
                    }
                    break;
                default:
                    System.out.println("\n enter a valid input ");
            }
            System.out.println("\n do you want to check any others if yes type 1 ");
            System.out.println("\n type 0 again to exit ");
            againOption= sc.nextInt();
        }while(againOption==1);
    }
    public static void customer()throws Exception{
        do{
            System.out.println("\n press 1 to sign in ");
            System.out.println("\n press 2 to sign up ");
            option=sc.nextInt();
            switch(option){
                case 1:
                    logIn(false);
                    break;
                case 2:
                    signUp(false);
                    break;
                default:
                    System.out.println("\n enter a valid input ");
            }
            System.out.println("\n do you want to check any others as a customer, if yes type 1 ");
            System.out.println("\n if you want to change as a shopkeeper or exit press 2");
            againOption= sc.nextInt();
        }while(againOption==1);
    }
    public static void shopKeeper()throws Exception{
        do{
            System.out.println("\n press 1 for log in ");
            System.out.println("\n press 2 for sign up ");
            option=sc.nextInt();
            switch (option){
                case 1:
                    logIn(true);
                    break;
                case 2:
                    signUp(true);
                    break;
                default:
                    System.out.println("\n enter a valid input ");
            }
            System.out.println("\n do you want to check any others as a shopkeeper if yes type 1 ");
            System.out.println("\n if you want to check any other as a customer or do you want to exit type 0 ");
            againOption= sc.nextInt();
        }while(againOption==1);
    }
    public static void signUp(boolean isShopkeeper)throws Exception{
        if(isShopkeeper){                   //is a shop keeper
            sk++;
//            oos=new ObjectOutputStream(new FileOutputStream(shopKeeperCountFile));//uploading count of shopkeeper present as a file as well
//            oos.writeObject(sk);
//            oos.close();
            ID++;
            System.out.println("\n your shopkeeper id is "+ID);
            //IDs[sk-1]=ID;//entering id in array
            //for(i=0;i<sk;i++){
            IDs[sk-1]=new Details();
            IDs[sk-1].setIDs(ID);
//            oos=new ObjectOutputStream(new FileOutputStream(skIDsFile));
//            oos.writeObject(ID);
//            oos.close();
//            //}

            System.out.println("\n enter a username you wish for name ");
            String name=sc.next();
            //skNames[sk-1]=name;//entering name in  array names
            //for(i=0;i<sk;i++){
            skNames[sk-1]=new Details();
            skNames[sk-1].setShopkeeperNames(name);
//            oos=new ObjectOutputStream(new FileOutputStream(skNameFile));
//            oos.writeObject(name);
//            oos.close();
//            //}

            System.out.println("\n enter new password ");
            String password=sc.next();
            //skPasswords[sk-1]=password;//entering password in array passwords
            //for(i=0;i<sk;i++){
            skPasswords[sk-1]=new Details();
            skPasswords[sk-1].setShopkeepersPasswords(password);
//            oos=new ObjectOutputStream(new FileOutputStream(skPasswordFile));
//            oos.writeObject(password);
//            oos.close();
            //}

        }
        else{                                 //is a customer
            c++;
//            oos=new ObjectOutputStream(new FileOutputStream(customerCountFile));//uploading count of customer to a file
//            oos.writeObject(c);
//            oos.close();

            System.out.println("\n enter a username you wish for name ");
            String name=sc.next();
            //cNames[c-1]=name;//entering name in  array names
            //for(i=0;i<c;i++){
            cNames[c-1]=new Details();
            cNames[c-1].setCustomerNames(name);
//            oos=new ObjectOutputStream(new FileOutputStream(cNameFile));
//            oos.writeObject(name);
//            oos.close();
            //}

            System.out.println("\n enter a password ");
            String password=sc.next();
            //cPasswords[c-1]=password;//entering password in array passwords
            //for(i=0;i<c;i++){
            cPasswords[c-1]=new Details();
            cPasswords[c-1].setCustomerPasswords(password);
//            oos=new ObjectOutputStream(new FileOutputStream(cPasswordFile));
//            oos.writeObject(password);
//            oos.close();
            //}
        }
    }
    public static void logIn(boolean isShopkeeper)throws Exception{
        int tId=0;
        System.out.println("\n enter your existing userName ");
        String tname=sc.next();

        if(isShopkeeper){
            System.out.println("\n enter shopkeeper ID ");
            tId=sc.nextInt();
        }

        System.out.println("\n enter your password ");
        String tpassword=sc.next();

        if(isShopkeeper)                    //checks in array assigned for shopkeeper
            shopKeeperLogIn(tId,tname,tpassword);
        else                                //checks in array assigned for customer
            customerLogIn(tname,tpassword);
    }
    public static void shopKeeperLogIn (int tId,String tname,String tpassword)throws Exception{
        int i;

//        if(shopKeeperCountFile.isFile()){
//            ois=new ObjectInputStream(new FileInputStream(shopKeeperCountFile));//copying val back from file to sk
//            sk= (int) ois.readObject();
//            ois.close();
//        }

        if(sk==0)
            System.out.println("\n sorry no shopKeeper id created yet ");
        else{
//            if(skNameFile.isFile() && skPasswordFile.isFile() && skIDsFile.isFile()) {
//                ois = new ObjectInputStream(new FileInputStream(skNameFile));//uploading data from file to array obj skNames
//                skNames[sk-1] = (Details) ois.readObject();//typecasting obj to class type and again storing in skNames obj array
//                ois = new ObjectInputStream(new FileInputStream(skPasswordFile));
//                skPasswords[sk-1] = (Details) ois.readObject();
//                ois = new ObjectInputStream(new FileInputStream(skIDsFile));
//                IDs[sk-1] = (Details) ois.readObject();
//            }
            //now all the data from file is uploaded and now checks
            for(i=0;i<sk;i++)
                if(skNames[i].getShopkeeperNames().equals(tname) && skPasswords[i].getShopkeepersPasswords().equals(tpassword) && IDs[i].getIds()==tId){
                    System.out.println("welcome "+tname);

                    System.out.println("\n what product are you willing to add ");
                    String product=sc.next();
                    p++;
                    productNames[p-1]=new ProductDetails();
                    productNames[p-1].setProductNames(product);     //set product names
//                    oos=new ObjectOutputStream(new FileOutputStream(productNameFile));  //copying products name to a file obj named productNameFile
//                    oos.writeObject(product);
//                    oos.close();

                    System.out.println("\n what is the rate of the product you've added ");
                    int pRate= sc.nextInt();
                    productRate[p-1]=new ProductDetails();
                    productRate[p-1].setProductRate(pRate);         //set product rates
//                    oos=new ObjectOutputStream(new FileOutputStream(productRatesFile));
//                    oos.writeObject(pRate);                         //copying product rates to file
//                    oos.close();

                    System.out.println("\n how much qty of product are you willing to add ");
                    int pQty= sc.nextInt();
                    productCount[p-1]=new ProductDetails();
                    productCount[p-1].setProductCount(pQty);        //set product count
//                    oos=new ObjectOutputStream(new FileOutputStream(productCountsFile));
//                    oos.writeObject(pQty);
//                    oos.close();
                }
                else
                    System.out.println("\n incorrect password ,name or id ,pls try again ");
        }
    }
    public static void customerLogIn(String tname,String tpassword)throws Exception{
        int i;

//        if(customerCountFile.isFile()){
//            ois=new ObjectInputStream(new FileInputStream(customerCountFile));//copying val back from file to c
//            c=(int)ois.readObject();
//            ois.close();
//        }

        if(c==0)//if there are no customers registered or no of customers are 0
            System.out.println("\n there are no registered customers ");
        else{
//            if(cNameFile.isFile()){
//                ois=new ObjectInputStream(new FileInputStream(cNameFile));
//                cNames=(Details[]) ois.readObject();
//                ois.close();
//                ois=new ObjectInputStream(new FileInputStream(cPasswordFile));
//                cPasswords=(Details[])ois.readObject();
//                ois.close();
//            }
            //here inserting all the data from file to array obj
            for(i=0;i<c;i++)
                if(cNames[i].getCustomerNames().equals(tname) && cPasswords[i].getCustomerPasswords().equals(tpassword)){//checks customer exists or not
                    System.out.println("welcome "+tname);
                    System.out.println("enter 1 to add money in wallet ");
                    System.out.println("enter 2 for proceeding to purchase ");
                    System.out.println("enter 3 to view available balance ");
                    int o=sc.nextInt();
                    switch (o){
                        case 1:
                            System.out.println("enter amount to be added ");
                            int tAmnt=sc.nextInt();
                            wallet[i]=new Details();
                            wallet[i].setWallets(tAmnt);
//                            oos=new ObjectOutputStream(new FileOutputStream(WalletsFile));
//                            oos.writeObject(tAmnt);
//                            oos.close();//also uploading wallet details in existing file
                            break;
                        case 2:
                            customerPurchase();
                            break;
                        case 3:
                            System.out.println("the available balance is-");
//                            if(WalletsFile.isFile()){
//                                ois=new ObjectInputStream(new FileInputStream(WalletsFile));
//                                wallet=(Details[])ois.readObject();
//                                ois.close();
//                            }
                            System.out.println(wallet[i].getWallets());
                            break;
                        default:
                            System.out.println("enter a valid input ");
                    }
                }
                else
                    System.out.println("incorrect name or password ,pls try again ");
        }
    }
    public static void customerPurchase()throws Exception{
        int i;
        boolean notPresent =true;
        System.out.println("\n what product are you willing to buy ");
        String tPName=sc.next();
        for(i=0;i<p;i++) {                       //check whether the product is present or not
            if (productNames[i].getProductNames().equalsIgnoreCase(tPName)) {
                System.out.println("\n the rate of that product is " + productRate[i].getProductRate());//shows how much per count
                System.out.println("\n pls enter the qty of product you are willing to buy ");
                int tCount = sc.nextInt();//gets how much you're willing to buy
                if (tCount <= productCount[i].getProductCount()) {//checks whether the qty is in stock or not
                    System.out.println("\n the total amount you should pay is " + productRate[i].getProductRate() * tCount);//multiplying and calculating the rate
                    if((productRate[i].getProductRate() * tCount) <= wallet[i].getWallets()){
                        System.out.println("\n are you willing to buy? If yes type 'Y' ");
                        char buyOrNot = sc.next().charAt(0);
                        if (buyOrNot == 'Y' || buyOrNot == 'y') {
                            System.out.println("Thank you for the purchase ");
                            productCount[i].setProductCount(productCount[i].getProductCount() - tCount);//now after buying assigning new qty
//                            oos=new ObjectOutputStream(new FileOutputStream(productCountsFile));
//                            oos.writeObject(productCount[i].getProductCount() - tCount);
//                            oos.close();//here after purchase updating value in file

                            wallet[i].setWallets(wallet[i].getWallets() - (productRate[i].getProductRate() * tCount));//now after purchase altering cash in wallet
//                            oos=new ObjectOutputStream(new FileOutputStream(WalletsFile));
//                            oos.writeObject(wallet[i].getWallets() - (productRate[i].getProductRate() * tCount));
//                            oos.close();//also uploading wallet details in existing file
                        }
                        else
                            System.out.println("purchase canceled ");
                    }
                    else
                        System.out.println("sorry insufficient cash in your balance ");
                    //System.out.println("thank you come again ");
                } else
                    System.out.println("\n sorry out of stock, reduce the qty you want to buy and try again ");
                notPresent =false;
            } if (notPresent)
                System.out.println("\n sorry the product you're looking for is not  available,try again later ");
        }
    }
}