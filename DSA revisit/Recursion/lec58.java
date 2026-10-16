//Recursive binary search
public class lec58 {
    static int solve(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            e = mid - 1;
        } else if (arr[mid] < target) {
            s = mid + 1;
        }
        return solve(arr, target, s, e);
    }

    static void binaryRecursion(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int ans = solve(arr, target, s, e);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int target = 80;
        binaryRecursion(arr, target);
    }
}