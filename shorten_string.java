import java.util.*;

class shorten_string {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        System.out.print("Enter a lowercase String s1: ");
        s1 = sc.nextLine();
        String s2 = new String();
        char a[] = new char[s1.length()];
        for (j = 0; j < 2; j++) {
            a = s1.toCharArray();
            for (i = 0; i < s1.length() - 1; i++) {
                if (a[i] == a[i + 1]) {
                    a[i] = ' ';
                    a[i + 1] = ' ';
                }
            }
            s2 = "";
            for (i = 0; i < s1.length(); i++) {
                if (a[i] != ' ')
                    s2 = s2 + a[i];
            }
            s1 = s2;
        }
        if (s2 == "")
            System.out.println("Empty String");
        else
            System.out.println("Final String is: " + s2);
    }
}
