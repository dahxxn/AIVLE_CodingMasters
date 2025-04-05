import java.io.*;
import java.util.*; 

// 12:52 - 12 : 54

public class M22_내이름이적힌번호찾기{
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 

        String name = scanner.next(); 
        
        int i = 1; 
        for(; i<N ; i++){
            if(name.equals(scanner.next())) break; 
        }

        System.out.println(i); 

    }
}