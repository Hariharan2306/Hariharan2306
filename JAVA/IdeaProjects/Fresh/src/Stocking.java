public class Stocking {
    private String productName;
    private int price;
    private int productQuantity;

    public Stocking(String pName,int pPrice,int pQuantity){
        this.productName=pName;
        this.price=pPrice;
        this.productQuantity=pQuantity;
    }
    public int getPrice(){return price;}

    public String getProductName(){return productName;}

    public int getProductQuantity(){return productQuantity;}

    public void setProductName(String productName) {this.productName = productName;}

    public void setPrice(int price) {this.price = price;}

    public void setProductQuantity(int productQuantity) {this.productQuantity = productQuantity;}
}
