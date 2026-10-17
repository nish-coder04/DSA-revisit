
//Include- exclude pattern / pick not pick / all subsequences in a string
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class lec59 {
    static void solve(String s, int i, String curr, List<String> ans) {
        if (i >= s.length()) {
            ans.add(curr);
            return;
        }
        solve(s, i + 1, curr, ans); // exclude
        solve(s, i + 1, curr + s.charAt(i), ans); // include
    }

    static List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        solve(s, 0, "", ans);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(powerSet(s));
    }
}