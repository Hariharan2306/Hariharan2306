public class DummyYetToCompl {
    public static void main(String[] args) {
        //implements Strstr
        //gn str is a substring of  another str or not(not sure how)
        int j;
        String haystack="hello",needle="ll";
        for(int i=0;i<haystack.length();i++){
            for(j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            System.out.println(i+" test "+j);
            if(j==needle.length())
                System.out.println(i);
        }
        //System.out.println("not present ");
    }
}
