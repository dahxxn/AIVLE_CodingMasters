// don't place package name. 

import java.io.*;

import java.util.*;

// 9 : 07 - 9:42 
public class M68_콘웨이의생명게임 {
	static int N;
	static int[][] map;
	static int[] row = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] col = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		input(); 
		for (int i = 0; i < N; i++) oneGeneration(); 
		output(); 
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[5][5];

		for (int i = 0; i < 5; i++) {
			String r = sc.next();
			for (int j = 0; j < 5; j++) {
				map[i][j] = r.charAt(j) - '0';
			}
		}
		sc.close();
	}
	
	public static void output() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public static boolean isValidIdx(int row, int col) {
		return row >= 0 && row < 5 && col >= 0 && col < 5;
	}

	public static void oneGeneration() {
		int[][] nextMap = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (checkNextAlive(i, j)) {
					nextMap[i][j] = 1;
				} else {
					nextMap[i][j] = 0;
				}

			}
		}

		map = nextMap;
	}

	public static boolean checkNextAlive(int i, int j) {
		boolean isCurrentAlive = map[i][j] == 1 ? true : false;

		int countAlive = countArroundAlive(i, j);
		if (isCurrentAlive && (countAlive == 2 || countAlive == 3)) {
			return true;
		} else if (countAlive == 3) {
			return true;
		}

		return false;
	}

	public static int countArroundAlive(int i, int j) {
		int count = 0;
		for (int idx = 0; idx < 8; idx++) {
			int r = i + row[idx];
			int c = j + col[idx];

			if (!isValidIdx(r, c))
				continue;

			if (map[r][c] == 1) {
				count++;
			}

		}

		return count;
	}

}