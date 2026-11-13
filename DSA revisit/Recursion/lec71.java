
//Rat in a maze problem
import java.util.ArrayList;
import java.util.Collections;

public class lec71 {
    static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> paths = new ArrayList<>();
        solve(maze, "", paths, 0, 0);
        Collections.sort(paths);
        return paths;
    }

    static void solve(int[][] maze, String output, ArrayList<String> paths, int row, int coloumn) {
        if (row < 0 || coloumn < 0 || row >= maze.length || coloumn >= maze[0].length || maze[row][coloumn] == 0) {
            return;
        }
        if (row == maze.length - 1 && coloumn == maze[0].length - 1) {
            paths.add(output);
            return;
        }
        maze[row][coloumn] = 0; // choose: visited mark
        // D, L, R, U ke 4 calls (isi order me)
        solve(maze, output + "D", paths, row + 1, coloumn);
        solve(maze, output + "R", paths, row, coloumn + 1);
        solve(maze, output + "U", paths, row - 1, coloumn);
        solve(maze, output + "L", paths, row, coloumn - 1);
        maze[row][coloumn] = 1; // un-choose: backtracks
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };
        ArrayList<String> paths = ratInMaze(maze);
        System.out.println(paths);
    }

}
