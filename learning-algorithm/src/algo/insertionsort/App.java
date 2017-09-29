package algo.insertionsort;

/**
 * Created by Do My Duyen on 9/26/2017.
 */
public class App {

    public static void main(String[] args) {
        int[] arraySorted = insertionSort(new int[]{17,3 , 48,16, 58, 101});
        for(Integer element: arraySorted) {
            System.out.println(element);
        }
    }

    public static int[] insertionSort(int[] arr) {
       for(int i = 1 ; i < arr.length ; i++) {
           int j = i - 1;
           int element = arr[i];
           while (j >= 0 && arr[j] > element) {
                arr[j+1] = arr[j];
                j--;
           }
           arr[j+1] = element;
       }
       return arr;
    }
}
