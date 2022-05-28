import java.util.*;

public class compute_statistics {
    public static void main(String[] args) {
        int i, n;
        float sum = 0, mean, sum1 = 0, stdev, variance;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The Elements in the array are: ");
        for (i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        for (i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        mean = sum / 5.0f;
        System.out.println("The Mean is: " + mean);
        for (i = 0; i < a.length; i++) {
            sum1 = sum1 + ((a[i] - mean) * (a[i] - mean));
        }
        stdev = (float) Math.sqrt(sum1 / 5.0);
        variance = stdev * stdev;
        System.out.println("The Standard Deviation is: " + stdev);
        System.out.println("The Variance is: " + variance);
    }
}
