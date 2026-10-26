//Subsequences with sum K
public class lec67 {
    static boolean checkSubsequenceSum(int[] arr, int k) {
        int index = 0;
        boolean ans = solve(arr, k, index);
        return ans;
    }

    static boolean solve(int[] arr, int k, int index) {
        if (k == 0) {
            return true;
        }
        if (k < 0 || index >= arr.length) {
            return false;
        }
        boolean include = solve(arr, k - arr[index], index + 1);
        boolean exclude = solve(arr, k, index + 1);
        return include || exclude;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        int targetSum = 8;
        System.out.println(checkSubsequenceSum(arr, targetSum));
    }
}