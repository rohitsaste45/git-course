public class FunctionalInterface {
    public static void main(String[] args) {
        Test3 t = (a, b) -> {
            System.out.println("Sum :" + (a + b));
        };
        t.test(10, 20);
    }
}

// @FunctionalInterface
interface Test3 {
    void test(int a, int b);

}
