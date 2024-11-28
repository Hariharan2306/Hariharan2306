import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class MainFile {
    static int option;
    static int againOption;                             //do u want to give another entry
    static int c=0;
    static int sk=0;
    static int p=0;
    static int id =200;
    static String[] shopKeeperNamesArr =null;
    static String[] shopKeeperIDArr =null;
    static String[] shopKeeperPasswordArr =null;
    static String[] customerNamesArr =null;
    static String[] customerPasswordArr =null;
    static String[] productNameArr =null;
    static String[] productRateArr =null;
    static String[] productCountArr =null;
    static String[] WalletsArr =null;
    static int[] productRateINTArr =new int[100];
    static int[] productCountINTArr =new int[100];
    static int[] WalletsINTArr =new int[100];
    static Scanner sc=new Scanner(System.in);
    static File customerNameFile =new File("Customer names File.txt");          //creating files for each arrays
    static File customerPasswordFile =new File("Customer Passwords file.txt");
    static File shopKeeperNameFile =new File("Names of shopKeeper file.txt");
    static File shopKeeperPasswordFile =new File("shopKeeper Passwords file.txt");
    static File skIDsFile =new File("ShopKeeper ID file.txt");
    static File productNameFile =new File("product Name File.txt");
    static File productCountsFile =new File("product Counts File.txt");
    static File productRatesFile =new File("product Rates File.txt");
    static File WalletsFile =new File("wallet File.txt");
    static File shopKeeperCountFile =new File("shopKeeper Count File.txt");
    static File customerCountFile =new File("Customer count file.txt");
    static File productPresentFile=new File("Any product present or not.txt");
    static BufferedWriter bfw=null;
    static BufferedReader bfr=null;

    public static void main(String[] args) throws Exception{

        if(shopKeeperNameFile.isFile() && shopKeeperPasswordFile.isFile() && skIDsFile.isFile()){//copying all  the val from file to arrays
            //copying all the values from file to normal array
            bfr=new BufferedReader(new FileReader(shopKeeperNameFile));
            shopKeeperNamesArr=bfr.readLine().split("#");//all sk names
            bfr.close();
            bfr=new BufferedReader(new FileReader(skIDsFile));
            shopKeeperIDArr=bfr.readLine().split("#");//all sk IDs separated from #
            bfr.close();
            bfr=new BufferedReader(new FileReader(shopKeeperPasswordFile));
            shopKeeperPasswordArr=bfr.readLine().split("#");//all sk passwords
            bfr.close();
        }

        if(shopKeeperCountFile.isFile()){
            bfr =new BufferedReader(new FileReader(shopKeeperCountFile));//copying val back from file to c
            sk= bfr.read();
            bfr.close();
        }
        if(customerCountFile.isFile()){
            bfr=new BufferedReader(new FileReader(customerCountFile));//copying val back from file to c
            c=bfr.read();
            bfr.close();
        }
        if(productPresentFile.isFile()){
            bfr=new BufferedReader(new FileReader(productPresentFile));
            p=bfr.read();
            bfr.close();
        }
        if(customerNameFile.isFile() && customerPasswordFile.isFile()){
            bfr=new BufferedReader(new FileReader(customerNameFile));//copying file to array containing customer names alone
            customerNamesArr=bfr.readLine().split("#");
            bfr.close();

            bfr=new BufferedReader(new FileReader(customerPasswordFile));
            customerPasswordArr=bfr.readLine().split("#");
            bfr.close();
        }

        if(productNameFile.isFile() && productRatesFile.isFile() && productCountsFile.isFile()) {
            bfr = new BufferedReader(new FileReader(productNameFile));
            productNameArr = bfr.readLine().split("#");
            bfr.close();
            bfr = new BufferedReader(new FileReader((productRatesFile)));
            productRateArr = bfr.readLine().split("#");
            bfr.close();
            bfr = new BufferedReader(new FileReader(productCountsFile));
            productCountArr = bfr.readLine().split("#");
            bfr.close();//copying all the data from file to array
            for (int j = 0; j < productRateArr.length; j++) {
                productRateINTArr[j] = (Integer.parseInt(productRateArr[j]));
                productCountINTArr[j] = (Integer.parseInt(productCountArr[j]));
            }
        }

        if(WalletsFile.isFile()){
            bfr =new BufferedReader(new FileReader(WalletsFile));
            WalletsArr = bfr.readLine().split("#");
            bfr.close();
            for(int j=0;j<WalletsArr.length;j++)//copying all the elements in String WalltetsArr to integer
                WalletsINTArr[j]= Integer.parseInt(WalletsArr[j]);
        }
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
                    System.out.println("\n no of customers "+c);
                    System.out.println("\n no of shopkeepers "+sk);
                    break;
                case 4:
                    if(p==0)
                        System.out.println("\n no products added yet ");
                    else{
                        System.out.println("\n available products ");
                        for(int i=0;i<p;i++)
                            System.out.println(productNameArr[i] + " (rate)-"+productRateINTArr[i] +" (Qty)-"+ productCountINTArr[i]);
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
            bfw=new BufferedWriter(new FileWriter(shopKeeperCountFile));//uploading count of shopkeeper present as a file as well
            bfw.write(sk);
            bfw.close();//shopKeeper counts file
            //if(bfw.isFile())
            bfr=new BufferedReader(new FileReader(shopKeeperCountFile));
            sk=bfr.read();
            bfr.close();

            int tID=200;
            id=tID+sk;
            //if(skIDsFile.)
            System.out.println("\n your shopkeeper id is "+id);
            bfw=new BufferedWriter(new FileWriter(skIDsFile,true));
            bfw.write(id+"#");
            bfw.close();//shopKeeper ID file

            System.out.println("\n enter a username you wish for name ");
            String name=sc.next();
            bfw=new BufferedWriter(new FileWriter(shopKeeperNameFile,true));//new sknames file
            bfw.write(name+"#");;
            bfw.close();

            System.out.println("\n enter new password ");
            String password=sc.next();
            bfw =new BufferedWriter(new FileWriter(shopKeeperPasswordFile,true));//new skPasswords file
            bfw.write(password+"#");
            bfw.close();

            //copying all the values from file to normal array
            bfr=new BufferedReader(new FileReader(shopKeeperNameFile));
            shopKeeperNamesArr=bfr.readLine().split("#");//all sk names
            bfr.close();
            bfr=new BufferedReader(new FileReader(skIDsFile));
            shopKeeperIDArr=bfr.readLine().split("#");//all sk IDs separated from #
            bfr.close();
            bfr=new BufferedReader(new FileReader(shopKeeperPasswordFile));
            shopKeeperPasswordArr=bfr.readLine().split("#");//all sk passwords
            bfr.close();

        }
        else{                                 //is a customer
            c++;
            bfw =new BufferedWriter(new FileWriter(customerCountFile));//uploading count of customer to a file
            bfw.write(c);
            bfw.close();

            bfr=new BufferedReader(new FileReader(customerCountFile));//uploading  count of customers from file to int variable
            c=bfr.read();
            bfr.close();

            System.out.println("\n enter a username you wish for name ");
            String name=sc.next();
            bfw =new BufferedWriter(new FileWriter(customerNameFile,true));//new names customer file
            bfw.write(name+"#");
            bfw.close();

            System.out.println("\n enter a password ");
            String password=sc.next();
            bfw =new BufferedWriter(new FileWriter(customerPasswordFile,true));
            bfw.write(password+"#");
            bfw.close();

            bfr=new BufferedReader(new FileReader(customerNameFile));//copying file to array containing customer names alone
            customerNamesArr=bfr.readLine().split("#");
            bfr.close();

            bfr=new BufferedReader(new FileReader(customerPasswordFile));
            customerPasswordArr=bfr.readLine().split("#");
            bfr.close();

        }
    }
    public static void logIn(boolean isShopkeeper)throws Exception{
        int tId=0;

        if(isShopkeeper){
            System.out.println("\n enter shopkeeper ID ");
            tId=sc.nextInt();
        }

        System.out.println("\n enter your existing userName ");
        String tname=sc.next();

        System.out.println("\n enter your password ");
        String tpassword=sc.next();

        if(isShopkeeper)                    //checks in array assigned for shopkeeper
            shopKeeperLogIn(tId,tname,tpassword);
        else                                //checks in array assigned for customer
            customerLogIn(tname,tpassword);
    }
    public static void shopKeeperLogIn (int tId,String tname,String tpassword)throws Exception{
        int i;
        String tIdStr= String.valueOf(tId);

        if(sk==0)
            System.out.println("\n sorry no shopKeeper id created yet ");
        else{
            //now all the data from file is uploaded and now checks
            for(i=0;i<sk;i++)
                if(tname.equals(shopKeeperNamesArr[i]) && tIdStr.equals(shopKeeperIDArr[i]) && tpassword.equals(shopKeeperPasswordArr[i])){
                    System.out.println("welcome "+tname);

                    System.out.println("\n what product are you willing to add ");
                    String product=sc.next();
                    p++;                        //solely present to show that product has been added or not
                    bfw=new BufferedWriter(new FileWriter(productPresentFile));
                    bfw.write(p);
                    bfw.close();

                    bfw =new BufferedWriter(new FileWriter(productNameFile,true));  //copying products name to a file named productNameFile
                    bfw.write(product+"#");
                    bfw.close();

                    System.out.println("\n what is the rate of the product you've added ");
                    int pRate= sc.nextInt();
                    bfw =new BufferedWriter(new FileWriter(productRatesFile,true));
                    bfw.write(pRate+"#");                         //copying product rates to file
                    bfw.close();

                    System.out.println("\n how much qty of product are you willing to add ");
                    int pQty= sc.nextInt();
                    bfw =new BufferedWriter(new FileWriter(productCountsFile,true));
                    bfw.write(pQty+"#");
                    bfw.close();

                    bfr=new BufferedReader(new FileReader(productNameFile));
                    productNameArr=bfr.readLine().split("#");
                    bfr.close();
                    bfr=new BufferedReader(new FileReader((productRatesFile)));
                    productRateArr=bfr.readLine().split("#");
                    bfr.close();
                    bfr=new BufferedReader(new FileReader(productCountsFile));
                    productCountArr=bfr.readLine().split("#");
                    bfr.close();//copying all the data from file to array
                    for(int j=0;j<productRateArr.length;j++){
                        productRateINTArr[j]=(Integer.parseInt(productRateArr[j]));
                        productCountINTArr[j]=(Integer.parseInt(productCountArr[j]));
                    }
                }
                else if(i==shopKeeperNamesArr.length-1)
                    System.out.println("\n incorrect password ,name or id ,pls try again ");
        }
    }
    public static void customerLogIn(String tname,String tpassword)throws Exception{
        int i;

        if(c==0)//if there are no customers registered or no of customers are 0
            System.out.println("\n there are no registered customers ");
        else{

            //here inserting all the data from file to array obj
            for(i=0;i<c;i++)
                if(tname.equals(customerNamesArr[i]) && tpassword.equals(customerPasswordArr[i])){//checks customer exists or not
                    System.out.println("welcome "+tname);
                    System.out.println("enter 1 to add money in wallet ");
                    System.out.println("enter 2 for proceeding to purchase ");
                    System.out.println("enter 3 to view available balance ");
                    int o=sc.nextInt();
                    switch (o){
                        case 1:
                            System.out.println("enter amount to be added ");
                            int tAmnt=sc.nextInt();
                            bfw =new BufferedWriter(new FileWriter(WalletsFile,true));
                            bfw.write(tAmnt+"#");
                            bfw.close();//also uploading wallet details in existing file
                            bfr=new BufferedReader(new FileReader(WalletsFile));
                            WalletsArr=bfr.readLine().split("#");
                            bfr.close();
                            for(int k=0;k<WalletsArr.length;k++)
                                WalletsINTArr[k]= Integer.parseInt(WalletsArr[k]);
                            break;
                        case 2:
                            customerPurchase();
                            break;
                        case 3:
                            System.out.println("the available balance is-");
                            System.out.println(WalletsINTArr[i]);
                            break;
                        default:
                            System.out.println("enter a valid input ");
                    }
                }
                else if(i==customerNamesArr.length-1)
                    System.out.println("incorrect name or password ,pls try again ");
        }
    }
    public static void customerPurchase()throws Exception{
        int i;
        boolean notPresent =true;
        System.out.println("\n what product are you willing to buy ");
        String tPName=sc.next();
        for(i=0;i<p;i++) {                       //check whether the product is present or not
            if (productNameArr[i].equalsIgnoreCase(tPName)) {
                System.out.println("\n the rate of that product is " + productRateArr[i]);//shows how much per count
                System.out.println("\n pls enter the qty of product you are willing to buy ");
                int tCount = sc.nextInt();//gets how much you're willing to buy
                if ((tCount <= productCountINTArr[i])){//checks whether the qty is in stock or not
                    System.out.println("\n the total amount you should pay is " + productRateINTArr[i] * tCount);//multiplying and calculating the rate
                    if((productRateINTArr[i] * tCount) <= WalletsINTArr[i]){
                        System.out.println("\n are you willing to buy? If yes type 'Y' ");
                        char buyOrNot = sc.next().charAt(0);
                        if (buyOrNot == 'Y' || buyOrNot == 'y') {
                            System.out.println("Thank you for the purchase ");                  //now after buying assigning new qty
                            productCountINTArr[i]=productCountINTArr[i]-tCount;
                            String tempTotProdCount="";
                            for(int j=0;j<productCountArr.length;j++) {
                                productCountArr[j] = (productCountINTArr[j]) + "#";//here updating new values on file existing count must be removed
                                tempTotProdCount+=productCountArr[j];
                            }
                            bfw =new BufferedWriter(new FileWriter(productCountsFile));
                            bfw.flush();
                            bfw.write(tempTotProdCount);
                            bfw.close();

                            //here after purchase updating value in file

                            WalletsINTArr[i]=WalletsINTArr[i] - (productRateINTArr[i] * tCount);//now after purchase altering cash in wallet
                            String tempWallet="";
                            for(int j=0;j<WalletsArr.length;j++){
                                WalletsArr[j]=WalletsINTArr[j]+"#";
                                tempWallet+=WalletsArr[j];
                            }
                            bfw =new BufferedWriter(new FileWriter(WalletsFile));
                            bfw.flush();
                            bfw.write(tempWallet);
                            bfw.close();                                                        //also uploading wallet details in existing file
                        }
                        else
                            System.out.println("purchase canceled ");
                    }
                    else
                        System.out.println("sorry insufficient cash in your balance ");
                    //System.out.println("thank you come again ");
                } else if(i==productNameArr.length-1)
                    System.out.println("\n sorry out of stock, reduce the qty you want to buy and try again ");
                notPresent =false;
            } if (notPresent)
                System.out.println("\n sorry the product you're looking for is not  available,try again later ");
        }
    }
}