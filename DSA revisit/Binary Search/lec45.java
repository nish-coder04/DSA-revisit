
//Roti prata
import java.util.Arrays;

public class lec45 {
    static int minTimeToCook(int p, int[] cooks) {
        Arrays.sort(cooks);
        int s = 0;
        int maxTime = cooks[cooks.length - 1] * (p * (p + 1)) / 2;
        int ans = -1;
        int e = maxTime;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(cooks, p, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] cooks, int p, int mid) {
        boolean possible = false;
        int prataCount = 0;
        for (int i = 0; i < cooks.length; i++) {
            int currentCook = cooks[i];
            int time = 0;
            int pratas = 0;
            while (time <= mid) {
                if (time + currentCook * (pratas + 1) <= mid) {
                    time += currentCook * (pratas + 1);
                    pratas++;
                } else {
                    break;
                }
            }
            prataCount += pratas;
            if (prataCount >= p) {
                possible = true;
                break;
            }
        }
        return possible;
    }

    public static void main(String[] args) {
        int cooks[] = { 1, 2, 3, 4 };
        int p = 10;
        int finalAns = minTimeToCook(p, cooks);
        System.out.println(finalAns);
    }

}
