import java.util.*;

class Average extends Thread {
    int arr[];
    float sum = 0;
    int n1;
    float average;

    Average(int a[], int n, float a1) {
        arr = a;
        n1 = n;
        average = a1;
    }

    public void run() {
        for (int i = 0; i < n1; i++) {
            sum = sum + arr[i];
        }
        average = sum / n1;
        try {
            Thread.sleep(100);
            System.out.println("The Average is :" + average);
        } catch (Exception e) {
        }
    }
}

class Max extends Thread {
    int arr[];
    int max, n1;

    Max(int a[], int n, int m) {
        arr = a;
        n1 = n;
        max = m;
    }

    public void run() {
        max = arr[0];
        for (int i = 0; i < n1; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        try {
            Thread.sleep(100);
            System.out.println("The Max is :" + max);
        } catch (Exception e) {
        }
    }
}

class Min extends Thread {
    int arr[];
    int min, n1;

    Min(int a[], int n, int n2) {
        arr = a;
        n1 = n;
        min = n2;
    }

    public void run() {
        min = arr[0];
        for (int i = 0; i < n1; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        try {
            Thread.sleep(100);
            System.out.println("The min is :" + min);
        } catch (Exception e) {
        }
    }
}

class statistical_threading {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int arr[];
        float average = 0;
        int min = 0, max = 0;
        arr = new int[100];
        System.out.println("Enter Size of an array");
        n = sc.nextInt();
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Average a = new Average(arr, n, average);
        Max m = new Max(arr, n, max);
        Min mi = new Min(arr, n, min);
        Thread t = new Thread(a);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(mi);
        t.start();
        t2.start();
        t3.start();
    }
}