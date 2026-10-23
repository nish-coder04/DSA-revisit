//Minimize the difference between target and chosen elements
public class lec64 {
    static int minimizeTheDifference(int[][] mat, int target) {
        int sum = 0;
        int row = 0, col = 0;
        int ans = solve(mat, sum, target, row, col);
        return ans;
    }

    static int solve(int[][] mat, int sum, int target, int row, int col) {
        if (row >= mat.length) {
            return Math.abs(target - sum);
        }
        if (col >= mat[0].length) {
            return Integer.MAX_VALUE;
        }
        int choose = solve(mat, sum + mat[row][col], target, row + 1, 0);
        int leave = solve(mat, sum, target, row, col + 1);
        return Math.min(choose, leave);
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 13;
        System.out.println(minimizeTheDifference(mat, target));
    }
}
