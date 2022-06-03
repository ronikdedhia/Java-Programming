import java.util.*;

class GenericArrays {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of string you want to add:");
        int n = sc.nextInt();
        System.out.println("Enter items");
        String addItem;
        for (int i = 0; i < n; i++) {
            addItem = sc.next();
            list.add(addItem);
        }
        System.out.println(list);
        String pos1 = list.get(0);
        System.out.println("Element at position 1 :" + pos1);
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}