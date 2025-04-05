import java.io.*;
import java.util.*; 

// 9 : 11 -  9:18

public class M3_8진수와16진수 {
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        String result = Integer.toString(N, 8) + " " + Integer.toString(N, 16); 
        
        System.out.println(result.toUpperCase()); 

    }
}