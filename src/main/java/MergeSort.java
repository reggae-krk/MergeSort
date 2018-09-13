public class MergeSort {

    private static int[] tempArray;

    public static void sort(int[] array) {
        tempArray = new int[array.length];
        mergeSort(array,0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {

        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
}
