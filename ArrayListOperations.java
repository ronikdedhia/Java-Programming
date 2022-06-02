import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] a) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("JAVA");
        al.add("C++");
        al.add("PERL");
        al.add("PHP");
        System.out.println(al);
        System.out.println("Element at index 1: " + al.get(1));
        System.out.println("Does list contains JAVA? " + al.contains("JAVA"));
        al.add(2, "PLAY");
        System.out.println(al);
        System.out.println("Is arraylist empty? " + al.isEmpty());
        System.out.println("Index of PERL is " + al.indexOf("PERL"));
        System.out.println("Size of the arraylist is: " + al.size());
    }
}
