//Factorial of a number
/*public class lec54 {
    static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        long ans = num * factorial(num - 1);
        return ans;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
}*/

//power of 2
/*public class lec54 {
    static long powerOf2(long num) {
        if (num == 0) {
            return 1;
        }
        long ans = 2 * powerOf2(num - 1);
        return ans;
    }

    public static void main(String[] args) {
        long num = 5;
        System.out.println(powerOf2(num));
    }
}*/

//Fibonacci series
/*public class lec54 {
    static long fibonacci(long num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        long ans = fibonacci(num - 1) + fibonacci(num - 2);
        return ans;
    }

    public static void main(String[] args) {
        long num = 5;
        System.out.println(fibonacci(num));
    }
}*/