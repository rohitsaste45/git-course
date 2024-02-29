import java.util.Arrays;

public class CheckArraysEquals {
    public static void main(String[] args) {
        int arr1[] = { 10, 20, 3, 0, 5, 6, 4, 8, 9 };
        int arr2[] = { 10, 6, 9, 8, 3, 69, 3, 2 };
        boolean status = Arrays.equals(arr1, arr2);
        if (status != false) {
            System.out.println(" Array Are Equal ");
        } else {
            System.out.println(" Array Are Not Equal ");

        }
    }
}
