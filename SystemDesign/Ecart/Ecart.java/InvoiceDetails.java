import java.util.HashMap;

public class InvoiceDetails {
    private String invoiceNumber;
    private String date;
    private HashMap<Integer, Integer> cart = new HashMap<>();
    private float creditsUsed;
    private float creditsGained;
    private float totalCost;


    public InvoiceDetails(String invoiceNumber,
            String date,
            HashMap<Integer, Integer> cart,
            float creditsUsed,
            float creditsGained,
            float totalCost) {

        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.cart = cart;
        this.creditsUsed = creditsUsed;
        this.creditsGained = creditsGained;
        this.totalCost = totalCost;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDate() {
        return date;
    }

    public HashMap<Integer, Integer> getCart() {
        return cart;
    }

    public float getCreditUsed() {
        return creditsUsed;
    }

    public float getCreditsGained() {
        return creditsGained;
    }

    public float getTotalCost() {
        return totalCost;
    }
}
