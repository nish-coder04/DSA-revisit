//Painters partition
public class lec42 {
    static int minTime(int[] arr, int k) {
        int s = 0;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int e = sum;
        int ans = -1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (isValid(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static boolean isValid(int[] arr, int k, int mid) {
        boolean validAns = false;
        int boards = 0;
        int painter = 1;
        for (int i = 0; i < arr.length; i++) {
            if (boards + arr[i] <= mid) {
                boards = boards + arr[i];
                validAns = true;
            } else {
                painter++;
                if (painter > k || arr[i] > mid) {
                    return false;
                } else {
                    boards = 0;
                    boards = boards + arr[i];
                    validAns = true;
                }
            }
        }
        return validAns;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 30, 20, 15 };
        int k = 3;
        int finalAns = minTime(arr, k);
        System.out.println(finalAns);
    }
}
