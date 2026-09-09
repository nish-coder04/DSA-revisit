//Reverse an array
/*public class arrays2 {
    static void reverseArray(int[] arr) {
        int s = 0 , e = arr.length-1;
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;    
        }
    }
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//Shift array elements by 1 position
/*public class arrays2 {
    static void shiftby1(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        shiftby1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

//Print Extreme Elements in an alternate manner
/*public class arrays2 {
    static void printExtreme(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            if (s == e) {
                System.out.print(arr[s] + " ");
            } else {
                System.out.print(arr[s] + " " + arr[e] + " ");
            }
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        printExtreme(arr);
    }
}*/

//Identify elements with Highest and Lowest Frequency
import java.util.HashMap;

public class arrays2 {
    static void getFrequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE, maxFreqKey = 0;
        int minFreq = Integer.MAX_VALUE, minFreqKey = 0;
        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxFreqKey = key;
            }
            if (currentFreq < minFreq) {
                minFreq = currentFreq;
                minFreqKey = key;
            }
        }
        System.out.println("Highest Frequency: " + maxFreqKey + " -> " + maxFreq);
        System.out.println("Lowest Frequency: " + minFreqKey + " -> " + minFreq);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
        getFrequency(arr);
    }
}


// find th mode of an array
/*import java.util.HashMap;

public class arrays2 {
    static void findMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int count = freq.get(key);
            if (count > maxFreq) {
                maxFreq = count;
                maxFreqKey = key;
            }
        }
        System.out.println("Maximum frequency: " + maxFreq);
        System.out.println("Maximum frequency key: " + maxFreqKey);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 1 };
        findMode(arr);
    }
}*/