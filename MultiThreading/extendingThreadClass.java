
class NewThread extends Thread {

    @Override
    public void run() {
        try {
            for(int i=1;i<=5;i++) {
                System.err.println("New Thread");
                Thread.sleep(1000);
            } 
        } 
        catch (InterruptedException i) {

        }
    }
    
}

public class extendingThreadClass {
    public static void main(String[] args) throws InterruptedException{
        NewThread t = new NewThread();
        t.start();

        for(int i=1;i<=5;i++) {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}