//Reverse words in a string
public class lec51 {
    static String reversedString(String initial) {
        StringBuilder reversed = new StringBuilder();
        int i = initial.length() - 1;
        while (i >= 0) {
            while (i >= 0 && initial.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = i;
            while (j >= 0 && initial.charAt(j) != ' ') {
                j--;
            }
            reversed.append(initial.substring(j + 1, i + 1));
            while (j >= 0 && initial.charAt(j) == ' ') {
                j--;
            }
            if (j >= 0) {
                reversed.append(' ');
            }
            i = j;

        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String initial = "the sky is blue";
        System.out.println(reversedString(initial));
    }
}