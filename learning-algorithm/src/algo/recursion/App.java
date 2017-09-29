package algo.recursion;

/**
 * Created by Do My Duyen on 9/26/2017.
 */
public class App {

    public static void main(String[] args) {
        int indexFound = recursiveLinearSearch(new int[]{3,5,2,1,7}, 1, 0);
        System.out.println(indexFound);
        int[] binaryArray = new int[]{3,11,21,29,41,54,61,78,110,127};
        int indexFoundBinary = recursiveBinarySearch(binaryArray, 127, 0, binaryArray.length - 1);
        System.out.println(indexFoundBinary);
    }

    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n-1);
        }

        System.out.println(n);
    }

    public static int recursiveLinearSearch(int[] arr, int x, int index) {
        if (index > arr.length - 1) return -1;
        else if (arr[index] == x) return index;

        return recursiveLinearSearch(arr, x, index + 1);
    }

    public static int recursiveBinarySearch(int[] arr, int x, int p, int r) {
        if (p > r) return -1;
        int q = (p + r) / 2;
        if (arr[q] > x) return recursiveBinarySearch(arr, x, p, q - 1);
        if (arr[q] < x) return recursiveBinarySearch(arr, x, q + 1, r);

        return q;
    }
}
