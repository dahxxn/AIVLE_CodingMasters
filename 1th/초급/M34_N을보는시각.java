
import java.io.*;
import java.util.*;

//7:08-7:13

public class M34_N을보는시각 {
	public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in); 

        int N= scanner.nextInt(); 
        
        int hours = 0; 
        int mins = 0; 
        int secs = 0; 
        
        int result = 0; 
        while(hours < 24){
            secs++; 
            
            if(secs == 60){
                mins++; 
                secs = 0; 
                if(mins == 60){
                    hours++; 
                    mins = 0; 
                    if(hours == 24) break; 
                }
            }
            
            String time = Integer.toString(hours) + Integer.toString(mins) + Integer.toString(secs); 
            
            if(time.contains(Integer.toString(N))){
                result++; 
            }
        
        }

        System.out.println(result); 

	}
}

