
import java.io.*;
import java.util.*;

//2:38 - 2:59 

public class M27_누적합 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();

		int maxCnt = 1;
		while (maxCnt < M) {
			maxCnt *= 2;
		}

		List<Long> leaf = new ArrayList<>();
		for (int i = 0; i < maxCnt; i++) {
			if (i < M)
				leaf.add(scanner.nextLong());
			else
				leaf.add(0L);
		}

		Stack<List<Long>> tree = new Stack<>();
		tree.add(leaf);

		while (tree.peek().size() > 1) {
			List<Long> prev = tree.peek();
			List<Long> next = new ArrayList<>();

			for (int i = 0; i < prev.size(); i += 2) {
				next.add(prev.get(i) + prev.get(i + 1));
			}
			tree.push(next);
		}

		for (int i = tree.size() - 1; i >= 0; i--) {
			for (long val : tree.get(i)) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

	}
}
