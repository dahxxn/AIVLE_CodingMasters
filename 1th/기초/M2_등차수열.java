import java.io.*;
import java.util.*; 

// 9:03 - 9:10

public class M2_등차수열 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int A = scanner.nextInt(); 
        int B = scanner.nextInt(); 
        int N = scanner.nextInt(); 
        
        int result = A + (N -1) * B; 

        System.out.println(result); 

    }
}