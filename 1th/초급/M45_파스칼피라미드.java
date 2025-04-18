
import java.io.*;
import java.util.*;


// 9:12 - 
public class M45_파스칼피라미드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int floor= sc.nextInt(); 
			
		printTri(floor);
		sc.close(); 
	}
	
	static void printTri(int floor) {
		int[][] prevFloor = new int[15][15]; 
		prevFloor[0][0] = 1; 
		
		for(int f = 1 ; f <= floor ; f++) {
			int[][] currentFloor = new int[15][15]; 
			for(int i = 0 ; i<f ; i++) {
				for(int j = 0 ; j < f - i ;j++) {
					currentFloor[i][j] = prevFloor[i][j]; 
					if(i-1 >=0) currentFloor[i][j] += prevFloor[i-1][j]; 
					if(j-1 >=0) currentFloor[i][j] += prevFloor[i][j-1]; 
				}
			}
			
			prevFloor = currentFloor; 
		}
		
		for(int i = 0 ; i<floor ; i++) {
			for(int j = 0 ; j < floor - i ;j++) {
				System.out.print(prevFloor[i][j] + " ") ;
			}
			System.out.println(); 
		}
		
	} 

}

