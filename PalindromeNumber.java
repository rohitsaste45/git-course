import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter The Number : ");
        int number = sc.nextInt();
        int temp = number;
        int reminder = 0;
        while (number != 0) {
            reminder = reminder * 10 + number % 10;
            number = number / 10;
        }
        if (reminder == temp) {
            System.out.println(temp + " is Palindrome Number");
        } else {
            System.out.println("This Not Palindrome Number.");
        }
        sc.close();
    }
}
