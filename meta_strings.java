import java.util.*;

public class meta_strings {
    public static void main(String[] args) {
        int n = 0, i, j;
        String s1 = new String();
        String s2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s1:");
        s1 = sc.nextLine();
        System.out.println("Enter string s2:");
        s2 = sc.nextLine();
        char a[] = new char[s1.length()];
        char string[] = new char[s1.length()];
        if (s1.length() == s2.length()) {
            for (i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    n++;
                    a[i] = s1.charAt(i);
                } else {
                    a[i] = ' ';
                }
            }
            string = s2.toCharArray();
            if (n < 3 && n != 0) {
                for (i = 0; i < s1.length(); i++) {
                    if (a[i] != ' ') {
                        string[i] = a[i];
                    }
                }
                String s3 = new String(string);
                if (s1.equals(s3)) {
                    System.out.println("The strings are meta strings");
                } else {
                    System.out.println("The strings are not meta strings");
                    n = 3;
                }
            } else {
                System.out.println("The strings are not meta strings");
                n = 3;
            }
        } else {
            System.out.println("The strings are not meta strings");
        }
    }
}