import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    public void initializer(String filePath, boolean isCustomer) throws IOException {
        File file = new File(filePath);
        BufferedReader bfr = null;

        bfr = new BufferedReader(new FileReader(file));
        String lineData = bfr.readLine();
        do {
            if (isCustomer) {
                CustomersInfo customer = splitCustomerString(lineData);
                Storage.customersList.add(customer);
            } else {
                InventoryInfo inventory = splitInventoryString(lineData);
                Storage.inventoryList.add(inventory);
            }
            // System.out.println(lineData);
            lineData = bfr.readLine();
        } while (lineData != null);
        bfr.close();
    }

    private CustomersInfo splitCustomerString(String lineData) {
        String[] data = lineData.split(" ");
        CustomersInfo customerObj = new CustomersInfo(data[0],
                data[1],
                data[2],
                data[3],
                Float.parseFloat(data[4]));
        return customerObj;
    }

    private InventoryInfo splitInventoryString(String lineData) {
        String[] data = lineData.split(" ");
        InventoryInfo inventoryObj = new InventoryInfo(data[0], data[1], data[2], Long.parseLong(data[3]),
                Integer.parseInt(data[4]), Float.parseFloat(data[5]));
        return inventoryObj;
    }
}
