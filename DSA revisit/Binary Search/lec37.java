//Number of occurence
public class lec37 {
    static int lowerBound(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 3 };
        int target = 3;
        int lowIndex = lowerBound(arr, target);
        int upperIndex = upperBound(arr, target);
        int output = upperIndex - lowIndex + 1;
        System.out.println(output);

    }
}
