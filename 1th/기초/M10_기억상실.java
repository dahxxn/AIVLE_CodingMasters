import java.io.*;
import java.util.*; 

// 10:21 - 10:27

public class M10_기억상실 {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 

        int A = scanner.nextInt(); 
        int B = scanner.nextInt(); 
        int N = scanner.nextInt(); 
        
        int day = 1; 
        N -= A; 
        
        while(N > 0){
            N += B; 
            N -= A;  
            day++; 
        }

        System.out.println(day); 
    }
}