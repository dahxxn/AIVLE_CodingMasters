import java.io.*;
import java.util.*; 

//10:11 - 10:17

public class M9_삼각형의조건 {
    private static final char PASS = 'P';
    private static final char FAIL = 'F'; 
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 
        
        int angleSum = 0; 
        char result = FAIL; 
        
        for(int i = 0 ; i<3 ; i++){
            int angle = scanner.nextInt(); 
            if(angle < 0) break; 
            
            angleSum += angle; 
            if(angleSum > 180) break; 
        }
        
        if(angleSum == 180) result = PASS; 

        System.out.println(result); 

    }
}