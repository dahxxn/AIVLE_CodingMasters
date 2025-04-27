import java.io.*;
import java.util.*;

public class M63_무차별대입공격 {
	static int N;
	static int K;
	static List<Character> charList;

	public static void main(String[] args) throws IOException {

		input();
		Collections.sort(charList);
		makeEncrpyt();

	}

	public static void input() {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		charList = new ArrayList<>();
		String chars = sc.next();
		for (int i = 0; i < N; i++) {
			charList.add(chars.charAt(i));
		}

		sc.close();
	}

	public static void makeEncrpyt() {
		for (char start : charList) {
			StringBuilder sb = new StringBuilder();
			sb.append(start);
			dfs(sb, 1);
		}
	}

	public static void dfs(StringBuilder sb, int count) {
		if (count == K) {
			System.out.println(sb.toString());
			return;
		}

		for (char next : charList) {
			sb.append(next);
			dfs(sb, count + 1);
			sb.deleteCharAt(count);
		}
	}
}