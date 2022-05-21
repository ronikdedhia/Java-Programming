class MyPattern {

  public void display() {
    for (int i = 0; i < 10; i++) {
      System.out.print("*");
    }
  }

  public void display(char symbol) {
    for (int i = 0; i < 10; i++) {
      System.out.print(symbol);
    }
  }
}

class Pattern {
  public static void main(String[] args) {
    MyPattern d1 = new MyPattern();

    d1.display();
    System.out.println("\n");

    d1.display('#');
  }
}