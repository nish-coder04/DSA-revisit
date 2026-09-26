//Peak of mountain array
public class lec38 {
    static int peakIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int outputIndex = 0;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= arr[mid + 1]) {
                outputIndex = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return outputIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 35, 25 };
        int output = peakIndex(arr);
        System.out.println(output);
    }
}