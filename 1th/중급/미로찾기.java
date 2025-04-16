
import java.io.*;
import java.util.*;

public class 미로찾기 {
	static int N;
	static int M;
	static int[] S = new int[2];
	static int[] G = new int[2];
	static char[][] map;
	static int minCount; 
	// 기본 입력 정보 
	
	static char[] directions = {'N','S','W','E'}; 
	static List<Character> minPathList; 

	public static void main(String[] args) {
		
		input(); 
		
		if(!findPath()) {
			System.out.println("X"); 
			return; 
		}
		
		System.out.println(minPathList.size()); 
	}

	//입력받기 
	public static void input() {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new char[N][M]; 

		for (int i = 0; i < N; i++) {
			String row = sc.next();

			for (int j = 0; j < M; j++) {
				char pos = row.charAt(j);
				if (pos == 'S') {
					S[0] = i;
					S[1] = j;
				} else if (pos == 'G') {
					G[0] = i;
					G[1] = j;
				}
				map[i][j] = pos;
			}
		}

		sc.close();
		
		minCount = Integer.MAX_VALUE; 
		minPathList = new ArrayList<>(); 
	}
	
	
	//최단 경로 탐색
	public static boolean findPath() {
		boolean[][] visited = new boolean[N][M]; 
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<M ; j++) {
				if(map[i][j] == '1') visited[i][j] = true;
			}
		}
		
		visited[S[0]][S[1]] = true; 
		
		minPathList = new ArrayList<>(); 
		search(S,visited, new ArrayList<>()); 
		
		if(minPathList.size() == 0) return false; 
		return true; 
		
	}
	
	
	public static void search(int[] pos, boolean[][] visited, List<Character> path) {
		
		if(pos[0] == G[0] && pos[1] == G[1]) {
			if(minPathList.size() == 0) minPathList = new ArrayList<>(path); 
			else if(minPathList.size() > path.size()) {
				minPathList = new ArrayList<>(path); 
			}
			
			return; 
		}
		
	
		for(char direction : directions) {
			int[] nextPos = new int[2]; 
			nextPos[0] = pos[0]; 
			nextPos[1] = pos[1]; 
			
			
			// 해당 방향으로 갈 수 있는 경우만 이동 
			if(checkMove(nextPos, direction, visited)) {
				path.add(direction); 
	
				int[] prevPos = new int[2]; 
				prevPos[0] = nextPos[0]; 
				prevPos[1] = nextPos[1]; 
				
				if(map[pos[0]][pos[1]] == 'J') {
					if(checkMove(nextPos, direction, visited)) { // 2칸 다음 칸도 갈 수 있으면 true 
						visited[nextPos[0]][nextPos[1]] = true; 
					}
				}
				
				visited[prevPos[0]][prevPos[1]] = true; 
				search(nextPos, visited, path); 
				
				visited[prevPos[0]][prevPos[1]] = false; 
				visited[nextPos[0]][nextPos[1]] = false; 

									
				path.remove(path.size()-1); 
			}
			
			
		}	
	}
	
	
	// 상, 하, 좌, 우 별 이동 및 이동 가능 체크 
	public static boolean checkMove(int[] pos, char direction, boolean[][] visited) {		
		switch(direction) {
		
		case 'N': // row -- 
			pos[0]--; 
			if(!checkInvalidPos(pos[0], pos[1], visited)) pos[0]++;
			return checkInvalidPos(pos[0], pos[1], visited); 
			
		case 'S': // row ++ 
			pos[0]++; 
			if(!checkInvalidPos(pos[0], pos[1], visited)) pos[0]--;
			return checkInvalidPos(pos[0], pos[1], visited); 
			
		case 'W': //col -- 
			pos[1]--; 
			if(!checkInvalidPos(pos[0], pos[1], visited)) pos[1]++; 
			return checkInvalidPos(pos[0], pos[1], visited); 
			
		case 'E':  // col ++
			pos[1]++; 
			if(!checkInvalidPos(pos[0], pos[1], visited)) pos[1]--;
			return checkInvalidPos(pos[0], pos[1], visited); 
		}
		
		return false; 
	}
	
	
	public static boolean checkInvalidPos(int row, int col, boolean[][] visited) {
		return (row >= 0 && row < N && col >=0 && col <M && map[row][col] != '1' && !visited[row][col]); 
	}
	
	
}
