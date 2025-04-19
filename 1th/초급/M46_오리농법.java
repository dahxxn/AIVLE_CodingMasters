
import java.io.*;
import java.util.*;

// 7:45 - 8 
public class M46_오리농법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		
		List<int[]> grassList = new ArrayList<>(); 
		Set<Integer> plantRow = new HashSet<>(); 
		Set<Integer> plantCol = new HashSet<>(); 
		
		int[][] map = new int[N][N]; 
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				map[i][j] = sc.nextInt(); 
				if(map[i][j] == 2) {
					grassList.add(new int[] {i, j}); 
				}else if(map[i][j] == 1) {
					plantRow.add(i); 
					plantCol.add(j); 
				}
			}
		}
		
		List<int[]> grassListCopy = new ArrayList<>(grassList); 
		boolean[] isRowChecked = new boolean[grassList.size()]; 
		for(int row : plantRow) {
			for(int i = 0 ; i<grassList.size(); i++) {
				if(grassList.get(i)[0] == row && !isRowChecked[i]) {
					isRowChecked[i] = true; 
				}
			}
		}
		
		int cnt = 0; 
		for(int col : plantCol) {
			for(int i = 0 ; i<grassList.size(); i++) {
				if(grassList.get(i)[1] == col && isRowChecked[i]) {
					cnt++; 
				}
			}
		}
		
		System.out.println(cnt); 
		
		
		
	}
}

