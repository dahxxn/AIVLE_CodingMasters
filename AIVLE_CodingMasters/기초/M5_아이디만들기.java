import java.io.*;
import java.util.*; 
import java.util.regex.Pattern; 

// 9:41 - 9:50

public class M5_아이디만들기 {
    private static final char PASS = 'P'; 
    private static final char IGNORE = 'I'; 
    private static final String REGEX =  "[a-zA-Z]*"; 
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String id = scanner.next(); 
        
        if(id.length() <= 20 && Pattern.matches(REGEX, id)){
            System.out.println(PASS); 
        }else{
            System.out.println(IGNORE); 
        }

    }
}