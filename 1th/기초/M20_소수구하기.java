import java.io.*;
import java.util.*; 

// 12 : 19 - 12 : 25

public class M20_소수구하기 {
    public static boolean isPrime(int n){
        if(n == 2 || n == 3 || n == 5 || n == 7) return true; 
        
        for(int i = 2 ; i<Math.sqrt(n)+1 ; i++){
            if(n%i == 0) return false; 
        }
        
        return true; 
    }
    
    public static int getPrimeCount(int n){
        int count = 0; 
        
        for(int i = 2 ; i<=n ; i++){
            if(isPrime(i)) count++; 
        }
        
        return count; 
    }
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt();

        System.out.println(getPrimeCount(N)); 

    }
}