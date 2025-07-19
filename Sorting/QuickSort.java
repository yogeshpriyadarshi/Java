
public class QuickSort {

    public static int sort(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = sort(arr, low, high);

            quick(arr, low, pivot-1);

            quick(arr, pivot+1, high);
        }
    }

    public static void main() {
        int[] arr = {2, 2, 9, 3, 12, 6, 4, 14, 1};
        int n = arr.length;
        quick(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
