import java.util.*;

public class employee_details {
    int empid;
    String empname;
    String designation;
    float salary;

    public void getEmployee() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the empid- ");
        empid = in.nextInt();
        System.out.print("Enter the name- ");
        empname = in.next();
        System.out.print("Enter the designation- ");
        designation = in.next();
        System.out.print("Enter the salary- ");
        salary = in.nextFloat();
    }

    public void showgrade() {
        if (salary >= 50000)
            System.out.println("Grade of : " + empname + " is " + "A");
        else if (salary > 30000 && salary < 50000)
            System.out.println("Grade of : " + empname + " is " + "B");
        else
            System.out.println("Grade of : " + empname + " is " + "C");
    }

    public void showemployee() {
        System.out.println("The name of the employee is " + empname);
        System.out.println("The id the employee is " + empid);
        System.out.println("The Salary of the employee is " + salary);
    }

    public static void main(String[] args) {
        employee_details e[] = new employee_details[5];
        employee_details e1 = new employee_details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            e[i] = new employee_details();
            e[i].getEmployee();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (e[i].salary < e[j].salary) {
                    e1 = e[i];
                    e[i] = e[j];
                    e[j] = e1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            e[i].showemployee();
            e[i].showgrade();
        }
    }
}