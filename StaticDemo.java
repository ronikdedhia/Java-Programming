class StaticDemo {
    String name;
    int rollNo;
    static int n = 0;
    static String cllgName;
    static int counter = 0;

    public StaticDemo(String name) {
        n = n + 1;
        this.name = name;
        this.rollNo = setRollNo();
    }

    static int setRollNo() {
        counter++;
        return counter;
    }

    static void setCllg(String name) {
        cllgName = name;
    }

    void getStudentInfo() {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
        System.out.println("cllgName : " + cllgName);
    }

public static void main(String[] args)
{
StaticDemo.setCllg("XYZ");
StaticDemo s1 = new StaticDemo("Alice");
StaticDemo s2 = new StaticDemo("Bob");
StaticDemo s3 = new StaticDemo("Charlie");
s1.getStudentInfo();
s2.getStudentInfo();
s3.getStudentInfo();
System.out.println("No of objects created are-"+n);
}
}
