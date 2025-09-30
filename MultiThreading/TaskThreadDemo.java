class PrintChar implements Runnable {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}

class PrintLetterR implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print("R ");
        }
    }
}

class PrintLargeNum implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}

public class TaskThreadDemo {
    public static void main(String[] args) {
        // Create Runnable objects
        PrintChar printA = new PrintChar();
        PrintLetterR printR = new PrintLetterR();
        PrintLargeNum printLarge = new PrintLargeNum();
        
        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printR);
        Thread thread3 = new Thread(printLarge);
        
        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}