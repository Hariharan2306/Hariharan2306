/*import org.json.JSONObject;
public class Main {
    public static void main(String[] args) {
        //String c[] =new String[100];//customer
        //String s[] =new String[100];//sales person
        Customer c[]=new Customer[100];
        SalesPerson s[]=new SalesPerson[100];
        Invoice i[]=new Invoice[100];
        String customer="{\"contact_name\":\"zoho\",\"company_name\":\"zoho\",\"contact_type\":\"customer\",\"currency_id\":\"976090000000000064\",\"payment_terms\":0,\"payment_terms_label\":\"Due+on+Receipt\",\"credit_limit\":0,\"billing_address\":{},\"shipping_address\":{},\"contact_persons\":[{\"first_name\":\"akka\",\"last_name\":\"\",\"email\":\"\",\"is_primary_contact\":true}],\"default_templates\":{},\"language_code\":\"en\",\"tags\":[],\"customer_sub_type\":\"business\",\"opening_balances\":[{\"opening_balance_amount\":\"\",\"exchange_rate\":1}]}";
        JSONObject j=new JSONObject(customer);
        c[0] = new Customer(j.getString("contact_name"),j.getString("company_name"),j.getString("contact_type"),j.getLong("customer_id"),j.getLong("currency_id"),j.getInt("payment_terms"),j.getInt("payment_labels"),j.getInt("credit_limit"),j.getBoolean("is_portable_enable"),j.getString("customer_sub_type"),j.getLong("opening_balance_amount"),j.getInt)
        //s[0]=new SalesPerson()
                //constructor setter

    //c[0].s(String) j.get("contact_name");
    // String company_name=(String) j.get
    }
}*/