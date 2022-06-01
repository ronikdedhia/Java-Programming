import java.util.*;

class staff {
    int code;
    String name;
}

class Teacher extends staff {
    int exp;
    String sub;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.println("Teacher's class");
        System.out.println("Enter experience, subject, code and name");
        exp = sc.nextInt();
        sub = sc.next();
        code = sc.nextInt();
        name = sc.next();
    }

    void display() {
        System.out.println("Exp no:" + exp);
        System.out.println("Subject name:" + sub);
        System.out.println("Code:" + code);
        System.out.println("Name:" + name);
    }
}

class Typist extends staff {
    int speed, exp;
}

class Officer extends staff {
    String dept, grade;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.println("Officer's class");
        System.out.println("Enter dept no , grade,code and name");
        dept = sc.next();
        grade = sc.next();
        code = sc.nextInt();
        name = sc.next();
    }

    void display() {
        System.out.println("DEpt name:" + dept);
        System.out.println("Grade:" + grade);
        System.out.println("Code:" + code);
        System.out.println("Name:" + name);
    }
}

class Regular extends Typist {
    Scanner sc = new Scanner(System.in);
    float sal;

    void read() {
        System.out.println("Regular's class");
        System.out.println("Enter code, name, speed , experience, and Salary");
        code = sc.nextInt();
        name = sc.next();
        speed = sc.nextInt();
        exp = sc.nextInt();
        sal = sc.nextFloat();
    }

    void display() {
        System.out.println("Code:" + code);
        System.out.println("Name:" + name);
        System.out.println("Speed:" + speed);
        System.out.println("Exp:" + exp);
        System.out.println("Salary:" + sal);
    }
}

class Casual extends Typist {
    Scanner sc = new Scanner(System.in);
    float daily_Wages;

    void read() {
        System.out.println("Casual's class");
        System.out.println("Enter code,name, speed , experience, and daily wages");
        code = sc.nextInt();
        name = sc.next();
        speed = sc.nextInt();
        exp = sc.nextInt();
        daily_Wages = sc.nextFloat();
    }

    void display() {
        System.out.println("Code:" + code);
        System.out.println("Name:" + name);
        System.out.println("Speed:" + speed);
        System.out.println("Exp:" + exp);
        System.out.println("Daily Wages:" + daily_Wages);
    }
}

class StaffInheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Typist T = new Typist();
        Officer o = new Officer();
        Regular r = new Regular();
        Casual c = new Casual();
        t.read();
        t.display();
        o.read();
        o.display();
        r.read();
        r.display();
        c.read();
        c.display();
    }
}
