//Examle of TreeMap in Java
import java.util.TreeMap;
public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Orange");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        System.out.println("TreeMap: " + treeMap);
        System.out.println("Value for key 1: " + treeMap.get(1));
        System.out.println("Size of TreeMap: " + treeMap.size());
        System.out.println("Contains key 2: " + treeMap.containsKey(2));
        System.out.println("Contains value 'Orange': " + treeMap.containsValue("Orange"));
        treeMap.remove(2);
        System.out.println("TreeMap after removing key 2: " + treeMap);
        //keyset
        System.out.println("Keys in the TreeMap: " + treeMap.keySet());
        //values
        System.out.println("Values in the TreeMap: " + treeMap.values());
        for(Integer key:treeMap.keySet()){
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
        //first and last entry
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());
        //firstkey and lastkey
        System.out.println("First Key: " + treeMap.firstKey()); 
        System.out.println("Last Key: " + treeMap.lastKey());
        //higer and lower key
        System.out.println("Higher Key than 1: " + treeMap.higherKey(1));
        System.out.println("Lower Key than 3: " + treeMap.lowerKey(3)); 
        //submap
        System.out.println("SubMap from key 1 to 2: " + treeMap.subMap(1, 2));  
    
    }
}
