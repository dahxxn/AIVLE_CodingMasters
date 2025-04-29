
import java.io.*;
import java.util.*;

//8 : 10 - 8:42 
public class M55_그림판 {
	static int N; 
	static int M;
	static char[][] painting; 
	static int[] rowDirect = {-1,1,0,0}; 
	static int[] colDirect = {0,0,-1,1}; 
	
	static int totalRedCnt = 0; 
	static int totalBlueCnt = 0; 
	
	public static void main(String[] args) {
		input(); 
		rePainting(); 
		
		System.out.println(totalRedCnt + " " + totalBlueCnt); 
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); 
		M = sc.nextInt(); 
		
		painting = new char[N][M]; 
		
		for(int i = 0 ; i<N ; i++) {
			String line = sc.next(); 
			for(int j = 0 ; j<M ; j++) {
				painting[i][j] = line.charAt(j); 
			}
		}
		
		sc.close(); 
	}
	
	public static void rePainting() {
		boolean[][] visited = new boolean[N][M]; 
		
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<M ; j++) {
				if(!visited[i][j] && painting[i][j] != 'X') {
					// 현재 위치에서 영역 탐색 
					int rCnt = 0; 
					int bCnt = 0; 
					
					visited[i][j] = true; 
					
					// 상하좌우 인접한 색 체크 
					Queue<int[]> region = new LinkedList<>(); 
					region.add(new int[] {i,j}); 
					
					while(!region.isEmpty()) {
						int[] current = region.poll(); 
						int row = current[0]; 
						int col = current[1]; 

								
						if(painting[row][col] == 'A') rCnt ++; 
						else if(painting[row][col] == 'B') bCnt++; 
						
						for(int direct = 0 ; direct<4 ; direct++) {
							int r = row+rowDirect[direct]; 
							int c = col+colDirect[direct]; 
							
							if(!isInRange(r,c) || painting[r][c] == 'X' || visited[r][c]) continue; 
							
							visited[r][c] = true; 
							region.add(new int[] {r,c}); 
						}
					}
					
					if(bCnt >= rCnt) totalBlueCnt += bCnt; 
					else totalRedCnt += rCnt; 
					
				}
				
			}
		}
		
	}
	
	public static boolean isInRange(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M; 
	}
	
	public static void findRegion(int i, int j) {
		
		
	}
}

