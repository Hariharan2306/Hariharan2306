package IntPractice;

class RemoveConsecutiveStr{
    // to remove Remove Consecutive similiar strings
    public static void main(String[] args) {
        String s = "hello Hello world. world test";
        // op - hello Hello world. test

        String[] a = s.split(" ");
        String op = a[0];
        int i;
        
        for(i = 1;i < a.length; i++){
            if(!a[i].replaceAll("[^a-zA-Z0-9]", "").equals(a[i-1].replaceAll("[^a-zA-Z0-9]", "")))
                op += " " + a[i];
            }
            System.out.println(op);
    }
 }
 