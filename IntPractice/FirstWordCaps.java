package IntPractice;

// Write a function that takes a string as input and returns the string with the first letter of each word capitalized.
public class FirstWordCaps {
    public static void main(String[] args) {
        String str = "hello world test";

        String op = (str.charAt(0)+"").toUpperCase();
        for(int i=1;i<str.length();i++){
            op+=str.charAt(i);
            if(str.charAt(i) == ' ')
                op += (str.charAt(++i)+"").toUpperCase();
        }
        System.out.println(op);
        withoutInbuiltFuc();
    }

    private static void withoutInbuiltFuc(){
        String str = "hello world test";

        // (str.charAt(0) -'a') - finds position
        // ((str.charAt(0) -'a') + 'A') - finds caps of that position
        int i;
        String op =(char)((str.charAt(0) -'a') +'A')+"";
        for(i = 1; i<str.length();i++){
            op += str.charAt(i);
            if(str.charAt(i) == ' '){
                op += (char)((str.charAt(i+1) - 'a') + 'A');
                i++;
            }
        }
        System.out.println(op);
    }
}