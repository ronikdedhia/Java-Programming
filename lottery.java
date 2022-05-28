import java.util.*;

class student {
    String name;
    int id;
}

class lottery {
    student s[] = new student[10];
    private int counter = 0;

    void addStudents(String name, int id) {
        s[counter] = new student();
        s[counter].name = name;
        s[counter].id = id;
        counter++;
    }

    student pickWinner() {
        Random rand = new Random();
        int min = 0;
        int max = 3;
        int randNum = rand.nextInt((max - min) + 1) + min;
        return s[randNum];
    }

    public static void main(String args[]) {
        lottery st = new lottery();
        st.addStudents("Ronik", 1);
        st.addStudents("Vivek", 2);
        st.addStudents("Akshit", 3);
        st.addStudents("Bhavya", 4);
        student s1 = st.pickWinner();
        System.out.println("The winner is -> " + s1.id + " : " + s1.name);
    }
}