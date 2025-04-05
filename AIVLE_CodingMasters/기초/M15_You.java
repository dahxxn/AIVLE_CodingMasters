import java.io.*;
import java.util.*; 

//11:56 - 11:57

public class M15_You {
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String command = scanner.next(); 
        
        String result = command.equals("You") ? "Me" : "No"; 

        System.out.println(result); 

    }
}