package algo.linearsearch;

/**
 * Created by Do My Duyen on 9/26/2017.
 */
public class LinearSearch {

    public static void main(String[] args) {

    }

    public static int linearSearch(int[] arr, int x) {
        for(int i = 0; i < arr.length ; i++) {
            if (arr[i] == x) return i;
        }

        return -1;
    }

}
