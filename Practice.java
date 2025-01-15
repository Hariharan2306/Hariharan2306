class Practice{
    public static void main(String[] args) {
        String s = "hello Hello world. world test test",op = "";
        // op - hello Hello world. test

        String[] a = s.split(" ");
        for(int i = 0;i < a.length; i++){
            for(int j = i+1;j < a.length - 1; j++){
                if(a[i] != "-1" && a[i].equals(a[j])){
                    a[j] = "-1";
                    continue;
                }
                op+= a[i]+" ";
            }
        }
        System.out.println(op);
    }
    // private static String[] spliString(String s){
    //     int i;
    //     String[] a = new String[];
    //     for(i = 0;i < s.length(); i++){
    //         if()
    //     }
    // }
 }
