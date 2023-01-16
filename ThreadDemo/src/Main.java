public class Main {
    public static void main(String[] args) {
        KronometreThread thread = new KronometreThread("thread0");
        KronometreThread thread1 = new KronometreThread("thread1");

        thread.start();
        thread1.start();
    }
}