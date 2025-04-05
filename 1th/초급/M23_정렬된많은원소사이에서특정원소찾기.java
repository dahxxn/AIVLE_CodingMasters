import java.io.*;
import java.util.*; 

//8 : 22 - 8 : 26

public class M23_정렬된많은원소사이에서특정원소찾기 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 

        int A = scanner.nextInt(); 
        
        for(int i = 0 ; i<N ; i++){
            int currentNum = scanner.nextInt(); 
            if(currentNum == A){
                System.out.println(i+1); 
                break; 
            }else if(currentNum > A){
                System.out.println(-1); 
                break; 
            }
        }
    }
}