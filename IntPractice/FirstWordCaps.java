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
    }
}