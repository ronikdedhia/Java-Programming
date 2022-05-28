import java.util.*;

class student_marks {
    public static void main(String[] args) {
        int i, j, m, n;
        int row_sum = 0;
        int column_sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of Students: ");
        m = sc.nextInt();
        System.out.print("Enter the total no of subjects: ");
        n = sc.nextInt();
        System.out.println();
        int a[][] = new int[m + 1][n + 1];
        for (i = 0; i < m; i++) {
            row_sum = 0;
            System.out.println("Enter the Marks of Student " + (i + 1));
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                row_sum = row_sum + a[i][j];
            }
            a[i][j] = row_sum;
        }
        System.out.println("Entered data:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < m + 1; i++) {
            column_sum = 0;
            for (j = 0; j < n; j++) {
                column_sum = column_sum + a[j][i];
            }
            a[j][i] = column_sum;
        }
        System.out.print("\t\t");
        for (i = 0; i < m + 1; i++) {
            if (i != m) {
                System.out.print("Subject " + (i + 1) + "\t");
            } else {
                System.out.print("Grand Total");
            }
        }
        System.out.println();
        for (i = 0; i < m + 1; i++) {
            if (i != m) {
                System.out.print("Student " + (i + 1) + " ");
            } else {
                System.out.print("Total : ");
            }
            for (j = 0; j < n + 1; j++) {
                System.out.print("\t" + a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}