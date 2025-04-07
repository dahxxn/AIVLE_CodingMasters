
import java.io.*;
import java.util.*;
//7:55 - 7:59
public class M39_주사위의합 {
	public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        int result = 0; 

        for(int i = 1 ; i<= 6 ;i++){
            if(N-i <= 6 && N-i >0){
                System.out.printf("%d %d\n", i, N-i); 
            }
        } 

    }
}

