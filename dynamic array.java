class Array {
 private int arr[];
 private int count;
 public Array(int length) {arr = new int[length];}
 public void printArray()
 {
 for (int i=0; i < count; i++) {
 System.out.print(arr[i] + " ");}
 }
 public void insert(int element)
 {
 if (arr.length == count) {
 int newArr[] = new int[2 * count];
 for (int i=0; i < count; i++) {
 newArr[i] = arr[i];}
 arr = newArr;}

 arr[count++] = element;}
}


public class Dynamicarray{
 public static void main(String[] args)
 {
 Array numbers = new Array(3);
 do {
 System.out.print(
 "Menu:\n1. Add Element.\n2. Display all Elements.\n3. Exit Program.\nEnter option: ");
 choice = sc.nextInt();
 switch(choice) {
 case 1: {
 System.out.print("Enter element to be added to array: ");
 elem = sc.nextInt();
 numbers.insert(elem);
 break;}
 case 2: {
 numbers.printarray();
 break;}

 case 3: {
 System.out.println("Program Aborted.");
 System.exit(1);}
 default: {
 System.out.println("Please Enter Correct Choice!\n");}
 }
 } while (true);}
