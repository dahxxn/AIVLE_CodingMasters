
import java.io.*;
import java.util.*;

// 5:32 - 6 : 31 

public class M52_같은그래프 {
	static int N1;
	static int M1;
	static int N2;
	static int M2;

	static int[][] graph1;
	static int[][] graph2;

	static int[] nodes;

	public static void main(String[] args) {

		if (!input())
			return;

		if (checkGraphSame()) {
			System.out.println("YES");
			return;
		}

		permute(nodes, 0);

		for (int[] mapping : mappings) {
			boolean isValid = true;
			for (int node1 = 1; node1 <= N1 && isValid; node1++) {
				for (int node2 = 1; node2 <= N1; node2++) {
					if (graph1[node1][node2] != graph2[mapping[node1 - 1]][mapping[node2 - 1]]) {
						isValid = false;
						break;
					}
				}
			}
			if (isValid) {
				System.out.println("YES");
				return;
			}
		}

		System.out.println("NO");

	}

	public static boolean checkGraphSame() {
		for (int i = 1; i <= N1; i++) {
			for (int j = 1; j <= N1; j++) {
				if (graph1[i][j] != graph2[i][j])
					return false;
			}
		}

		return true;
	}

	static List<int[]> mappings = new ArrayList<>();

	public static void permute(int[] vertex, int depth) {
		if (depth == vertex.length) {
			mappings.add(vertex.clone());
			return;
		}

		for (int i = depth; i < vertex.length; i++) {
			swap(vertex, depth, i);
			permute(vertex, depth + 1);
			swap(vertex, depth, i);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	@SuppressWarnings("resource")
	public static boolean input() {
		Scanner sc = new Scanner(System.in);

		N1 = sc.nextInt();
		M1 = sc.nextInt();

		graph1 = new int[N1 + 1][N1 + 1];
		for (int i = 0; i < M1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph1[u][v] = 1;
			graph1[v][u] = 1;
		}

		N2 = sc.nextInt();
		M2 = sc.nextInt();

		if (N1 != N2 || M1 != M2) {
			System.out.println("NO");
			return false;
		}

		graph2 = new int[N2 + 1][N2 + 1];
		for (int i = 0; i < M2; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			graph2[u][v] = 1;
			graph2[v][u] = 1;
		}

		nodes = new int[N1];
		for (int i = 1; i <= N1; i++)
			nodes[i - 1] = i;

		sc.close();
		return true;

	}
}
