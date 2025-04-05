import java.io.*;
import java.util.*; 

// 12 : 07 - 12 : 10

public class M18_원의넓이 {
    private static final double PI = 3.14; 
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int r = scanner.nextInt(); 

        System.out.println(Math.pow(r,2)*PI); 

    }
}