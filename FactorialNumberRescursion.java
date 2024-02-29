public class FactorialNumberRescursion {
    public static int falseactorialNumberRescursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number * falseactorialNumberRescursion(number - 1);

    }

    public static void main(String[] args) {
        int number = 5;
        int factorialSum = falseactorialNumberRescursion(number);
        System.out.println("The FactorialSum of The Number Is : " + factorialSum);
    }
}
