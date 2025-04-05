import java.io.*;
import java.util.*; 

//10:09 - 10:10

public class M8_자녀의키는 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int dadHeight = scanner.nextInt(); 
        int momHeight = scanner.nextInt(); 
        
        int predHeight = (dadHeight + momHeight)/2;  

        System.out.println(predHeight); 

    }
}