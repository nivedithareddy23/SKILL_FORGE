//Example for printing the no.of times the elements are repeated in an array using map
import java.util.HashMap;
public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0,1,2,3,4,5,1,0,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println("Element counts: " + map);
    }
}