import java.io.*;
import java.util.*; 

// 2: 13 - 2:50 

public class M24_바닥공사1 {
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        int[] nArr= new int[N+1]; 
        nArr[0]=0;
        nArr[1]=1;
        nArr[2]=2;
        nArr[3]=3; 
        
        for(int i=4 ; i<=N ; i++){
            nArr[i] = (nArr[i-1] + nArr[i-2])%796796; 
        }
        
        System.out.println(nArr[N]); 
    }
}