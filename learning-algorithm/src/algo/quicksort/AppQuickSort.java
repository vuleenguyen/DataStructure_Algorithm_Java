package algo.quicksort;

import java.util.Arrays;

/**
 * Created by Do My Duyen on 9/27/2017.
 */
public class AppQuickSort {

    public static void main(String[] args) {
        int[] inputArray = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
        quickSort(inputArray, 0, inputArray.length - 1);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void quickSort(int[] inputArray, int start, int end) {
        if (start < end) {
            int pivot = partition(inputArray, start, end);
            quickSort(inputArray, start,pivot - 1);
            quickSort(inputArray, pivot + 1, end);
        }
    }

    public static int partition(int[] inputArray, int start, int end) {
        int x = inputArray[end];
        // in the first interation, i start from  -1
        int i = start - 1;
        for(int j = start; j < inputArray.length; j++) {
            if (inputArray[j] < x) {
                i++;
                // we are swapping below
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        // put the pivot value in the correct slot next
        inputArray[end] = inputArray[i+1];
        inputArray[i+1] = x; // here, pivot value is placed in the correct slot
        return i + 1;
    }
}
