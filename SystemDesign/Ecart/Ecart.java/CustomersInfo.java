import java.util.ArrayList;

public class CustomersInfo {
    private String email;
    private String encryptedPassword;
    private String name;
    private String mobile;
    private float credit;

    private ArrayList<InvoiceDetails> invoiceList = new ArrayList<>();

    public CustomersInfo(String email, String encryptedPassword, String name, String mobile, float credit) {
        this.email = email;
        this.encryptedPassword = encryptedPassword;
        this.name = name;
        this.mobile = mobile;
        this.credit = credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public void setInvoiceList(ArrayList<InvoiceDetails> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public String getEmail() {
        return email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public float getCredit() {
        return credit;
    }

    public ArrayList<InvoiceDetails> getInvoiceList() {
        return invoiceList;
    }
}
