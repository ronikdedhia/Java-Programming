import java.util.*;

public class superdigit {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its superdigit.");
        number = sc.nextInt();
        int result = superdigit(number);
        System.out.println("Superdigit of " + number + " is " + result);
    }

    public static int superdigit(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + superdigit(n / 10));
    }
}