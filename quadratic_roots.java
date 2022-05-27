import java.util.*;
public class quadratic_roots {
    public static void main(String args[]) {
        float a, b, c, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficients of Quadratic equation:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if (b * b < 4 * a * c) {
            x1 = -b / (2 * a);
            x2 = (float) Math.sqrt(4 * a * c - b * b) / (2 * a);
            System.out.println("Roots are imaginary and they are: " + x1 + " +j(" + x2 + ") and " + x1 + " -j(" + x2 + ")");
        } else {
            x1 = (-b - (float) Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b + (float) Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("Roots are real and they are: " + x1 + " and " + x2);
        }
    }
}