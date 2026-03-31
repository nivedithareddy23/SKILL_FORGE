//example for generic method for swap two elements 
public class GenericMethodEx {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        swap(intArray, 1, 3);

        System.out.println("After swap: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Before swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        swap(strArray, 0, 2);

        System.out.println("After swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}