import java.util.*;

public class M55_숫자맞추기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 목표 숫자
        int k = sc.nextInt();  // 시작 숫자

        if (n <= k) {
            // 이미 시작 숫자가 목표보다 크거나 같으면, 무조건 빼기만 하면 됨
            System.out.println(k - n);
            return;
        }

        int[] dist = new int[100001];
        Arrays.fill(dist, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        dist[k] = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            int[] nexts = {now - 1, now + 1, now * 2};

            for (int next : nexts) {
                if (next >= 0 && next <= 100000) {
                    if (dist[next] == -1) {
                        dist[next] = dist[now] + 1;
                        queue.offer(next);
                    }
                }
            }
        }

        System.out.println(dist[n]);
    }
}
