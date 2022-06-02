import java.util.*;

class SetOperations {
    public static void main(String args[]) {
        Set<Integer> a = new HashSet<Integer>();
        System.out.println("Enter number of elements yo want to insert");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            a.add(element);
        }
        System.out.println("Set A: " + a);
        Set<Integer> b = new HashSet<Integer>();
        System.out.println("Enter number of elements yo want to insert");
        int n1 = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 0; i < n1; i++) {
            int element = sc.nextInt();
            b.add(element);
        }
        System.out.println("Set B: " + b);
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set:");
        System.out.println(union);
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set:");
        System.out.println(intersection);
    }
}