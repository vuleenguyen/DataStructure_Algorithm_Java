package algo.binarysearch;

/**
 * Created by Do My Duyen on 9/26/2017.
 */
public class App {

    public static void main(String[] args) {
        int foundIndex = binarySearch(new int[]{3,11,21,29,41,54,61,78,110,127}, 11);
        System.out.println(foundIndex);
    }

    // make sure it sorted
    public static int binarySearch(int arr[], int x) {
        int p = 0;
        int r = arr.length - 1;
        while (p <= r) {
            int q = (p + r) / 2;
            if (arr[q] == x) return q;
            if (arr[q] > x) r = q - 1;
            else p = q + 1;
        }
        return -1;
    }
}
