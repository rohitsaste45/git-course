import java.util.Arrays;

public class BinearySearch {
    public static int binearySearch(int arr[], int left, int right, int key) {

        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 55, 66, 99, 88, 77, 44, 33, 110 };
        Arrays.sort(arr);
        int index = binearySearch(arr, 0, arr.length - 1, 77);
        if (index != -1) {
            System.out.println("Key Found At Index : " + index);
        } else {
            System.out.println("Key Is Not Found " + index);
        }

    }
}
