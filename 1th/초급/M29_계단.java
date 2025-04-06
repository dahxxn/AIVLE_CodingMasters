
import java.io.*;
import java.util.*;
//3:09-3:14

public class M29_계단 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        int K = scanner.nextInt();
        
        int far = K-N; 
        
        int result = far % 3; 
        int count = far / 3; 
        if(result > 0){
            count ++; 
            count += (3 - result);  
        }
        
        System.out.println(count); 

    }
}

