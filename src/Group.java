
public class Group {
    private int Num;
    private Student[] Students;

    public Group(int num, Student[] students) {
        Num = num;
        Students = students;
    }

    public void print() {
        System.out.println("Группа "+Num+"\nCтуденты:");

        for (Student student : Students) {
            if (student == null)
                continue;
            System.out.println(student.Name + " " + student.SName + ", Возраст: "+student.Age);
        }
        System.out.println();
    }
}
