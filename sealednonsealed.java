sealed class Collage permits Faculty,Student{
    void examMarks()
    {
        System.out.println("Editing Mid Marks");
    }
}
sealed class Faculty extends Collage permits EditMarks
{
    void examMarks()
    {
        super.examMarks();
        System.out.println("Faculty");
    }
}
non-sealed class Student extends Collage
{
     void examMarks()
    {
        System.out.println("Students");
    }
}
non-sealed class EditMarks extends Faculty
{
void examMarks()
    {
        super.examMarks();
        System.out.println("Faculty Editing Marks");
    }
}
public class sealednonsealed {

    public static void main(String[] args)
    {
        Collage col=new EditMarks();
        col.examMarks();
        Collage col1=new Student();
        col1.examMarks();
    }
}