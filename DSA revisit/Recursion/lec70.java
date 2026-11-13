//print string permutations in sorted order
import java.util.ArrayList;
import java.util.Collections;

public class lec70 {
    static ArrayList<String> printPermutations(String str) {
        ArrayList<String> ans = new ArrayList<>();
        solve(str, "", ans);
        Collections.sort(ans);
        return ans;
    }

    static void solve(String str, String output, ArrayList<String> ans) {
        if (str.isEmpty()) {
            ans.add(output);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remString = str.substring(0, i) + str.substring(i + 1);
            solve(remString, output + ch, ans);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(printPermutations(str));
    }
}
