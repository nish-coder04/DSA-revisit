//Eko Spoj
public class lec44 {
    static int maxSawHeight(int[] trees, int m) {
        int s = 0;
        int maxTreeHeight = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > maxTreeHeight) {
                maxTreeHeight = trees[i];
            }
        }
        int e = maxTreeHeight;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(trees, m, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] trees, int m, int mid) {
        boolean ans = false;
        int wood = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > mid) {
                wood = wood + (trees[i] - mid);
                if (wood >= m) {
                    ans = true;
                    break;
                } else {
                    ans = false;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] trees = { 20, 15, 10, 17 };
        int m = 7;
        int finalHeight = maxSawHeight(trees, m);
        System.out.println(finalHeight);
    }
}
