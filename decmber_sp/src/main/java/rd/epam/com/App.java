package rd.epam.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        Student student = new Student("Андрей", "Юрьевич");
        student.setGroup(Group.FIRST);
        student.setSecondName("Иванов");

        Student student2 = new Student("Анастасия", "Александровна");
        student2.setGroup(Group.FIRST);
        student2.setSecondName("Кострова");

        students.add(student);
        students.add(student2);
        students.forEach(System.out::println);
    }
}
