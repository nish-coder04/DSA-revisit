//Solving 2D array problems
//Print the sum of each row in a 2D array
/*import java.util.ArrayList;

public class lec33 {
    static void printRowSum(int[][] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
            }
            output.add(sum);
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printRowSum(arr);
    }
}*/

//Print the sum of each column in 2D array
/*import java.util.ArrayList;

public class lec33 {
    static void printColSum(int[][] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[j][i];
            }
            output.add(sum);
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printColSum(arr);
    }
}*/

//Wave print a martrix
/*import java.util.ArrayList;

public class lec33 {
    static void wavePrint(int[][] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int row = 0; row < arr.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < arr[0].length; col++) {
                    answer.add(arr[row][col]);
                }
            } else {
                for (int col = arr[0].length-1; col >= 0; col--) {
                    answer.add(arr[row][col]);
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        wavePrint(arr);
    }
}*/

//Transpose of a matrix 
public class lec33 {
    static int[][] transpose(int[][] arr) {
        int[][] answer = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transpose(arr);
    }
}