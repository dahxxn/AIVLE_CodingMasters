
import java.io.*;
import java.util.*;

public class M59_동전줍기 {
	static int N; 
	static int[][] mountain; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); 
		mountain = new int[N][N]; 
		
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<= i ; j++) {
				mountain[i][j] = sc.nextInt(); 
			}
		}

		
		int[][] maxCoins = mountain; 
		
		for(int i = 1 ; i<N ; i++) {
			for(int j = 0 ; j<= i ; j++) {
				// 현재 코인 
				int currentCoins = maxCoins[i][j]; // 바로 위  => 바로 아래로 내려온 것 
				int straightUp = maxCoins[i-1][j];  // 왼쪽 대각선 위 => 오른쪽 아래로 내려온것  
				int LeftUp = j-1 >=0 ? maxCoins[i-1][j-1] : 0 ; 
				
				maxCoins[i][j] = Math.max(currentCoins + straightUp, currentCoins + LeftUp); 
			}
		}
		
		Arrays.sort(maxCoins[N-1]);
		
		System.out.println(maxCoins[N-1][N-1]); 
		
		
	}
}

