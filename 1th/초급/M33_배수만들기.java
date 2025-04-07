import java.io.*;
import java.util.*;

// 3:45 - 3:57 

public class M33_배수만들기 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 

        List<Integer> numList = new ArrayList<>(); 
        
        int sum = 0; 
        int zeroCnt = 0; 
        for(int i = 0 ; i<N ; i++){
            int num = scanner.nextInt(); 
            numList.add(num); 
            sum += num; 
            if(num == 0) zeroCnt++; 
        }
        
        StringBuilder result = new StringBuilder(); // long으로 직접 수를 더해서 만들면 오류남 
        if(sum %3 == 0 && zeroCnt >= 2){
            Collections.sort(numList); 
            Collections.reverse(numList); 
            
            for(int n : numList){
                result.append(n);  
            }
            
            System.out.println(result.toString()); 
        }else if(sum == 0){
            System.out.println(0); 
        }else{
            System.out.println(-1); 
        }

    }
}
