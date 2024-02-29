import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
            System.out.println(i + " St Itreation : " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 98, 6, 8, 5, 61, 6, 6, 62 };
        System.out.println("Array Before Sorting : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array After Sorting : " + Arrays.toString(arr));
    }
}
