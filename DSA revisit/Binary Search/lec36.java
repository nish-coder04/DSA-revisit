/*public class lec36 {
    static boolean findTarget(int[] arr, int target) {
        boolean ans = false;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = true;
                return ans;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int target = 40;
        boolean isPresent = findTarget(arr, target);
        System.out.println(isPresent);
    }
}*/