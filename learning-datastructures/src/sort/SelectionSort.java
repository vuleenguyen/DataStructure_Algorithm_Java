package sort;

/**
 * Created by Do My Duyen on 9/28/2017.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9,4,17,3,8,1,0,0,25,17,18};
        selectionSort(arr);

        System.out.print("{");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print(" }");
    }

    public static void selectionSort(int[] A) {
        for(int i = 0; i < A.length - 1 ; i++) {
            int min = i;
            for(int j = i + 1; j < A.length ; j++) {
                if (A[j] < A[min]) min = j;
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
    }
}
