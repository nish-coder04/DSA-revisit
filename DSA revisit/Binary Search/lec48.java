//search in a 2D array- level -1 
/*public class lec48 {
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
}*/

// search in a 2D array- level -2
public class lec48 {
    static boolean searchMatrix(int[][] arr, int target) {
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int n = totalRow * totalCol;
        int startRow = arr.length - 1;
        int startCol = 0;
        while (startRow >= 0 && startCol < totalCol) {
            if (arr[startRow][startCol] == target) {
                return true;
            } else if (arr[startRow][startCol] < target) {
                startCol++;
            } else {
                startRow--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 1, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 13;
        System.out.println(searchMatrix(arr, target));
    }
}