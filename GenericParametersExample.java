//Exalmple of Generic Parameters in Java with pair of integer and string data type
class Pair<K,V>
{
    K key;
    V value;
    Pair( K key, V value)
    {
        this.key=key;
        this.value=value;
    }
}
public class GenericParametersExample {
    public static void main(String[] args) {
        Pair<Integer,String> pair1=new Pair<>(1,"One");
        System.out.println("Key: "+pair1.key.getClass().getName()+", Value: "+pair1.value.getClass().getName());
        Pair<String,Double> pair2=new Pair<>("Pi",3.14);
        System.out.println("Key: "+pair2.key.getClass().getName()+", Value: "+pair2.value.getClass().getName());
    }
    
}