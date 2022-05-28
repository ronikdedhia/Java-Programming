import java.util.*;

class StudentMarks {
    String name;
    int id;
    int m1;
    int m2;
    int m3;
    int m4;
    public void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name :: ");
        name = sc.nextLine();
        System.out.print("Enter the id :: ");
        id = sc.nextInt();
        System.out.print("Enter the Marks of physics :: ");
        m1 = sc.nextInt();
        System.out.print("Enter the Marks of Maths :: ");
        m2 = sc.nextInt();
        System.out.print("Enter the Marks of Chemistry :: ");
        m3 = sc.nextInt();
    }
    void calculateTotalMarks() {
        m4 = m1 + m2;
    }
    public void outputs() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Maths: " + m1);
        System.out.println("Physics: " + m2);
        System.out.println("Chemistry: " + m3);
        System.out.println("Total Marks: " + m4);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StudentMarks e[] = new StudentMarks[5];
        StudentMarks e1 = new StudentMarks();
        System.out.println("Enter number of Students");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            e[i] = new StudentMarks();
            e[i].getinput();
        }
        for (int i = 0; i < n; i++) {
            e[i].calculateTotalMarks();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (e[i].m4 < e[j].m4) {
                    e1 = e[i];
                    e[i] = e[j];
                    e[j] = e1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            e[i].outputs();
        }
    }
}