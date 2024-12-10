public class InventoryInfo {
    private String catergory;
    private String brand;
    private String model;
    private long price;
    private int stock;
    private float discount;

    public InventoryInfo(String catergory,
            String brand,
            String model,
            long price,
            int stock,
            float discount) {
        this.catergory = catergory;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public String getCategory() {
        return catergory;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public long getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public float getDiscount() {
        return discount;
    }
}
