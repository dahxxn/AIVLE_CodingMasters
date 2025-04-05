import java.io.*;
import java.util.*; 

// 12:11 - 12 : 18

public class M19_최대공약수 {
    static public int getMax(int N, int M){
        int max = N > M ? N : M; 
        int min = N < M ? N : M; 
        if(max % min == 0) return min; 
        
        for(int i = min/2 ; i >= 1 ; i--){
            if((max % i == 0) && (min % i == 0)) return i; 
        }
        
        return 1; 
    }
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        
        int result = getMax(N,M); 
        
        System.out.println(result); 

    }
}