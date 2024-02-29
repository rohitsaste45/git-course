

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 20 };
        int key = 77;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key fount At Index : " + i);
            }
        }
    }
}