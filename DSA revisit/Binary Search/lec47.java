//Find single non duplicating element
public class lec47 {
    static int singleNonDuplicate(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int answer = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s == e) {
                answer = arr[s];
                return answer;
            }
            if (mid % 2 != 0) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                s = mid + 2;
            } else {
                e = mid;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        int finalAnswer = singleNonDuplicate(arr);
        System.out.println(finalAnswer);
    }
}
