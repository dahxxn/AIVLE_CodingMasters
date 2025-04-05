import java.io.*;
import java.util.*; 

// 10:51 - 11:10 

public class M11_림보게임{
    private static final int MAX_HEIGHT = 160; 
    private static final String PASS = "P"; 
    private static final String FAIL = "I"; 
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        String result = PASS; 
        int limbo = 0; 
        
        for(int i = 0 ; i<N ; i++){
            limbo = scanner.nextInt(); 
            if(limbo <= MAX_HEIGHT) {
                result = FAIL+" "+limbo; 
                break; 
            }
        }
        
        System.out.println(result); 

    }
}