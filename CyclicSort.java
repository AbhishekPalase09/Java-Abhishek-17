public class CyclicSort {

    public static void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // swap if the current element is not at the correct index
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
