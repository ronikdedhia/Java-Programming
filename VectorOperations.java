import java.util.*;

class VectorOperations {
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> v = new Vector<Integer>(n);
        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }
        System.out.println(v);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemets to add in vector ");
        int num = sc.nextInt();
        v.add(num);
        System.out.println(v);
        System.out.println("Enter the index number you want you delete");
        int del = sc.nextInt();
        v.remove(del);
        System.out.println("After removing element from vector:\n" + v);
        System.out.println("Enter Index and element to update");
        int index = sc.nextInt();
        int num2 = sc.nextInt();
        v.set(index, num2);
        System.out.println("\n Updated vector list:" + v);
    }
}