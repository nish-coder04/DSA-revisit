//Rotate a matrix
/*public class lec34 {
    static int[][] rotateMatrix(int[][] arr) {
        int finalOutput[][] = new int[arr.length][arr[0].length];

        // Step 1: Transpose (complete this fully first)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                finalOutput[j][i] = arr[i][j];
            }
        }

        // Step 2: Reverse each row (separate loop, AFTER transpose is done)
        for (int i = 0; i < finalOutput.length; i++) {
            int s = 0;
            int e = finalOutput[0].length - 1;
            while (s < e) {
                int temp = finalOutput[i][s];
                finalOutput[i][s] = finalOutput[i][e];
                finalOutput[i][e] = temp;
                s++;
                e--;
            }
        }

        // Step 3: Print
        for (int i = 0; i < finalOutput.length; i++) {
            for (int j = 0; j < finalOutput[0].length; j++) {
                System.out.print(finalOutput[i][j] + " ");
            }
            System.out.println();
        }
        return finalOutput;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateMatrix(arr);
    }
}*/

//Spiral Traversal
import java.util.ArrayList;

public class lec34 {
    static ArrayList<Integer> spiralPrint(int[][] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // loop 1 - left to right row wise
            for (int i = startCol; i <= endCol; i++) {
                result.add(arr[startRow][i]);
            }
            startRow++;
            // loop 2 - top to bottom column wise
            for (int j = startRow; j <= endRow; j++) {
                result.add(arr[j][endCol]);
            }
            endCol--;
            // loop 3 - right to left row wise
            for (int k = endCol; k >= startCol; k--) {
                result.add(arr[endRow][k]);
            }
            endRow--;
            // loop 4 - bottom to top column wise
            for (int l = endRow; l >= startRow; l--) {
                result.add(arr[l][startCol]);
            }
            startCol++;

        }
        return result;
    }

    public static void main(String[] arg) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        ArrayList<Integer> result = spiralPrint(arr);
        System.out.println(result);

    }
}