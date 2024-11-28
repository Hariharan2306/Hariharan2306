public class Customer {
    private String contact_name;
    private String company_name;
    private String website;
    private String contact_type;
    //private long customer_id;
    private String currency_id;
    private String payment_terms;
    private String payment_terms_label;
    private int credit_limit;
    private String customer_sub_type;
    private long opening_balance_amount;
    private int exchange_rate;
    private String tax_number;
    public  Customer(String contact_name,String company_name,String website,String contact_type,String currency_id,String payment_terms,String payment_terms_label,String customer_sub_type,long opening_balance_amount,int exchange_rate,String tax_number){
        this.contact_name=contact_name;
        this.company_name=company_name;
        this.website=website;
        this.contact_type=contact_type;
        this.currency_id=currency_id;
        this.payment_terms=payment_terms;
        this.payment_terms_label=payment_terms_label;
        this.credit_limit=credit_limit;
        this.customer_sub_type=customer_sub_type;
        this.opening_balance_amount=opening_balance_amount;
        this.exchange_rate=exchange_rate;
        this.tax_number=tax_number;
    }
    public String getContact_name() {
        return contact_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getContact_type() {
        return contact_type;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public String getPayment_terms() {
        return payment_terms;
    }

    public String getPayment_terms_label() {
        return payment_terms_label;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getCustomer_sub_type() {
        return customer_sub_type;
    }

    public long getOpening_balance_amount() {
        return opening_balance_amount;
    }

    public int getExchange_rate() {
        return exchange_rate;
    }

    //public long getCustomer_id() {
    //    return customer_id;
    //}

    public String getTax_number() {
        return tax_number;
    }
}



