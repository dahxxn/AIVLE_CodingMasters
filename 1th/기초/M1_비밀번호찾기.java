import java.io.*;
import java.util.*; 

// 8:26 - 8:58 
public class M1_비밀번호찾기 {
    private static final String STOPCHAR = "c"; 
    private static final String WHITESPACE = " "; 

    public static void main(String[] args) throws IOException { 
        
        Scanner sc = new Scanner(System.in); 
        StringBuilder sb = new StringBuilder(); 
        
        for(int i = 0 ; i<20 && sc.hasNext(); i++){
            String currentChar = sc.next(); 
            if(currentChar.equals(STOPCHAR)){
                break; 
            }
            sb.append(currentChar); 
            sb.append(WHITESPACE); 
        }
        
        sb.append(STOPCHAR); 
        System.out.println(sb.toString()); 
    }
}