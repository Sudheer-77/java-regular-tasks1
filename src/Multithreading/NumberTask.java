
package Multithreading;

public class NumberTask implements Runnable {

    @Override
    public void run() {

        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        NumberTask task = new NumberTask();

        Thread t = new Thread(task);

        t.start();
    }
}