
import java.io.*;
import java.util.*;

//7:00 - 7:11 
public class M31_몇번씩나올까 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        
        int[] numsCnt = new int[10]; 
        
        for(int i = 1 ; i<= N ; i++) {
        	String numStr = Integer.toString(i); 
        	
        	for(char n : numStr.toCharArray()) {
        		numsCnt[Integer.parseInt(Character.toString(n))]++; 
        	}
        }
        
        for(int i = 0 ; i<10 ; i++) {
        	System.out.println(numsCnt[i]); 
        }
        	
    }
}

