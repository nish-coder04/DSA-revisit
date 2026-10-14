//Climbing stairs
public class lec56 {
    static int climbingStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int ans = climbingStairs(n - 1) + climbingStairs(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbingStairs(n));
    }
}
