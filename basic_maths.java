import java.util.*;
public class basic_maths {
    public static void main(String[] args) {
        float a, b;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.println("1.Addition, 2.Subtracton, 3.Multiplication, 4.Division");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition:" + (a + b));
                break;
            case 2:
                System.out.println("Difference:" + (a - b));
                break;
            case 3:
                System.out.println("Multi:" + (a * b));
                break;
            case 4:
                System.out.println("Division:" + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
