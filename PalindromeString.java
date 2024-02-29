import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Name : ");
        String name = sc.nextLine();
        name = name.toLowerCase();
        String temp = name;
        String reString = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reString = reString + name.charAt(i);
        }
        if (temp.equals(reString)) {
            System.out.println(reString + " Is Palindrome String");
        } else {
            System.out.println("Is not Palindrome String");
        }
        sc.close();
    }
}
