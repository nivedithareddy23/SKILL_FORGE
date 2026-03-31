interface A
{
    void show();
}
interface B
{
    default void show()
    {
        System.out.println("Hi");
    }
}
class C implements A,B
{
    public void show()
    {
        System.out.println("Hello");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
    C c=new C();
    c.show();
}
}
