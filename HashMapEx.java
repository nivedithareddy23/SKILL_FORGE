//Example for HashMap and methods of HashMap
import java.util.HashMap;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.putIfAbsent(1,"Grapes");
        map.put(null,"NullKey");
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Size of HashMap: " + map.size());
        System.out.println("Contains key 2: " + map.containsKey(2));
        System.out.println("Contains value 'Orange': " + map.containsValue("Orange"));
        map.remove(2);
        System.out.println("HashMap after removing key 2: " + map);
        //keyset
        System.out.println("Keys in the HashMap: " + map.keySet());
        //values
        System.out.println("Values in the HashMap: " + map.values());
        map.replace(null,"NullKey","NullValue");
        System.out.println("HashMap after replacing null key value: " + map);
        for(Integer key:map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        //EntrySet
        for(HashMap.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}