
//Aggressive cows 
import java.util.Arrays;

public class lec43 {
    static int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int s = 0;
        int n = arr.length;
        int e = arr[n - 1] - arr[0];
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidDistance(arr, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    static boolean isValidDistance(int[] arr, int k, int mid) {
        boolean isValid = false;
        int cows = 1;
        int stalls = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[stalls] >= mid) {
                cows++;
                stalls = i;
                if (cows >= k) {
                    isValid = true;
                }
            } else {
                continue;
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 9 };
        int k = 3;
        int finalAnswer = aggressiveCows(arr, k);
        System.out.println(finalAnswer);
    }
}