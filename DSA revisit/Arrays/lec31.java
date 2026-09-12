
//Missing elements from an array with duplicates
import java.util.ArrayList;
import java.util.List;

public class lec31 {
    static void missingEle(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                int valueAtIndex = i + 1;
                ans.add(valueAtIndex);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 4, 5, 2, 2 };
        missingEle(arr);
    }
}
