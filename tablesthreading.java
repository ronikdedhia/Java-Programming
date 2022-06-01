import java.util.*;

class Five extends Thread {
    public void run() {
        int i;
        Long start = System.currentTimeMillis();
        for (i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + "=" + (5 * i));
            {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
        Long end = System.currentTimeMillis();
        Long elapsedTime = end - start;
        System.out.println("Time taken by 1st thread: " + elapsedTime);
    }
}

class Seven extends Thread {
    public void run() {
        int i;
        Long start = System.currentTimeMillis();
        for (i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + "=" + (7 * i));
            {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
        Long end = System.currentTimeMillis();
        Long elapsedTime = end - start;
        System.out.println("Time taken by 2nd thread: " + elapsedTime);
    }
}

class Thirteen extends Thread {
    public void run() {
        int i;
        Long start = System.currentTimeMillis();
        for (i = 1; i <= 10; i++) {
            System.out.println("13 x " + i + "=" + (13 * i));
            {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
        Long end = System.currentTimeMillis();
        Long elapsedTime = end - start;
        System.out.println("Time taken by 3rd thread: " + elapsedTime);
    }
}

class tablesthreading {
    public static void main(String[] args) {
        Five f = new Five();
        Seven s = new Seven();
        Thirteen th = new Thirteen();
        Thread t = new Thread(f);
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(th);
        t.start();
        t1.start();
        t2.start();
    }
}