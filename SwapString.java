public class SwapString {
    public static void main(String[] args) {
        String str1 = "Rohit";
        String str2 = "Vishal";
        System.out.println("Before swapping:");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping:");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
    }
}
