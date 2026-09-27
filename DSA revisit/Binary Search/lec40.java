//BS on answers pattern
//sqrt(x)
/*public class lec40 {
    static int squareRoot(int num) {
        int s = 1;
        int e = num;
        int sqrt = 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid <= num / mid) {
                sqrt = mid;
                s = mid + 1;
            } else if (mid > num / mid) {
                e = mid - 1;
            }
        }
        return sqrt;
    }

    public static void main(String[] args) {
        int num = 76;
        int answer = squareRoot(num);
        System.out.println(answer);
    }
}*/

//sqrt(x) with precision
public class lec40 {
    static double squareRoot(int num) {
        int s = 1;
        int e = num;
        double sqrt = 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid <= num / mid) {
                sqrt = mid;
                s = mid + 1;
            } else if (mid > num / mid) {
                e = mid - 1;
            }
        }
        double factor = 1;
        int precision = 3;
        for (int round = 1; round <= precision; round++) {
            factor = factor / 10;
            for (int i = 1; i <= 10; i++) {
                if ((sqrt + factor) <= num / (sqrt + factor)) {
                    sqrt = sqrt + factor;
                }
            }
        }
        return sqrt;
    }

    public static void main(String[] args) {
        int num = 56;
        double answer = squareRoot(num);
        System.out.printf("%.3f%n", answer);
    }
}