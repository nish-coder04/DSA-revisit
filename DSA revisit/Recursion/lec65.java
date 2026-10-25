//Jump game problem
public class lec65 {
    static boolean canJump(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (index >= arr.length) {
            return false;
        }
        if (arr[index] == 0) {
            return false;
        }
        int jumpValue = arr[index];
        boolean finalAns = false;
        for (int jump = 1; jump <= jumpValue; jump++) {
            boolean ans = canJump(arr, index + jump);
            finalAns = finalAns || ans;
        }
        return finalAns;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        int index = 0;
        System.out.println(canJump(arr, index));
    }
}
