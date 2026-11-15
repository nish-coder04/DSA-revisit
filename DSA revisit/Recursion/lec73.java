
//N queens
import java.util.*;

public class lec73 {
    static List<List<String>> solvedQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> ans = new ArrayList<>();

        solve(n, 0, ans, board);
        return ans;
    }

    static void solve(int n, int col, List<List<String>> ans, char[][] board) {
        if (col >= n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(n, col + 1, ans, board);
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(int row, int col, char[][] board, int n) {
        // left horizontal
        for (int j = col; j >= 0; j--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // left upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // left lower diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solvedQueens(n);
        System.out.println(ans);
    }
}
