public class SqureOfInt {
    public static void main(String[] args) {
        Test1 t = (a) -> {
            System.out.println("Squre is : " + (a * a));
        };
        t.squre(7);
    }
}

interface Test1 {
    void squre(int a);
}
