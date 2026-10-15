//Print name 10 times
/*public class lec57 {
    static void printName(String name, int num) {
        if (num == 0) {
            return;
        }
        System.out.println(name);
        printName(name, num - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        String name = "Nishtha";
        printName(name, num);
    }
}*/

// Print 1-N
/*public class lec57 {
    static void printNum(int n, int count) {
        if (n < count) {
            return;
        }
        System.out.println(count);
        printNum(n, count + 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        printNum(n, count);
    }
}*/

// Print N-1
/*public class lec57 {
    static void printNum(int n, int count) {
        if (n < count) {
            return;
        }
        printNum(n, count + 1);
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        printNum(n, count);
    }
}*/

//Print array 
/*public class lec57 {
    static void printArray(int[] arr, int i) {
        if (i >= arr.length) {
            return;
        }
        System.out.println(arr[i]);
        printArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int i = 0;
        printArray(arr, i);
    }
}*/

//Max element int array
/*public class lec57 {
    static int maxEle(int[] arr, int i, int max) {
        if (i >= arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return maxEle(arr, i + 1, max);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 7, 9, 8, 3, 1, 4 };
        int i = 0;
        int max = Integer.MIN_VALUE;
        System.out.println(maxEle(arr, i, max));
    }
}*/

//Min element int array
/*public class lec57 {
    static int minEle(int[] arr, int i, int min) {
        if (i >= arr.length) {
            return min;
        }
        if (min > arr[i]) {
            min = arr[i];
        }
        return minEle(arr, i + 1, min);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 7, 9, 8, 3, 1, 4 };
        int i = 0;
        int min = Integer.MAX_VALUE;
        System.out.println(minEle(arr, i, min));
    }
}*/

//Search element in array
/*public class lec57 {
    static boolean findTarget(int[] arr, int target, int i) {
        if (i >= arr.length) {
            return false;
        }
        if (arr[i] == target) {
            return true;
        }
        return findTarget(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 5, i = 0;
        System.out.println(findTarget(arr, target, i));
    }
}*/

//count element in array
/*public class lec57 {
    static void countEle(int[] arr, int count, int i, int target) {
        if (i >= arr.length) {
            System.out.println(count);
            return;
        }
        if (arr[i] == target) {
            count = count + 1;
        }
        countEle(arr, count, i + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 10, 40, 50, 10 };
        int count = 0, i = 0, target = 10;
        countEle(arr, count, i, target);
    }
}*/

//Print digits
/*public class lec57 {
    static void printDigits(int num) {
        if (num == 0) {
            return;
        }
        int x = num % 10;
        printDigits(num / 10);
        System.out.println(x);
    }

    public static void main(String[] args) {
        int num = 137;
        printDigits(num);
    }
}*/