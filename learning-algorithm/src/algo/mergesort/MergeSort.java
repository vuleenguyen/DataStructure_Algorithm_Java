package algo.mergesort;

/**
 * Created by Do My Duyen on 9/27/2017.
 */
public class MergeSort {

    public void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public void sort(int[] inputArray, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        sort(inputArray, start, mid);
        sort(inputArray, mid+1, end);
        sort(inputArray, start, mid, end);
    }

    public void sort(int[] inputArray, int start, int mid, int end) {
        int[] leftShot = new int[mid - start + 2];
        int[] rightShot = new int[end - mid + 1];
        for(int i = 0; i < leftShot.length - 1; i++) {
            leftShot[i] = inputArray[start + i];
        }

        for(int j = 0; j < rightShot.length - 1; j++) {
            rightShot[j] = inputArray[mid+1+j];
        }

        leftShot[leftShot.length - 1] = Integer.MAX_VALUE;
        rightShot[rightShot.length - 1] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        int k = start;
        while (i < leftShot.length || j < rightShot.length) {
            if (leftShot[i] == Integer.MAX_VALUE && rightShot[j] == Integer.MAX_VALUE) {
                break;
            }
            if (leftShot[i] > rightShot[j]) {
                inputArray[k] = rightShot[j];
                j++;
            } else {
                inputArray[k] = leftShot[i];
                i++;
            }
            k++;
        }
    }


}
