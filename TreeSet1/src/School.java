import java.util.TreeSet;

/**
 * **********************************************************************
 * Develop a program to create a custom Comparator to store Student     *
 * objects and sort them in descending order course & sNo wise.         *
 * *
 * ***********************************************************************
 */

public class School {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(101, "Ramesh", "CJ", 5000, 5.7));
        students.add(new Student(102, "Awiral", "AJ", 2500, 5.4));

    }
}
