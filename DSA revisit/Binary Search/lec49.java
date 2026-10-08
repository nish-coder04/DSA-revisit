//Row iwth max 1's
public class lec49 {
    static int get1stOccurence(int[][] arr, int rowIndex) {
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int ans = -1;
        if (arr[rowIndex][totalCol - 1] == 0) {
            return totalCol;
        } else {
            int s = 0;
            int e = totalCol - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
        return ans;
    }

    static int rowWithMax1s(int[][] arr) {
        int max1s = -1;
        int resultRow = -1;
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        for (int i = 0; i < totalRow; i++) {
            int firstOccurrence = get1stOccurence(arr, i);
            int countOf1s = totalCol - firstOccurrence;
            if (countOf1s > max1s) {
                max1s = countOf1s;
                resultRow = i;
            }
        }
        return resultRow;
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 } };
        System.out.println(rowWithMax1s(arr));
    }
}
