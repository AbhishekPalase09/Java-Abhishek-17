import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] arr) {
        // Find maximum number to know number of digits
        int max = Arrays.stream(arr).max().getAsInt();

        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // sorted array
        int[] count = new int[10]; // digits 0-9

        // Count occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Change count[i] so that it contains actual position
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (iterate backwards for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output to arr
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
