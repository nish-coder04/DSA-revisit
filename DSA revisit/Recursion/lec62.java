//COin change -1(minimum coins)
public class lec62 {
    static int coinChange(int[] coins, int amount) {
        int i = 0;
        int ans = solve(coins, i, amount);
        return ans >= 1000000 ? -1 : ans;
    }

    static int solve(int[] coins, int i, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0 || i >= coins.length) {
            return 1000000;
        }
        int include = 1 + solve(coins, i, amount - coins[i]);
        int exclude = solve(coins, i + 1, amount);
        return Math.min(include, exclude);
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}