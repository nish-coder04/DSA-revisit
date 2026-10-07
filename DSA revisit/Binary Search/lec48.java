//search in a 2D array
public class lec48 {
    static boolean searchMatrix(int[][] arr, int target) {
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int n = totalRow * totalCol;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int row = mid / totalCol;
            int col = mid % totalCol;
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 16;
        System.out.println(searchMatrix(arr, target));
    }
}
