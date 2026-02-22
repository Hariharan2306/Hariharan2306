package ZPatterns;

public class CoinChange {
    public static void main(String[] args) {

        int[] coins = { 1, 2, 3 };
        int sum = 4;

        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= sum; j++) {
                dp[j] += dp[j - coin];
            }
        }
    }

}
