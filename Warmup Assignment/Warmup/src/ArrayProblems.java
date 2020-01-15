import java.util.Arrays;

public class ArrayProblems {

	/*
	Given an array of integers nums, sort the array in ascending order.

	Example 1:
	Input: nums = [5,2,3,1]
	Output: [1,2,3,5]
	
	Example 2:
	Input: nums = [5,1,1,2,0,0]
	Output: [0,0,1,1,2,5]
	*/

    public static int[] sortArray(int[] nums) {
        //using selection sort method
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            //swap elements
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }

        //TODO: Modify this line to return correct data.
        return nums;

    }

    /*
     * Find the kth largest element in an unsorted array.
     * Note that it is the kth largest element in the sorted order, not the kth distinct element.
       Example1: Input: [3,2,1,5,6,4] and k = 2
                Output: 5
       Example2: Input: [3,2,3,1,2,4,5,5,6] and k = 4
                Output: 4
    */
    public static int findKthLargest(int[] nums, int k) {
        // sort array
        int[] sortedArray = sortArray(nums);
        //System.out.println(Arrays.toString(sortedArray));
        //get kth largest number
        int kthLargest = sortedArray[ nums.length - k];
        return kthLargest;
    }

}
