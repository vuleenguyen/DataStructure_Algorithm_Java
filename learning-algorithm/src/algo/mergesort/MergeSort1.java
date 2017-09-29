package algo.mergesort;

/**
 * Created by Do My Duyen on 9/27/2017.
 */
public class MergeSort1 {

    private static int tempArrays[];

    public void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public void sort(int[] inputArray, int start, int end) {
        if (start >= end) {
            return;
        }
        tempArrays = new int[inputArray.length];
        int mid = (start + end) / 2;
        sort(inputArray, start, mid);
        sort(inputArray, mid+1, end);
//        sort(inputArray, start, mid, end);

        mergeInPlace(inputArray, start, mid, end);
    }

//    public void sort(int[] inputArray, int start, int mid, int end) {
//        int tempArray[] = new int[end - start + 1];
//
//        int leftSlot = start;
//        int rightSlot = mid + 1;
//        int k = 0;
//
//        while (leftSlot <= mid && rightSlot <= end) {
//            if (inputArray[leftSlot] < inputArray[rightSlot]) {
//                tempArray[k] = inputArray[leftSlot];
//                leftSlot++;
//            } else {
//                tempArray[k] = inputArray[rightSlot];
//                rightSlot++;
//            }
//            k++;
//        }
//
//        if (leftSlot <= mid) { //consider the right side done being sorted
//            while (leftSlot <= mid) {
//                tempArray[k] = inputArray[leftSlot];
//                leftSlot++;
//                k++;
//            }
//        } else if (rightSlot <= end){
//            while (rightSlot <= end) {
//                tempArray[k] = inputArray[rightSlot];
//                rightSlot++;
//                k++;
//            }
//        }
//
//        // copy from temporary to main array
//        int i = start;
//        k = 0;
//        while (i <= end) {
//            inputArray[i] = tempArray[k];
//            i++;
//            k++;
//        }
//
//    }


//    Hopefully you were able to complete the above merge() method
//    Below is a more challenging implementation
//    It's called an in-place merge
//    This is usually pretty difficult for even average programmers to
//    wrap their head around. If you put in the effort to try and understand
//    the below code, you will certainly get it
//    Here is an incentive for you to put in the time
//    If you can email me a detailed easy to read explanation
//    in your own words about how the below code works, I'll provide a 75% discount for all my current
//    and future courses on my online school! my email address is imtiaz@eliminatecodefear.com



    public static void mergeInPlace(int inputArray[], int start, int mid, int end) {
        int i = start;
        int j = mid + 1;

        for(int k = 0; k <= end; k++) {
            tempArrays[k] = inputArray[k];
        }

        for(int k = start; k <= end; k++) {
            if ( i > mid) {
                inputArray[k] = tempArrays[j];
                j = j + 1;
            } else if (j > end) {
                inputArray[k] = tempArrays[i];
                i = i + 1;
            } else if (tempArrays[j] < tempArrays[i]) {
                inputArray[k] = tempArrays[j];
                j = j + 1;
            } else {
                inputArray[k] = tempArrays[i];
                i = i + 1;
            }
        }
    }
}
