//Subsets 1 - return subsets
/*import java.util.List;
import java.util.ArrayList;

public class lec68 {
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        List<Integer> output = new ArrayList<>();
        solve(index, nums, output, ans);
        return ans;
    }

    static void solve(int index, int[] arr, List output, List<List<Integer>> ans) {
        if (index >= arr.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        output.add(arr[index]);
        // include
        solve(index + 1, arr, output, ans);
        // backtrack
        output.remove(output.size() - 1);
        // exclude
        solve(index + 1, arr, output, ans);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(subsets(arr));
    }
}*/

// Subsets 2 - return power set (can have duplicates in input
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class lec68 {
    static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        List<Integer> output = new ArrayList<>();
        solve(index, nums, output, ans);
        return ans;
    }

    static void solve(int index, int[] arr, List output, List<List<Integer>> ans) {
        if (index >= arr.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        output.add(arr[index]);
        // include
        solve(index + 1, arr, output, ans);
        // backtrack
        output.remove(output.size() - 1);
        while (index + 1 < arr.length && arr[index] == arr[index + 1]) {
            index++;
        }
        // exclude
        solve(index + 1, arr, output, ans);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        System.out.println(subsets(arr));
    }
}
