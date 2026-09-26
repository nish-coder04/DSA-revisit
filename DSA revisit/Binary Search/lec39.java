//pivot index of a rotated array
/*public class lec39 {
    static int pivotIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int outputIndex = 0;
        if (arr[s] < arr[e]) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[arr.length - 1]) {
                e = mid - 1;
            } else {
                outputIndex = mid;
                s = mid + 1;
            }
        }
        return outputIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 60, 70, 10, 20, 30, 40 };
        int answer = pivotIndex(arr);
        System.out.println(answer);
    }
}*/

//search in a rotated array
//search in a rotated array
public class lec39 {
    static int pivotIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int outputIndex = -1;
        if (arr[s] < arr[e]) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[arr.length - 1]) {
                e = mid - 1;
            } else {
                outputIndex = mid;
                s = mid + 1;
            }
        }
        return outputIndex;
    }

    static int binarySearch(int[] arr, int s, int e, int target) {
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
        return -1;
    }

    static int findTarget(int[] arr, int target) {
        int pivotIndex = pivotIndex(arr);

        // no rotation - normal binary search on whole array
        if (pivotIndex == -1) {
            return binarySearch(arr, 0, arr.length - 1, target);
        }

        // check part 1: index 0 to pivotIndex
        if (target >= arr[0] && target <= arr[pivotIndex]) {
            return binarySearch(arr, 0, pivotIndex, target);
        }

        // else check part 2: pivotIndex+1 to end
        return binarySearch(arr, pivotIndex + 1, arr.length - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 50, 60, 70, 10, 20, 30, 40 };
        int target = 30;
        int answer = findTarget(arr, target);
        System.out.println(answer);
    }
}