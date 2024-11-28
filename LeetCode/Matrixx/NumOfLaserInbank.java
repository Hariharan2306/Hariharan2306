package LeetCode.Matrixx;

public class NumOfLaserInbank {
    public static void main(String[] args) {
        String[] bank = { "011001", "000000", "010100", "001000" };
        int i, j, prev = 0, curr = 0, op = 0;

        for (i = 0; i < bank.length; i++) {
            if (curr != 0)
                prev = curr;
            curr = 0;
            for (j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1')
                    curr++;
            }
            if (prev != 0)
                op += prev * curr;
        }
        System.out.println(op);
    }
}
