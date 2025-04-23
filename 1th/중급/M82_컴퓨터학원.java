
import java.io.*;
import java.util.*;

public class M82_컴퓨터학원 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt(); 		
	    
	    long[] dp = new long[3]; // 0: (00), 1: (01), 2: (10)
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 1; i < n; i++) {
            long[] next = new long[3];
            next[0] = (dp[0] + dp[1] + dp[2]) % 796796;
            next[1] = (dp[0] + dp[2]) % 796796;
            next[2] = (dp[0] + dp[1]) % 796796;
            dp = next;
        }

        long result = (dp[0] + dp[1] + dp[2]) % 796796;
        System.out.println(result);
		
	}
}

