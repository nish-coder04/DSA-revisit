//Triangle
public class lec66 {
    static int minTotal(int[][] triangle) {
        int row = 0, col = 0;
        int finalAns = solve(triangle, row, col);
        return finalAns;
    }

    static int solve(int[][] triangle, int row, int col) {
        if (row >= triangle.length) {
            return 0;
        }
        int down = solve(triangle, row + 1, col);
        int diagonal = solve(triangle, row + 1, col + 1);
        return triangle[row][col] + Math.min(down, diagonal);
    }

    public static void main(String[] args) {
        int[][] triangle = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
        System.out.println(minTotal(triangle));
    }
}