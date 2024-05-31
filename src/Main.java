import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final int MAX_STUDENTS = 20;

    public void main(String[] args) {

        Student[] Students1 = new Student[MAX_STUDENTS];
        Student[] Students2 = new Student[MAX_STUDENTS];
        Student[] Students3 = new Student[MAX_STUDENTS];

        Students1[0] = new Student("guy", "mann", 19);
        Students1[1] = new Student("men", "mann", 18);
        Students1[2] = new Student("tyler", "durden", 20);
        Students1[3] = new Student("egor", "levic", 21);

        Students2[0] = new Student("man", "man", 17);
        Students2[1] = new Student("hip", "hop", 19);
        Students2[2] = new Student("pupa", "popa", 18);

        Students3[0] = new Student("lupa", "popa", 20);
        Students3[1] = new Student("biba", "ivanov", 19);
        Students3[2] = new Student("boba", "ivanov", 18);

        Group g1 = new Group(1, Students1);
        Group g2 = new Group(2, Students2);
        Group g3 = new Group(3, Students3);

        g1.print();
        g2.print();
        g3.print();
    }
}