import java.io.*;
import java.util.*;

class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter the number of elements you want to insert");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number of elements");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }
        System.out.println("Current Stack: " + stack);
        System.out.println("Enter number of elements you want to pop");
        int e = sc.nextInt();
        System.out.println("Pop Operation:");
        for (int i = 0; i < e; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
        System.out.println("Current Stack: " + stack);
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
        System.out.println("Enter number of elements you want to search");
        int searchElement = sc.nextInt();
        Integer pos = (Integer) stack.search(searchElement);
        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
}