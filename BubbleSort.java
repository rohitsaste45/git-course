import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(i + " St Itreation : " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 98, 6, 8, 5, 61, 6, 6, 62 };
        System.out.println("Array Before Sorting : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array After Sorting : " + Arrays.toString(arr));
    }
}
