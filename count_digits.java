import java.util.*;
class count_digits {
    public static void main(String[] args) {
        int a, n, count = 0;
        n = Integer.parseInt(args[0]);
        a = n;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(a + " has " + count + " digits");
    }
}