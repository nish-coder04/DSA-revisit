//Search in a nearly sorted array
public class lec46 {
    static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (mid - 1 >= s && arr[mid - 1] == target) {
                return mid - 1;
            } else if (mid + 1 <= e && arr[mid + 1] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 10, 9, 11 };
        int target = 3;
        System.out.println(search(arr, target));
    }
}
