// This is a simple example of a generic interface in Java.
interface GenericInterface<T> {
    void display(T data);
}   
class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void display(String data) {
        System.out.println("Data: " + data);
    }
}
public class GenericInterfaceExample {
    public static void main(String[] args) {
        GenericInterfaceImpl impl = new GenericInterfaceImpl();
        impl.display("Hello World");
    }
}
