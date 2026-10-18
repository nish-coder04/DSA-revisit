//House robber problem
public class lec60 {
    static int rob(int[] nums) {
        int i = 0;
        int ans = solve(nums, i);
        return ans;
    }

    static int solve(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        int includes = nums[i] + solve(nums, i + 2);
        int excludes = 0 + solve(nums, i + 1);
        return Math.max(includes, excludes);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        System.out.println(rob(nums));
    }
}