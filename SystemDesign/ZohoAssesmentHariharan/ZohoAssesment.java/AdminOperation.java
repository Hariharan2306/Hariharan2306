import java.util.Scanner;

public class AdminOperation {
    Scanner sc = new Scanner(System.in);

    public void adminMenu() {
        int step1;

        do {
            System.out.println("\nEnter 1 to display all items in stock ");
            System.out.println("Enter 2 to display products with stock lesser than or equals 10 ");
            System.out.println("Enter 3 to ReOrder stock ");
            System.out.println("Enter 4 to update discount ");
            System.out.println("Enter -1 to go back ");
            step1 = sc.nextInt();

            switch (step1) {
                case 1:
                    displayAllItems(true);
                    break;
                case 2:
                    displayAllItems(false);
                    break;
                case 3:
                    reOrderStock();
                    break;
                case 4:
                    updateDiscount();
                    break;
                case -1:
                    System.out.println("Going Backk...");
                    Storage.loggedinUser = "";
                    break;
                default:
                    System.out.println("Enter valid input ");
                    break;
            }
        } while (step1 != -1);
    }

    private void displayAllItems(boolean isDisplayAll) {
        int i;
        InventoryInfo inv = null;
        boolean anyHasDiscount = true;
        for (i = 0; i < Storage.inventoryList.size(); i++) {
            inv = Storage.inventoryList.get(i);
            if (isDisplayAll || inv.getStock() <= 10) {
                if (anyHasDiscount) {
                    System.out.println("\nProduct-ID  Category  Brand  Model  Price  Stock  Discount \n");
                    anyHasDiscount = false;
                }
                System.out.println((i + 1) + "  " + inv.getCategory()
                        + "  " + inv.getBrand() + "  " + inv.getModel() + "  " +
                        inv.getPrice() + "  " + inv.getStock() + "  " + inv.getDiscount());
            }
        }
    }

    private void reOrderStock() {
        System.out.println("\nKindly Enter product ID of product you wish to reorder ");
        int product_ID = sc.nextInt();
        System.out.println("Enter number of items to purchase ");
        int purchaseCount = sc.nextInt();

        if (product_ID <= 0) {
            System.out.println("Enter valid product ID ");
            return;
        }
        if (purchaseCount <= 0) {
            System.out.println("Enter valid count to make a purchase ");
            return;
        }
        InventoryInfo inv = Storage.inventoryList.get(product_ID - 1);
        inv.setStock(purchaseCount + inv.getStock());
        System.out.println("Stock updated succesfully ");
    }

    private void updateDiscount() {
        System.out.println("\nKindly Enter product ID of product you wish to update discount ");
        int product_ID = sc.nextInt();
        System.out.println("Enter discount percentage, kindly make sure discount is lesser than 100% ");
        float discount = sc.nextFloat();

        if (product_ID <= 0) {
            System.out.println("Enter valid product ID ");
            return;
        }
        if (discount >= 100) {
            System.out.println("Enter a valid discount percent ");
            return;
        }
        InventoryInfo inv = Storage.inventoryList.get(product_ID - 1);
        inv.setDiscount(discount);
    }
}
