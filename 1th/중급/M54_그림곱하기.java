import java.util.*;

public class M54_그림곱하기 {
    static int N, M;
    static char[][] picture;

    public static void main(String[] args) {
        input();
        findAndPrintSmallestPattern();
    }

    // 입력 처리
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            picture[i] = line.toCharArray();
        }
        sc.close();
    }

    // 가장 작은 패턴 찾고 출력
    static void findAndPrintSmallestPattern() {
        for (int h = 1; h <= N; h++) {
            if (N % h != 0) continue;
            for (int w = 1; w <= M; w++) {
                if (M % w != 0) continue;
                if (!sameScale(h, w)) continue;

                if (isValidPattern(h, w)) {
                    printPattern(h, w);
                    return;
                }
            }
        }
    }

    // 가로/세로 비율이 같은지 확인
    static boolean sameScale(int h, int w) {
        return (N / h) == (M / w);
    }

    // (h,w) 크기 패턴이 전체 그림을 복제해서 만들 수 있는지 확인
    static boolean isValidPattern(int h, int w) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (picture[i][j] != picture[i % h][j % w]) {
                    return false;
                }
            }
        }
        return true;
    }

    // (h,w) 크기의 작은 패턴 출력
    static void printPattern(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(picture[i][j]);
            }
            System.out.println();
        }
    }
}
