import java.io.*;
import java.util.*;

class myexception extends Exception {
    myexception(String s) {
        super(s);
    }
}

class MarksOutOfBoundsException {
    public static void main(String argv[]) throws myexception {
        System.out.print("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 100)
            throw new myexception("Input marks greater than 100 ");
        else
            System.out.println("Marks: " + marks);
    }
}