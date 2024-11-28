import java.util.Scanner;
public class Main {
    static Stocking[] products;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number of products to be added ");
        int n = sc.nextInt();
        products = new Stocking[n];
        int choice;
        int index = 0;
        do {
            System.out.println("enter 1 to add products in store ");
            System.out.println("enter 2 to view list of products in store ");
            System.out.println("enter 3 to buy products ");
            System.out.println("press 4 for exit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addProduct(index);
                    index++;
                    break;
                case 2:
                    viewListOfProducts(n);
                    break;
                case 3:
                    buyProducts(n);
                    break;
                case 4:
                    System.out.println("thank you come again  ");
                    break;
                default:
                    System.out.println("invalid entry ");
            }
        } while (choice != 4);
    }

    public static void addProduct(int index) {
        System.out.println("enter product name to be added");
        String pName = sc.next();
        System.out.println("enter price of product to be added");
        int pPrice = sc.nextInt();
        System.out.println("enter quantity of the product to be added ");
        int pQuantity = sc.nextInt();
        products[index] = new Stocking(pName, pPrice, pQuantity);//products[index] is the object
        System.out.println("added succesfully ");
    }

    public static void viewListOfProducts(int n) {
        System.out.println("the list of products are ");
        for (int i = 0; i < n; i++) {
            System.out.println("product name " + products[i].getProductName());
            System.out.println("product quantity " + products[i].getProductQuantity());
            System.out.println("product price " + products[i].getPrice() + "\n\n");
        }
    }

    public static void buyProducts(int n) {
        System.out.println("enter product youre about to buy ");
        String buyProduct = sc.next();
        System.out.println("enter quantity of products youre about to buy ");
        int buyPQuantity = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int newProductQuantity = 0, reqPrice;
            String response;
            if (products[i].getProductName().equalsIgnoreCase(buyProduct)) {//name check
                newProductQuantity = products[i].getProductQuantity();
                if(products[i].getProductQuantity() < buyPQuantity){
                    System.out.println("sorry we dont have enough, buy " +newProductQuantity+ " instead, press yes to continue");
                    response=sc.next();
                    if(response.equalsIgnoreCase("yes"))
                        buyPQuantity=newProductQuantity;
                    else
                        System.out.println("thank you");
                }
                System.out.println("amount youve to pay " +buyPQuantity*products[i].getPrice()+ " press yes if ok ");
                response=sc.next();
                if(response.equalsIgnoreCase("yes")) {
                    newProductQuantity -= buyPQuantity;
                    products[i].setProductQuantity(newProductQuantity);
                    System.out.println("products bought successfully");
                }
                else
                    System.out.println("thank you");
            }
        }
    }
}
