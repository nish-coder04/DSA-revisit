//Coin change 2(how many ways)
public class lec61 {
    static int coinChange(int[] coins, int amount) {
        int i = 0;
        int ans = solve(amount, coins, i);
        return ans;
    }

    static int solve(int amount, int[] coins, int i) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0 || i >= coins.length) {
            return 0;
        }
        int includes = solve(amount - coins[i], coins, i);
        int excludes = solve(amount, coins, i + 1);
        return includes + excludes;
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 5;
        System.out.println(coinChange(coins, amount));
    }
}