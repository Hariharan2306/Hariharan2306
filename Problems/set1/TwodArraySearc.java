package set1;

public class TwodArraySearc {
    public static void main(String[] args) {
        char[][] a = {{'w','e','l','c','o'},
                      {'m','e','t','o','z'},
                      {'o','h','o','c','o'},
                      {'r','p','o','r','a'},
                      {'t','i','o','n'}};
        int i,j,k=0,t=-1;
        String s = "too";
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a[i].length-1;j++){
                t = j;
                while(a[j][i] == s.charAt(k)){
                    if(k == s.length()-1){
                        System.out.println(t+","+i);
                        System.out.println(j+","+i);
                        return;
                    }
                    k++;
                    j++;
                }
                k=0;
                j=t;
            }
        }
        i=0;
        j=0;
        for(i=0;i<a[0].length;i++){
            for(j=0;j<a.length;j++){
                t = j;
                while(a[j][i] == s.charAt(k)){
                    if(k == s.length()-1){
                        System.out.println(j+","+t);
                        System.out.println(j+","+i);
                        return;
                    }
                    k++;
                    j++;
                }
                k=0;
                j=t;
            }
        }
    }
}
