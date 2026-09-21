//Bubble sort
/*public class lec35 {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3, 5, 9, 6, 7, 8 };
        bubbleSort(arr);
    }
}*/

//Selection sort 
/*public class lec35 {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3, 5, 9, 6, 7, 8 };
        selectionSort(arr);
    }
}*/

//Insertion sort
public class lec35 {
    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int currentVal = i;
            int prevVal = i - 1;
            int key = arr[currentVal];
            while (prevVal >= 0 && key < arr[prevVal]) {
                arr[prevVal + 1] = arr[prevVal];
                prevVal--;
            }
            arr[prevVal + 1] = key;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3, 5, 9, 6, 7, 8 };
        insertionSort(arr);
    }
}
