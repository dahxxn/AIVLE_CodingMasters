
import java.io.*;
import java.util.*;


// 8: 45 - 8:55
public class M43_가우스와정다각형 {
	static int[] pnums = {1,3,5,17,257,65537}; 
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		
		long K = sc.nextLong(); 
		
		long remains = remainVal(K); 
		
		boolean check = check2(remains); 
		
		if(check) System.out.println("YES"); 
		else System.out.println("NO"); 
		
		sc.close(); 
	}
	
	public static boolean check2(long remains) {
		if(remains == 1) return true; 
		if(remains % 2 == 1) return false; 
		
		return check2(remains/2); 
	}
	
	public static long remainVal(long K) {
		for(int n : pnums) {
			if(K%n == 0) {
				K /= n; 
			}
		}
		
		return K; 
	}
}

