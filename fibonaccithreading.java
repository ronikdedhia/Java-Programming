import java.util.*;

class Fibonacci extends Thread {
    public int[] array;
    int n;

    public Fibonacci(int n, int[] arr) {
        this.array = arr;
        this.n = n;
    }

    public void run() {
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
    }
}

public class fibonaccithreading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n, number of fibonacci numbers to be generated:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        Fibonacci object = new Fibonacci(n, arr);
        Thread t = new Thread(object);
        t.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(String.valueOf(arr[i]) + ' ');
        }
    }
}