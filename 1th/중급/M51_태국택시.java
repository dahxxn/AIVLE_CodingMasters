import java.util.*;

class road implements Comparable<road>{
	int from; 
	int to; 
	int cost; 
	
	public road(int from, int to, int cost) {
		this.from = from;
		this.to = to; 
		this.cost = cost; 
	}
	
	public int compareTo(road r) {
		return this.cost - r.cost; // 오름차순 정렬 
	}
}


public class M51_태국택시 {
    static int[] tree;


    static int find(int x) { // tree 의 대표 정점이 
        if (tree[x] == x) return x;
        return tree[x] = find(tree[x]);
    }

    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) tree[rootY] = rootX;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 마을 수
        int m = sc.nextInt(); // 택시 수

        List<road> edges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int cost = sc.nextInt();
            edges.add(new road(a, b, cost));
        }

        Collections.sort(edges); 

        tree = new int[n];
        for (int i = 0; i < n; i++) tree[i] = i;

        int totalCost = 0;
        for (road edge : edges) {
            if (find(edge.from) != find(edge.to)) {
                union(edge.from, edge.to);
                totalCost += edge.cost;
            }
        }

        System.out.println(totalCost);
    }
}
