
import java.io.*;
import java.util.*;

// 12:16 - 
public class M50_직각삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		
		int[] tri = {a,b,c}; 
		
		Arrays.sort(tri);
		
		double powSum = Math.pow(tri[0], 2) + Math.pow(tri[1], 2); 
		
		String ans = powSum == Math.pow(tri[2], 2)? "YES" : "NO"; 
		
		System.out.println(ans); 
	}
}

