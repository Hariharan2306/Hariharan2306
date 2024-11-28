import java.util.HashMap;

public class Cart {
    private String email;
    private float totalCost;
    private HashMap<Integer, Integer> productDetails = new HashMap<>(); // product id, product count

    public static HashMap<String, Cart> cartmap = new HashMap<>(); // key email, val obj

    public Cart(String email, float totalCost, HashMap<Integer, Integer> productDetails) {
        this.email = email;
        this.totalCost = totalCost;
        this.productDetails = productDetails;
    }

    public void setProductDetails(HashMap<Integer, Integer> productDetails) {
        this.productDetails = productDetails;
    }

    public String getEmail() {
        return email;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float cost) {
        this.totalCost = cost;
    }

    public HashMap<Integer, Integer> getProductDetails() {
        return productDetails;
    }

}
