import java.util.*;

public class RecursiveMenu {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice from 1-4");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected GCD and LCM. Please enter two numbers");
                int lcm, hcf, n1, n2;
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                hcf = hcf(n1, n2);
                System.out.println("G.C.D of " + n1 + " and " + n2 + " is " + hcf);
                lcm = (n1 * n2) / hcf;
                System.out.println("L.C.M of " + n1 + " and " + n2 + " is " + lcm);
                break;
            case 2:
                System.out.println("You have selected Power. Please enter two numbers.");
                int n3, n4, result;
                n3 = sc.nextInt();
                n4 = sc.nextInt();
                result = power(n3, n4);
                System.out.println("Result of " + n3 + " and " + n4 + " is " + result);
                break;
            case 3:
                int n5;
                System.out.println("You have selected Fibbonacci. Please enter a number.");
                n5 = sc.nextInt();
                System.out.println("Fibbonacci series is ");
                for (int i = 0; i < n5; i++) {
                    System.out.print(fib(i) + " ");
                }
                break;
            case 4:
                System.out.println("You have selected Reverse of number. Please enter the number.");
                int n6 = sc.nextInt();
                System.out.print("Reversed Number: ");
                reverse(n6);
                break;
            default:
                System.out.println("Wrong input provided.");
        }
    }

    public static int hcf(int n1, int n2) {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }

    public static int power(int n3, int n4) {
        if (n4 != 0)
            return (n3 * power(n3, n4 - 1));
        else
            return 1;
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void reverse(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10);
            reverse(num / 10);
        }
    }
}
