// lec27 
// Find the average of array elements 
/*public class arrays1 {
    static void main(String[] args) {
        int[] arr = { 2, 4, 3, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Average of array elements is : " + average);
    }
}*/

//Multiply each element of array by 10
/*public class arrays1 {
    static void multiply(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        multiply(arr);

    }
}*/

//Search for an element in an array 
/*public class arrays1 {
    static boolean searchElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 3;
        boolean ans = searchElement(arr, key);
        System.out.println("Element found: " + ans);
    }
}*/

//Find the max element 
/*public class arrays1 {
    static void maxElement(int[] arr) {
        int maxEle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + maxEle);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 9, 6, 0, 4, 2, 6, 9, 8 };
        maxElement(arr);
    }
}*/

//Return sum of +ve and -ve numbers
/*public class arrays1 {
    static void sumOfPosNeg(int[] arr) {
        int PosSum = 0, NegSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                PosSum = PosSum + arr[i];
            } else {
                NegSum = NegSum + arr[i];
            }
        }
        System.out.println("Sum of positive numbers is: " + PosSum);
        System.out.println("Sum of negative numbers is: " + NegSum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 4, -5, 6, -7 };
        sumOfPosNeg(arr);
    }
}*/

// Count the number of 0's and 1's
/*public class arrays1 {
    static void countZeroOne(int[] arr) {
        int count0 = 0, count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }
        }
        System.out.println("Number of 0's: " + count0);
        System.out.println("Number of 1's: " + count1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 1, 0, 0, 1 };
        countZeroOne(arr);
    }
}*/

//Find first unsorted element in an array
public class arrays1 {
    static void firstUnsortedElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("First unsorted element is: " + arr[i + 1]);
            }
        }
        System.out.println("Array is sorted");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 6, 7 };
        firstUnsortedElement(arr);
    }
}