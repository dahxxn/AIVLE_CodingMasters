
import java.io.*;
import java.util.*;

// 6 : 39 - 
public class M53_구조요원 {
	static int N; 
	static int[] drown = new int[2];
	static int divePoint = 0; 
	static int minDivePoint = 0; 
	
	public static void main(String[] args) {
		
		input(); 
		
		if(drown[0] == 0) {
			System.out.println("0"); 
			return; 
		}
		
		getFastestPoint(); 
		
		System.out.println(minDivePoint); 
		
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); 
		drown[0] = sc.nextInt(); 
		drown[1] = sc.nextInt(); 
		
		sc.close(); 
	}
	
	public static void getFastestPoint() {
		double minTime = Double.MAX_VALUE; 
		for(divePoint = -100; divePoint <= 100 ; divePoint++) {
			
			double sandTime = Math.sqrt((Math.pow(divePoint, 2)) + Math.pow(N, 2)) / 10;
			double oceanTime = Math.sqrt((Math.pow(drown[0] - divePoint, 2) + Math.pow(drown[1], 2))) / 5; 
			
			double totalTime = sandTime + oceanTime; 
			
			if(minTime > totalTime) {
				minDivePoint = divePoint; 
				minTime = totalTime; 
			}
		}
	}
}

