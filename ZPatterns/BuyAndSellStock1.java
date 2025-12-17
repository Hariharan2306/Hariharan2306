package ZPatterns;

public class BuyAndSellStock1 {
    public static void main(String[] args) {
        BuyAndSellStock1 b = new BuyAndSellStock1();
        System.out.println(b.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    public int maxProfit(int[] p) {
        int profit = 0, bought = p[0];
        for (int i = 1; i < p.length; i++) {
            if (p[i] > bought)
                profit = Math.max(p[i] - bought, profit);
            else
                bought = p[i];
        }
        return profit;
    }
}
