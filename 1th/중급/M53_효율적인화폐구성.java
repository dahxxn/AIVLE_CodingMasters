
import java.io.*;
import java.util.*;

// 
public class M53_효율적인화폐구성 {
	static int worth;
	static int[] coins;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		worth = sc.nextInt();

		coins = new int[N];

		for (int i = 0; i < N; i++) {
			coins[i] = sc.nextInt();
		}

		int[] dp = new int[worth+1]; 
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[0] = 0; 

        for (int coin : coins) {
            for (int j = coin; j <= worth; j++) {
                if (dp[j - coin] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                }
            }
        }
        
        int result = dp[worth] == Integer.MAX_VALUE ? -1 : dp[worth]; 
        System.out.println(result); 
    }

}
