package IntPractice;

public class FindNoWords {
    public static void main(String[] args) {
        String s = "Helllo  World    a";
        int i,count = 0;

        if(s.length() == 0){
            System.out.println(0);
            return;
        }
        boolean word = false;
        for(i = 0; i< s.length(); i++){
            boolean isChar = s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z';
            if(!word && isChar){
                count++;
                word=true;
            }
            else if(!isChar) word = false;
        }
        System.out.println(count);
    }
}
