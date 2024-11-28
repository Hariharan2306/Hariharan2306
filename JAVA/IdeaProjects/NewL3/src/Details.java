public class Details {
    private String customerNames;
    private String customerPasswords;
    private String shopkeeperNames;
    private String shopkeepersPasswords;
    private int IDs;
    private int wallets;

    public void setCustomerNames(String customerNames){this.customerNames = customerNames;}
    public String getCustomerNames(){return customerNames;}

    public void setCustomerPasswords(String customerPasswords){this.customerPasswords = customerPasswords;}
    public String getCustomerPasswords(){return customerPasswords;}

    public void setWallets(int wallets){this.wallets=wallets;}
    public int getWallets(){return wallets;}

    public void setShopkeeperNames(String shopkeeperNames){this.shopkeeperNames=shopkeeperNames;}
    public String getShopkeeperNames(){return shopkeeperNames;}

    public void setShopkeepersPasswords(String shopkeepersPasswords){this.shopkeepersPasswords=shopkeepersPasswords;}
    public String getShopkeepersPasswords(){return shopkeepersPasswords;}

    public void setIDs(int IDs){this.IDs=IDs;}
    public int getIds(){return IDs;}

}
