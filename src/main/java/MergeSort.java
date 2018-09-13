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

    private static void merge(int[] array, int left, int middle, int right) {

        for (int i = left; i <= right; i++) {
            tempArray[i] = array[i];
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
