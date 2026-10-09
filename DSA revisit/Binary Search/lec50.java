//Unbounded Binary Search
public class lec50 {
    static int targetIndex(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }
        int i = 1;
        while (arr[i] <= target) {
            i = i * 2;
        }
        if (arr[i] > target) {
            int s = i / 2;
            int e = i;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 30;
        System.out.println(targetIndex(arr, target));
    }
}
