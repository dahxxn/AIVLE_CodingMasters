
import java.io.*;
import java.util.*;

//7:13 - 7:25

public class M32_조합 {
	
	public static long comb(long A, long B) {
		long diff = A-B; 
		if(diff < B) B=diff; 
		
		long top = 1; 
		long bottom = 1; 
		for(long i = A,j = B; i> A-B && j>0 ; i--, j--) {
			top *= i; 
			bottom *= j; 
		}
		return top/bottom; 
			
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextInt(); 
		long B = scanner.nextInt(); 
		
		scanner.close();
		System.out.println(comb(A,B)); 
	}
}

