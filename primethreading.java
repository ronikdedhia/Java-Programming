import java.util.*;

class prime extends Thread {
    int n;

    prime(int p1) {
        n = p1;
    }

    public void run() {
        int i, p;
        System.out.println("Prime numbers:");
        int c, j;
        for (i = 2; i <= n; i++) {
            c = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    c++;
            }
            if (c == 2)
                System.out.print(i + " ");
        }
    }
}

class primethreading {
    public static void main(String args[]) {
        String st = args[0];
        int n = Integer.parseInt(st);
        prime p = new prime(n);
        Thread t = new Thread(p);
        t.start();
    }
}
