import java.io.*;
import java.util.*; 

// 11:12 - 11:20

public class M12_아까운쿠폰{
    private static final int[] WONS = {50000, 10000, 5000, 1000, 500, 100, 50, 10}; 
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int cost = scanner.nextInt(); 
        
        int i = 0; 
        int count = 0;
        
        while(cost > 0 && i<WONS.length){
            int won = WONS[i]; 
            int wonCnt = cost / won; 
            count += wonCnt; 
            cost %= won;  
            i++; 
        }

        System.out.println(count); 

    }
}