//Example of Comparable interface same student class contains age and name and to custom sort by age and display the name of the student
import java.util.ArrayList; 
import java.util.Collections;
class Student implements Comparable<Student>
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
    @Override
    public int compareTo(Student s)
    {
        return Integer.compare(this.age, s.age);
    }
}
public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));
        Collections.sort(students);
        System.out.println("Students sorted by age:" + students);
        
    }
}
