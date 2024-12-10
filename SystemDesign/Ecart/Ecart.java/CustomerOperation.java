import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerOperation {
    Scanner sc = new Scanner(System.in);

    ArrayList invoiceList = new ArrayList<>();

    public boolean login() {
        System.out.println("\nEnter username/Email ");
        String userName = sc.nextLine();
        System.out.println("Enter password ");
        String password = sc.nextLine();
        String encryptedPassword = encPass(password);

        Storage s = new Storage();
        if (userName.equals(s.adminUserName) && password.equals(s.adminPassword)) {
            System.out.println("\nWelcome to Admin mode ");
            AdminOperation adminOp = new AdminOperation();
            adminOp.adminMenu();
            return false;
        }

        String dbUserName, dbPassword;
        int i;

        for (i = 0; i < Storage.customersList.size(); i++) {
            dbUserName = Storage.customersList.get(i).getEmail();
            dbPassword = Storage.customersList.get(i).getEncryptedPassword();
            if (dbUserName.equals(userName) && dbPassword.equals(encryptedPassword)) {
                System.out.println("\nlog in success ");
                Storage.loggedinUser = userName;
                return true;
            }
        }
        System.out.println("\nlog in failed ");
        return false;
    }

    public void signUp() {
        System.out.println("Enter new username/email - kindly Enter with no space");
        String newUser = sc.next();
        System.out.println("Enter new password - kindly enter with no space ");
        String newPass = sc.next();
        System.out.println("Enter confirm password - kindly enter with no space ");
        String confirmpass = sc.next();

        if (!newPass.equals(confirmpass)) {
            System.out.println("confirm pass and password doesnt match try again ");
            return;
        }
        String encryptedPass = encPass(confirmpass);
        System.out.println("Enter your name ");
        String name = sc.next();
        System.out.println("Enter mobile Number ");
        String mobileNum = sc.next();

        if (mobileNum.length() != 10) {
            System.out.println("Mobile number must have length of 10 ");
            return;
        }
        CustomersInfo customer = new CustomersInfo(newUser, encryptedPass, name, mobileNum, 0);
        Storage.customersList.add(customer);
        System.out.println("Customer created successfully ");
    }

    public void customerModule() {
        int step1Ip;
        do {
            System.out.println("\nTop products");
            getDiscount();
            System.out.println("\nEnter product_ID to add to cart ");
            System.out.println("Enter 0 to purchase above products ");
            System.out.println("Enter 1 to Continue Shopping ");
            System.out.println("Enter 2 to remove from cart ");
            System.out.println("Enter 3 to checkout cart ");
            System.out.println("Enter 4 to view your order history ");
            System.out.println("Enter -1 to goBack ");
            step1Ip = sc.nextInt();
            switch (step1Ip) {
                case 0:
                    System.out.println("Enter product ID : ");
                    int prod = sc.nextInt();
                    addToCart(prod);
                    break;
                case 1:
                    getCategories();
                    break;
                case 2:
                    removeFromCart();
                    break;
                case 3:
                    checkoutcart();
                    break;
                case 4:
                    showOrderHistory();
                    break;
                case -1:
                    System.out.println("Going back..");
                    Storage.loggedinUser = "";
                    break;
                default:
                    System.out.println("Enter valid option");
                    break;
            }
        } while (step1Ip != -1);
    }

    private void showOrderHistory() {
        String user = Storage.loggedinUser;
        CustomersInfo customerObj = null;
        InvoiceDetails invoiceObj = null;

        for (int i = 0; i < Storage.customersList.size(); i++) {
            if (user.equals(Storage.customersList.get(i).getEmail()))
                customerObj = Storage.customersList.get(i);
        }

        ArrayList<InvoiceDetails> invoiceList = customerObj.getInvoiceList();
        for (int i = 0; i < invoiceList.size(); i++) {
            invoiceObj = invoiceList.get(i);
            System.out.println("Invoice Number -- " + invoiceObj.getInvoiceNumber() + "\nDate " +
                    invoiceObj.getDate());
            System.out.println("\nCategory  Brand  Model  Price count in Cart \n");
            HashMap<Integer, Integer> orderDetails = invoiceObj.getCart();

            int key;
            Iterator<Integer> it = orderDetails.keySet().iterator();
            InventoryInfo inv = null;

            while (it.hasNext()) {
                key = (int) it.next();
                int countInCart = orderDetails.get(key);
                inv = Storage.inventoryList.get(key);
                System.out.println(
                        inv.getCategory() + "  " + inv.getBrand() + "  " + inv.getModel() + "  " + inv.getPrice() + "  "
                                + countInCart);
            }
            System.out.println("Credits used -- " + invoiceObj.getCreditUsed() + "\ntotal -- "
                    + invoiceObj.getTotalCost() + "\ncreditsgained -- " + invoiceObj.getCreditsGained());
        }
    }

    private void removeFromCart() {
        String user = Storage.loggedinUser;
        Cart cartObj = Cart.cartmap.get(user);
        boolean isCartEmpty = !printCartItems(cartObj);

        if (isCartEmpty) {
            System.out.println("Cart is empty");
            System.out.println("Going back to previous page");
        } else {
            System.out.println("Enter product ID to remove from cart ");
            int userProductId = sc.nextInt();
            System.out.println("Enter product count to remove from cart ");
            int userRemoveCount = sc.nextInt();
            HashMap<Integer, Integer> productIncart = cartObj.getProductDetails();
            if (productIncart.get(userProductId - 1) == null) {
                System.out.println("No such product exists in your cart, kindly check product id");
                return;
            }
            int oldCount = productIncart.get(userProductId - 1);
            if (userRemoveCount > oldCount) {
                System.out
                        .println("The cart doesnt have that musch products,, current count in product -- " + oldCount);
                return;
            }
            int newCount = oldCount - userRemoveCount;
            InventoryInfo inv = Storage.inventoryList.get(userProductId - 1);
            float newTotalCost = cartObj.getTotalCost() - inv.getPrice() * userRemoveCount;
            if (newCount == 0) {
                productIncart.remove(userProductId - 1);
                if (productIncart.isEmpty())
                    Cart.cartmap.remove(user);
                else
                    cartObj.setProductDetails(productIncart);
            } else {
                productIncart.put(userProductId - 1, newCount);
            }
            System.out.println(cartObj.getProductDetails());
            cartObj.setTotalCost(newTotalCost);
            System.out.println("Product removed succesfuly ");
        }
    }

    private boolean printCartItems(Cart cartObj) {
        if (cartObj == null) {
            return false;
        }
        HashMap<Integer, Integer> productsInCart = cartObj.getProductDetails();
        for (Integer prod : productsInCart.keySet()) {
            System.out.println(prod + "    " + productsInCart.get(prod));
        }
        return true;
    }

    private void checkoutcart() {
        String email = Storage.loggedinUser;
        int key;
        Cart cartObj = Cart.cartmap.get(email);

        if (cartObj == null) {
            System.out.println("Cart is Empty ");
            return;
        }
        HashMap<Integer, Integer> allProductsinCart = cartObj.getProductDetails();
        Iterator<Integer> it = allProductsinCart.keySet().iterator();
        CustomersInfo customerObj = null;
        InventoryInfo inv = null;
        float totalDiscount = 0;

        while (it.hasNext()) {
            key = (int) it.next();
            int countInCart = allProductsinCart.get(key);
            inv = Storage.inventoryList.get(key);
            int countInStock = inv.getStock();
            if (countInCart > countInStock) {
                System.out.println("Product ID -- " + key + 1 + " has only " + countInStock
                        + "In Stock, your cart has " + countInCart + " items, Kindly wait till Admin restock");
                return;
            }
            totalDiscount += inv.getDiscount();
            // System.out.println(key);
        }
        for (int i = 0; i < Storage.customersList.size(); i++) {
            if (email.equals(Storage.customersList.get(i).getEmail()))
                customerObj = Storage.customersList.get(i);

        }

        float creditAvailable = customerObj.getCredit();
        System.out.println("You Have " + creditAvailable + " credits, Do you wish to use them ");
        String option = sc.next();
        float creditRedeem;
        do {
            System.out.println("How much credit do you wish to use : ");
            creditRedeem = sc.nextFloat();
            if (creditRedeem > creditAvailable) {
                System.out.println("you have only " + creditAvailable + " credit availavle ");
            }
        } while (creditRedeem > creditAvailable);
        float costToPay = cartObj.getTotalCost();
        float creditUsed;
        if (option.equalsIgnoreCase("y")) {
            costToPay = Math.abs(creditRedeem - costToPay);
            creditUsed = creditRedeem;
        } else {
            creditUsed = 0;
        }

        costToPay = costToPay * (totalDiscount / 100);
        System.out.println("Enter y to confirm purchase ");
        String confirmation = sc.next();

        if (!confirmation.equalsIgnoreCase("y")) {
            System.out.println("Thank you ");
            return;
        }
        float creditsGained = (costToPay / 1000) * 20;
        customerObj.setCredit(creditAvailable + creditsGained);
        System.out.println("Purchase success ");
        Cart.cartmap.remove(email);
        ArrayList<InvoiceDetails> currInvoiceList = customerObj.getInvoiceList();

        // create Invoice
        int invoiceNumber = (int) Math.ceil(Math.random() * 90000);

        InvoiceDetails invoice = new InvoiceDetails(String.valueOf(invoiceNumber), "09-sep-2023", allProductsinCart,
                creditUsed, creditsGained, costToPay);
        currInvoiceList.add(invoice);
        customerObj.setInvoiceList(currInvoiceList); // setNewInvoice List

        // InvoiceDetails.invoiceMap.put(email, invoice); // add invoice obj
        // System.out.println(InvoiceDetails.invoiceMap);

        System.out.println("\n-----------Invoice Generated-------------");
        System.out.println("\n\nInvoice Number -- " + invoiceNumber + "\ndate -- 09-sep-2023\n ");
        System.out.println("Category  Brand  Model  Price");

        Iterator<Integer> it2 = allProductsinCart.keySet().iterator();
        while (it2.hasNext()) {
            key = it2.next();
            InventoryInfo product = Storage.inventoryList.get(key);
            System.out.println(product.getCategory() + "  " + product.getBrand() + "  " + product.getModel() + "  "
                    + product.getPrice());
        }
        System.out.println("\nCredits Used -- " + creditUsed + "\n Total -- " + costToPay + "\n Credits Added -- "
                + creditsGained);
    }

    private void getCategories() {
        int i, j, step2Ip;
        InventoryInfo inv = null;
        String category = "";
        do {
            j = 0;
            System.out.println("\nProduct Categories\n");
            for (i = 0; i < Storage.inventoryList.size(); i++) {
                inv = Storage.inventoryList.get(i);
                if (category.equals(inv.getCategory()))
                    continue;
                j++;
                category = inv.getCategory();
                System.out.println("Enter " + j + " to view" + category + " products");
            }
            System.out.println("Enter -1 to go back ");
            System.out.println("Enter 9 to checkout cart ");
            System.out.println("Enter 6 to remove few items from count ");
            System.out.println("Enter -7 to show order history ");

            step2Ip = sc.nextInt();
            switch (step2Ip) {
                case 1: // mobile
                    showCategory("Mobile");
                    break;
                case 2: // laptop
                    showCategory("Laptop");
                    break;
                case 3: // tablet
                    showCategory("Tablet");
                    break;
                case 6:
                    removeFromCart();
                    break;
                case -1:
                    System.out.println("Going back... ");
                    break;
                case -7:
                    showOrderHistory();
                    break;
                case 9:
                    checkoutcart();
                    break;
                default:
                    System.out.println("Enter valid Input ");
                    break;
            }
        } while (step2Ip != -1);
    }

    private void showCategory(String category) {
        int i, step3Ip;
        InventoryInfo inv;
        do {
            System.out.println("\nProduct_ID  Models  Brands  price\n");
            for (i = 0; i < Storage.inventoryList.size(); i++) {
                inv = Storage.inventoryList.get(i);
                if (inv.getCategory().equals(category))
                    System.out.println(i + 1 + "  " + inv.getModel() + "  " + inv.getBrand() + "  " + inv.getPrice());
            }
            System.out.println("\nEnter product_ID to add to cart ");
            System.out.println("Enter -1 to goBack ");
            System.out.println("Enter 9 to checkout cart ");
            System.out.println("Enter -7 to showOrderHistory");
            step3Ip = sc.nextInt();
            switch (step3Ip) {
                case -1:
                    System.out.println("Going back..");
                    break;
                case -7:
                    showOrderHistory();
                    break;
                case 9:
                    checkoutcart();
                    break;
                default:
                    addToCart(step3Ip);
                    break;
            }
        } while (step3Ip != -1);
    }

    private void addToCart(int product_ID) {
        InventoryInfo inv = Storage.inventoryList.get(product_ID - 1);
        if (inv == null) {
            System.out.println("Enter valid product ID ");
            return;
        }
        System.out.println("Enter count of product you wish to add ");
        int productCount = sc.nextInt(); // get users wish
        // System.out.print("Enter username one more time..");
        String userName = Storage.loggedinUser;

        int i;
        CustomersInfo c = null;
        boolean userNameExists = false;
        for (i = 0; i < Storage.customersList.size(); i++) { // to check username exists
            c = Storage.customersList.get(i);
            if (userName.equals(c.getEmail())) {
                userNameExists = true;
                break;
            }
        }
        if (!userNameExists) {
            System.out.println("Kindly enter valid username ");
            return;
        }

        InventoryInfo iinv = Storage.inventoryList.get(product_ID - 1);
        if (productCount > iinv.getStock()) {
            System.out.println("Only " + iinv.getStock() + " num of items present in stock , kindly lessen the count ");
            return;
        }

        Cart cartObj = null;
        cartObj = Cart.cartmap.get(userName);
        HashMap<Integer, Integer> productDetailsRef = new HashMap<>();
        if (cartObj == null) {
            // to add new data in cart

            productDetailsRef.put(product_ID - 1, productCount);
            inv = Storage.inventoryList.get(product_ID - 1);
            float newTotalCost = inv.getPrice() * productCount;
            cartObj = new Cart(userName, newTotalCost, productDetailsRef);
            Cart.cartmap.put(userName, cartObj);
        } else if (cartObj.getProductDetails().get(product_ID - 1) == null) {
            // does have cart but not product

            productDetailsRef = cartObj.getProductDetails();
            productDetailsRef.put(product_ID - 1, productCount);
            float prevCost = cartObj.getTotalCost();
            inv = Storage.inventoryList.get(product_ID - 1);
            cartObj.setTotalCost(prevCost + inv.getPrice() * productCount);
        } else {
            // to add data in existsing cart

            productDetailsRef = cartObj.getProductDetails();
            int prevProdCount = productDetailsRef.get(product_ID - 1);
            productDetailsRef.put(product_ID - 1, productCount + prevProdCount);
            float prevCost = cartObj.getTotalCost();
            inv = Storage.inventoryList.get(product_ID - 1);
            cartObj.setTotalCost(prevCost + inv.getPrice() * productCount);
        }
        System.out.println("Added to cart successfully ");

        // debug
        Cart cdata = Cart.cartmap.get(userName);
        System.out.println(cdata.getEmail() + " " + cdata.getTotalCost() + " " +
                cdata.getProductDetails());
    }

    private void getDiscount() {
        int i;
        InventoryInfo inv = null;
        boolean anyHasDiscount = true;
        for (i = 0; i < Storage.inventoryList.size(); i++) {
            inv = Storage.inventoryList.get(i);
            if (inv.getDiscount() != 0) {
                if (anyHasDiscount) {
                    System.out.println("\nProduct-ID  Category  Brand  Model  Price  Discount \n");
                    anyHasDiscount = false;
                }
                System.out.println((i + 1) + "  " + inv.getCategory()
                        + "  " + inv.getBrand() + "  " + inv.getModel() + "  " +
                        inv.getPrice() + "  " + inv.getDiscount());
            }
        }
    }

    private String encPass(String password) {
        char[] passArr = password.toCharArray();
        int i;
        for (i = 0; i < passArr.length; i++) {
            switch (passArr[i]) {
                case '9':
                    passArr[i] = '0';
                    break;
                case 'z':
                    passArr[i] = 'a';
                    break;
                case 'Z':
                    passArr[i] = 'A';
                    break;
                default:
                    passArr[i] = (char) (passArr[i] + 1);
                    break;
            }
        }
        return String.valueOf(passArr);
    }
}
