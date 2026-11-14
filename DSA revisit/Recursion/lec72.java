
//Phone key pad problem
import java.util.ArrayList;
import java.util.List;

public class lec72 {
    static List<String> letterCombinations(String digits) {
        String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        int index = 0;
        solve(digits, "", result, mapping, index);
        return result;
    }

    static void solve(String digits, String output, List<String> result, String[] mapping, int index) {
        if (index >= digits.length()) {
            result.add(output);
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(index));
        String letters = mapping[digit];
        for (char c : letters.toCharArray()) {
            solve(digits, output + c, result, mapping, index + 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }
}
