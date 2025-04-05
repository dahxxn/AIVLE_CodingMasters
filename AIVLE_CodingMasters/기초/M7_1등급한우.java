import java.io.*;
import java.util.*; 

//10:05 - 10:07

public class M7_1등급한우 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int kg = scanner.nextInt(); 
        
        char result = 'D'; 
        
        if(kg >= 200) result = 'A'; 
        else if(kg >= 180) result = 'B'; 
        else if(kg >= 150) result = 'C'; 
        
        System.out.println(result); 

    }
}