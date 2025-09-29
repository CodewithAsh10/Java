class NewThread implements Runnable {
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("New Thread");
        }
    }
}

public class implementingRunnableInterface {
    public static void main(String[] args) {
        NewThread r = new NewThread();
        Thread t = new Thread(r);
        t.start();

        for (int i=0; i<5; i++) {
            System.out.println("Main Thread");
        }
    }
}
