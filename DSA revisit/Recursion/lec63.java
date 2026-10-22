//Parition equal subset sum 
public class lec63 {
    static boolean canPartition(int[] arr, int target) {
        int i = 0, remaining = target;
        boolean ans = solve(arr, i, remaining);
        return ans;
    }

    static boolean solve(int[] arr, int i, int remaining) {
        if (remaining == 0) {
            return true;
        }
        if (i >= arr.length || remaining < 0) {
            return false;
        }
        boolean include = solve(arr, i + 1, remaining - arr[i]);
        boolean exclude = solve(arr, i + 1, remaining);
        return include || exclude;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 11, 5 };
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        if (total % 2 != 0) {
            System.out.println(false);
            return;
        }
        int target = total / 2;
        System.out.println(canPartition(arr, target));
    }
}