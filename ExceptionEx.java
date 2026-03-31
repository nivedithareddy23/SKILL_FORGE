import java.io.*;
public class ExceptionEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            int data = fis.read();
            System.out.println("Data: " + data);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
}         