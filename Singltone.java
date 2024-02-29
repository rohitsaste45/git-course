public class Singltone {
    private static Singltone instance;

    private Singltone() {

    }

    public static Singltone getInstance() {
        if (instance == null) {
            instance = new Singltone();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singltone s1 = Singltone.getInstance();
        Singltone s2 = Singltone.getInstance();

        if (s1.equals(s2)) {
            System.out.println("SingletOne Object Is crated ");
        }

    }
}
