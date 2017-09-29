package algo.selectionsort;

/**
 * Created by Do My Duyen on 9/26/2017.
 */
public class SelectionSortApp {

    public static void main(String[] args) {
        int[] arraySorted = selectionSort(new int[]{17,3 , 48,16, 58, 101});
        for(Integer element: arraySorted) {
            System.out.println(element);
        }
    }

    public static int[] selectionSort(int arr[]) {
        for(int i = 0 ; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}
