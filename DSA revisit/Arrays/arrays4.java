//Two Sum
/*public class arrays4 {
    static void twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("the two nums are : " + arr[i] + " and " + arr[j]);
                } 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 4, 6 };
        int target = 10;
        twoSum(arr, target);
    }
}*/

//3 sum
/*public class arrays4 {
    static void threeSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("the three nums are : " + arr[i] + " , " + arr[j] + " and " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 4, 6 };
        int target = 10;
        threeSum(arr, target);
    }
}*/

//Remove duplicates from sorted array
/*public class arrays4 {
    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5 };
        int length = removeDuplicates(arr);
        System.out.println("Length of array after removing duplicates: " + length);
    }
}*/

//Find first repeating element
/*public class arrays4 {
    static int firstRepeatingElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        int result = firstRepeatingElement(arr);
        if (result != -1) {
            System.out.println("First repeating element is: " + result);
        } else {
            System.out.println("No repeating elements found.");
        }
    }
}*/

//find pivot index
public class arrays4 {
    static int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = nums[0];
        rightSum[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i] + leftSum[i - 1];
        }
        for (int j = nums.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j + 1] + nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int output = pivotIndex(nums);
        System.out.println(output);
    }
}
