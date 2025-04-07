
import java.io.*;
import java.util.*;
//7:46 - 7:48
public class M37_이별30분전 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int hour = scanner.nextInt(); 
        int min = scanner.nextInt(); 
        
        min -= 30; 
        if(min < 0){
            hour--; 
            min += 60; 
            
            if(hour<0){
                hour += 24; 
            }
        }

        System.out.println(hour + " " + min); 

    }
}

