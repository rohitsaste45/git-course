public class FactorialNumber {
    public static void main(String[] args) {
        int number = 5;
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        System.out.println("The Factorial Value Of Number is : " + sum);
    }
}
