//sort an arrays of 0's and 1's
/*public class arrays3 {
    static void sort0And1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1 };
        sort0And1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

//Missing number
/*public class arrays3 {
    static void missingNum(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }
        int missingNum = sum - arrSum;
        System.out.println("Missing number is: " + missingNum);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 6, 7, 8, 9 };
        missingNum(arr);
    }
}*/

//Find the unique element
/*public class arrays3 {
    static void uniqueElement(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        System.out.println("Unique element is: " + ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8 };
        uniqueElement(arr);
    }
}*/