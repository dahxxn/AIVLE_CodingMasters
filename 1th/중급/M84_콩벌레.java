import java.io.*;
import java.util.*;

// 9 : 50 - 
/*
 * 빈 공간 : 0 
 * 벽 : 1 
 * 콩벌레 : 2
 * 초기에 위로 진행 
 * => 벽을 만날시 반시계, 다음 벽을 만날때 다른 방향 
 * => 지도상에서 사라지는지? 
 * 	=> 탈출 못하는 경우 : 현재 방향이 벽이고 왼쪽 방향도 벽이면 no 출력 
 * */
public class M84_콩벌레 {
	static int[][] map = new int[10][10];
	static int[] bug = new int[2];
	static int direct = 0; // 상,우,하,좌 = 0,1,2,3 ( 시계 방향 ) 
	static int[] rowDirect = { -1, 0, 1, 0 };
	static int[] colDirect = { 0, 1, 0, -1 };
	static boolean isLeft = true;  
	
	static String result = "no"; 

	public static void main(String[] args) throws IOException {
		input();
		run(); 
		System.out.println(result); 
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			String s = sc.next();
			for (int j = 0; j < 10; j++) {
				map[i][j] = Integer.parseInt(Character.toString(s.charAt(j)));
				if(map[i][j] == 2) {
					bug[0] = i; 
					bug[1] = j; 
				}
			}
		}

		sc.close();
	}
	
	public static void run() {
		while(true) {
			if(isImpossible()) return; 
			
			int[] forward = {bug[0] + rowDirect[direct] , bug[1] + colDirect[direct]}; 
			if(!isInRange(forward)) {
				result = "yes"; 
				return; 
			}
			
			// 현재 바라보는 방향이 벽이면 꺽기 
			if(isForwardWall(forward)) {
				if(isLeft) direct = direct - 1 < 0 ? 3 : direct - 1;
				else direct = direct + 1 > 3 ? 0 : direct + 1; 	
				isLeft = !isLeft; 
				continue; 
			}
			
			// 재설정된 방향으로 전진
			bug[0] = forward[0]; 
			bug[1] = forward[1]; 
		}
		
		
	}
	
	public static boolean isForwardWall(int[] forward) {
		return map[forward[0]][forward[1]] == 1; 
	}
	
	public static boolean isImpossible() {
		// 현재 바라보는 방향과 벽이 만나 꺾이는 방향이 둘다 벽이면 no 출력 할 수 있도록 함 
		int[] forward = {bug[0] + rowDirect[direct] , bug[1] + colDirect[direct]}; 
		
		int nextDirect = 0; 
		if(isLeft) nextDirect = direct - 1 < 0 ? 3 : direct - 1;
		else nextDirect = direct + 1 > 3 ? 0 : direct + 1; 
		
		int[] next = {bug[0] + rowDirect[nextDirect], bug[1] + colDirect[nextDirect]};
		
		// 두 방향 중 하나가 밖을 벗어나면 가능함 
		if(!isInRange(forward) || !isInRange(next)) return false; 
		
		// 두 방향 모두 벽이 면 불가능함 
		if(map[forward[0]][forward[1]] == 1 && map[next[0]][next[1]] == 1) return true; 
		return false; 
	}
	
	public static boolean isInRange(int[] pos) {
		return  pos[0] >= 0 && pos[0] < 10 && pos[1] >= 0 && pos[1] < 10;  
	}

}