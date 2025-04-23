import java.util.*;

public class M40_신입사원채용 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] applicants = new int[n][2];

        for (int i = 0; i < n; i++) {
            applicants[i][0] = sc.nextInt(); // document score
            applicants[i][1] = sc.nextInt(); // interview score
        }

        int[] rank = new int[n];

        // 기본적으로 better 기준으로 등수 매기기
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (isBetter(applicants[j], applicants[i])) {
                    cnt++;
                }
            }
            rank[i] = cnt + 1;
        }

        // 동점 그룹 만들기
        Map<Integer, Set<Integer>> groupMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isSameGroup(applicants[i], applicants[j])) {
                    // i와 j를 같은 그룹으로 묶자
                    int gi = findGroup(groupMap, i);
                    int gj = findGroup(groupMap, j);

                    if (gi != -1 && gj != -1) {
                        // 둘 다 그룹 있음 -> 합치기
                        if (gi != gj) {
                            groupMap.get(gi).addAll(groupMap.get(gj));
                            groupMap.remove(gj);
                        }
                    } else if (gi != -1) {
                        // i만 그룹 있음
                        groupMap.get(gi).add(j);
                    } else if (gj != -1) {
                        // j만 그룹 있음
                        groupMap.get(gj).add(i);
                    } else {
                        // 둘 다 그룹 없음 -> 새 그룹 만들기
                        Set<Integer> newGroup = new HashSet<>();
                        newGroup.add(i);
                        newGroup.add(j);
                        groupMap.put(i, newGroup);
                    }
                }
            }
        }

        // 그룹별 최소 rank로 맞추기
        for (Set<Integer> group : groupMap.values()) {
            int minRank = Integer.MAX_VALUE;
            for (int idx : group) {
                minRank = Math.min(minRank, rank[idx]);
            }
            for (int idx : group) {
                rank[idx] = minRank;
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
    }

    // A가 B보다 더 낫다
    static boolean isBetter(int[] a, int[] b) {
        return (a[0] > b[0] && a[1] >= b[1]) || (a[0] >= b[0] && a[1] > b[1]);
    }

    // A와 B가 동점자다
    static boolean isSameGroup(int[] a, int[] b) {
        return (a[0] > b[0] && a[1] < b[1]) ||
               (a[0] < b[0] && a[1] > b[1]) ||
               (a[0] == b[0] && a[1] == b[1]);
    }

    // i가 어느 그룹에 속하는지 찾기
    static int findGroup(Map<Integer, Set<Integer>> groupMap, int i) {
        for (Map.Entry<Integer, Set<Integer>> entry : groupMap.entrySet()) {
            if (entry.getValue().contains(i)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
