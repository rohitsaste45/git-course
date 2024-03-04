public class ThreadClass {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Print Parent Thread.");
        }
    }
}

class Test extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Print child Thread.");
        }
    }
}
