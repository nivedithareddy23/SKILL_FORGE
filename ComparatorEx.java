//Example of Comparator interface on Student contains age and name and to custom sort by age and display the name of the student
import java.util.ArrayList;
import java.util.Collections;   
import java.util.Comparator;
class Student
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString()
    {
        return name+" "+age;
    }
}
public class ComparatorEx {
    public static void main(String[] args) {
        Comparator<Student> AgeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        };
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));
        Collections.sort(students, AgeComparator);
        System.out.println("Students sorted by age:" + students);

    }
}