import java.util.*;

abstract class Shape1 {
    abstract void draw();
}

class Rectangle extends Shape1 {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape1 {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class WildCard {
    public static void drawShape(List<? extends Shape1> lists) {
        for (Shape1 s : lists) {
            s.draw();
        }
    }

    public static void main(String args[]) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        WildCard.drawShape(list1);
        WildCard.drawShape(list2);
    }
}