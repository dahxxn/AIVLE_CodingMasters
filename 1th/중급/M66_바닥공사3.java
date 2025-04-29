
import java.io.*;
import java.util.*;

public class M66_바닥공사3 {
	static int N; 
	static int[] value; 
	public static void main(String[] args) {
		input(); 
		value = new int[N+1]; 
		
		value[0] = 1; 
		value[2] = 3; 
		value[4] = 11; 
		
		System.out.println(findN()); 
	
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); 
		
		sc.close(); 
	}
	
	public static int findN(){
	    if(N%2 == 1) {
			return 0; 
		}
		for(int i = 6 ; i<= N ; i+=2) {
		    value[i] = value[i-2] * 3; 
		    
		    for(int j = 0 ; j<= i - 4 ; j+=2){
		        value[i] += value[j] *2;  
		    }
		}
		return value[N]; 
	}
}

