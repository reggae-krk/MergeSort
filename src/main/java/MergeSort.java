public class MergeSort {

    private static int[] tempArray;

    public static void sort(int[] array) {
        tempArray = new int[array.length];
        mergeSort(array,0, array.length - 1);
    }
}
