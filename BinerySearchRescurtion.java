import java.util.Arrays;

public class BinerySearchRescurtion {
    public static int binerySearchRescurtion(int arr[], int left, int right, int key) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == arr[mid]) {
                return mid;

            } else if (key > arr[mid]) {
                return binerySearchRescurtion(arr, mid + 1, right, key);
            } else {
                return binerySearchRescurtion(arr, left, mid - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 55, 66, 99, 88, 77, 44, 33, 110 };
        Arrays.sort(arr);
        int index = binerySearchRescurtion(arr, 0, arr.length - 1, 77);
        if (index != -1) {
            System.out.println("Key Found At Index : " + index);
        } else {
            System.out.println("Key Is Not Found " + index);
        }

    }
}
