package customer;

import customer.CustomerDetails;
import customer.CustomerFileHandler;
import main.Ecommerce;

import java.util.Scanner;

public class CustomerHandler {
    Scanner sc=new Scanner(System.in);
    public void customerSignUp(){
        System.out.println("enter customer Name ");
        String cName=sc.next();
        System.out.println("enter your new Password ");
        String cPassword=sc.next();
        System.out.println("please RE-enter confirm password ");
        String cRePassword=sc.next();
        System.out.println("please enter mobile number ");
        String cMobNo=sc.next();
        System.out.println("Enter your current residential address ");
        String cAddress=sc.next();
        System.out.println("enter email id ");
        String cEmail=sc.next();

        if(validPassword(cPassword,cRePassword))
            cPassword=encryptPassword(cPassword);
        else{
            System.out.println("invalid password try again ");
            return;
        }
        if(cMobNo.length()!=10){
            System.out.println("given mobile number is not 10 digits");
            return;}

        for(int i=0;i<cMobNo.length();i++){
            if(!(cMobNo.charAt(i)>='0' && cMobNo.charAt(i)<='9')){
                System.out.println("invalid mobile number");
                return;}
        }

        CustomerDetails customer=new CustomerDetails(cName,cPassword,cMobNo,cAddress,cEmail);

        if(Ecommerce.cMap.get(cName)!=null){//to check user name does exists or not
            System.out.println("user name already exists try again ");
            return;}

        Ecommerce.cMap.put(cName,customer);
        CustomerFileHandler handler=new CustomerFileHandler();
        handler.addCustomerToFile(customer);
    }
    public boolean authenticate(){
        System.out.println("enter existing userName ");
        String refName=sc.next();
        System.out.println("enter password ");
        String refPassword= sc.next();

        String refEncryptedPassword=encryptPassword(refPassword);
        CustomerDetails customer= Ecommerce.cMap.get(refName);
        if(customer==null) {
            System.out.println("authentication failed -no user found ");
            return false;
        }

        if(customer.name.equals(refName) && customer.password.equals(refEncryptedPassword))
            return true;

        return false;
    }
    private boolean validPassword(String cPassword,String cRePassword){
        if(cPassword.length()==0)
            return false;
        if(!(cPassword.equals(cRePassword)))
            return false;
        for(int i=0;i<cPassword.length();i++){//to check password is only char of uppercase or lower or no only
            if(!((cPassword.charAt(i)>='0' && cPassword.charAt(i)<='9') || (cPassword.charAt(i)>='a' && cPassword.charAt(i)<='z') ||(cPassword.charAt(i)>='A' && cPassword.charAt(i)<='Z')))
                return false;
        }
        return true;
    }
    private String encryptPassword(String password){
        char[] pass=password.toCharArray();
        int i;
        for(i=0;i< pass.length;i++){
            switch (pass[i]){
                case '9':
                    pass[i]='0';
                    break;
                case 'z':
                    pass[i]='a';
                    break;
                case 'Z':
                    pass[i]='A';
                    break;
                default:
                    pass[i]+=1;
            }
        }
        return String.valueOf(pass);
    }
}
