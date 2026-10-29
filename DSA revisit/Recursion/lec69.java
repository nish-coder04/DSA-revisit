//Combination sum - 1 ( array elements can be used multiple times)
/*import java.util.ArrayList;
import java.util.List;

public class lec69 {
    static List<List<Integer>> combination(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        List<Integer> output = new ArrayList<>();
        solve(i, arr, target, ans, output);
        return ans;

    }

    static void solve(int i, int[] arr, int remaining, List<List<Integer>> ans, List<Integer> output) {
        if (remaining == 0) {
            ans.add(new ArrayList(output));
            return;
        }
        if (remaining < 0 || i >= arr.length) {
            return;
        }
        output.add(arr[i]);
        solve(i, arr, remaining - arr[i], ans, output);
        output.remove(output.size() - 1);
        solve(i + 1, arr, remaining, ans, output);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(combination(arr, target));
    }
}*/

//Combination sum - 2 ( array element can only be used one time)
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lec69 {
    static List<List<Integer>> combination(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        List<Integer> output = new ArrayList<>();
        solve(i, arr, target, ans, output);
        return ans;

    }

    static void solve(int i, int[] arr, int remaining, List<List<Integer>> ans, List<Integer> output) {
        if (remaining == 0) {
            ans.add(new ArrayList(output));
            return;
        }
        if (remaining < 0 || i >= arr.length) {
            return;
        }
        output.add(arr[i]);
        solve(i + 1, arr, remaining - arr[i], ans, output);
        output.remove(output.size() - 1);
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        solve(i + 1, arr, remaining, ans, output);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        System.out.println(combination(arr, target));
    }
}*/

//Combination -3 
//Combination sum - 2 ( array element can only be used one time)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lec69 {
    static List<List<Integer>> combination(int[] arr, int n, int k) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        List<Integer> output = new ArrayList<>();
        solve(i, arr, n, ans, output, k);
        return ans;

    }

    static void solve(int i, int[] arr, int remaining, List<List<Integer>> ans, List<Integer> output, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0 && remaining == 0) {
            ans.add(new ArrayList(output));
            return;
        }
        if (remaining < 0 || i >= arr.length) {
            return;
        }
        output.add(arr[i]);
        solve(i + 1, arr, remaining - arr[i], ans, output, k - 1);
        output.remove(output.size() - 1);
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        solve(i + 1, arr, remaining, ans, output, k);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 7, k = 3;
        System.out.println(combination(arr, n, k));
    }
}
