
import java.io.*;
import java.util.*;

//7:14 - 7:34 
public class M35_기둥세우기 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        
        int[][] castle = new int[N][M]; 
        
        int emptyHor = 0; 
        for(int i = 0 ; i<N ; i++){
            int sum = 0; 
            for(int j = 0 ; j<M ; j++){
                castle[i][j] = scanner.nextInt(); 
                sum += castle[i][j]; 
            }
            if(sum==M) emptyHor++; 
        }
        
        int emptyVert = 0; 
        for(int i = 0 ; i<M ; i++){
            int sum =0; 
            for(int j = 0 ; j<N ; j++){
                sum += castle[j][i]; 
            }
            if(sum == M) emptyVert++;  
        }

        System.out.println(Math.max(emptyHor,emptyVert)); 

		
	}
}

