//Example for Generic Class in Java for integer and string data type
class GenericClass<T>
{
    T data;
    void setData(T data)
    {
        this.data=data;
    }
    T getData()
    {
        return data;
    }
}
public class GenericClassExample {
    public static void main(String[] args) {
        GenericClass<Integer> intObj=new GenericClass<>();
        intObj.setData(10);
        System.out.println("Integer Data: "+intObj.getData());
        
        GenericClass<String> strObj=new GenericClass<>();
        strObj.setData("Hello");
        System.out.println("String Data: "+strObj.getData());
    }
    
}