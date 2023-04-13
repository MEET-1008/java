import java.io.*;
import java.util.*;

public class p24_RandomIntegers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[10];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(101);
        }
        
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("rand.dat"))) {
            for (int i = 0; i < nums.length; i++) {
                output.writeInt(nums[i]); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
     
        try (DataInputStream input = new DataInputStream(new FileInputStream("rand.dat"))) {
            while (input.available() > 0) {
                int num = input.readInt(); 
                System.out.print(num + " "); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
