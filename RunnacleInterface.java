public class RunnacleInterface {

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        Thread th = new Thread(t2);
        th.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Print Parent Thread.");
        }
    }
}

class Test2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Print child Thread.");
        }
    }
}
