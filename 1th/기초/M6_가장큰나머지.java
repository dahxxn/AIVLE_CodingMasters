import java.io.*;
import java.util.*; 

// 10:00 - 10:03

public class M6_가장큰나머지 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 

        int remainFive = N % 5; 
        int remainSeven = N % 7; 
        
        int result = remainFive > remainSeven ? remainFive : remainSeven; 

        System.out.println(result); 

    }
}