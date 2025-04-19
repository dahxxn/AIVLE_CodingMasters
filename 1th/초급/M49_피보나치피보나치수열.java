
import java.io.*;
import java.util.*;

// 12:00 - 12:14 
public class M49_피보나치피보나치수열 {
	static List<Integer> fiboList = new ArrayList<>(); 
	static int[] fiboArr = new int[101]; 
	static int[] fibofiboArr; 
	static int sum; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		fiboArr[1] = 1; 
		fiboArr[2] = 1; 
		
		sum = 0; 
		
		fibofiboArr = new int[b+1]; 
		fibofiboArr[0] = 1; 
		fibofiboArr[1] = 1; 
		
		fibo(a,b); 


		System.out.println(sum); 
		
	}
	
	public static void fibo(int a, int b) {
		int f = 1; 
		
		for(int i = 1;   ; i++) {
			if(fiboArr[i] == 0) {
				fiboArr[i] = fiboArr[i-1] + fiboArr[i-2]; 
			}
			
			for(int j = 0 ; j<fiboArr[i] ; j++) {
				fibofiboArr[f] = fiboArr[i]; 
				if(f >= a && f <= b) {
					sum += fibofiboArr[f]; 
				} 
				f++; 
				if(f > b) return; 
			}
			
			
		}
	}
}

