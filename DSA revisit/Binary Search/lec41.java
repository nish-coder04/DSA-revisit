//Book allocation
public class lec41 {
    static int findPages(int[] arr, int k) {
        int n = arr.length;
        int s = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidanswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static boolean isValidanswer(int[] arr, int k, int mid) {
        boolean isValid = false;
        int pages = 0;
        int student = 1;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mid) {
                pages = pages + arr[i];
                isValid = true;
            } else {
                student++;
                if (student > k || arr[i] > mid) {
                    return false;
                } else {
                    pages = 0;
                    pages = pages + arr[i];
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 67, 90 };
        int k = 2;
        int answer = findPages(arr, k);
        System.out.println(answer);
    }
}
