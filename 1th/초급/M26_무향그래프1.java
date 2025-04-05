import java.io.*;
import java.util.*;

// 7:05 - 7:10
public class M26_무향그래프1 {
	
	public static void main(String[] args) throws IOException {
		
	Scanner scanner = new Scanner(System.in); 
		
		int N = scanner.nextInt(); 
		int M = scanner.nextInt(); 
		
		int[][] graph = new int[N][N]; 
		
		for(int i = 0 ; i<M ; i++) {
			int a = scanner.nextInt(); 
			int b = scanner.nextInt(); 
			
			graph[a-1][b-1] = 1; 
		    graph[b-1][a-1] = 1; 
		}
		
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println(); 
		}
		
	}

}

