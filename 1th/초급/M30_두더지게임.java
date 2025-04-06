
import java.io.*;
import java.util.*;

// 3:16-3:23

public class M30_두더지게임 {
	public static int[][] mold = new int[8][8]; 
	public static boolean[][] rats = new boolean[8][8]; 
	
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 
        int count=0; 
        
        for(int i = 0 ; i<8 ; i++) {        	
        	String rat = scanner.next(); 

        	for(int j = 0 ; j<8 ; j++) {
        		mold[i][j] = (i+j) % 2; 
        		rats[i][j] = rat.charAt(j)=='F' ? true : false; 
        		
        		if((mold[i][j]==0) && rats[i][j]) count++; 
        	}
        }
        
        scanner.close();
        System.out.println(count); 

    }
}

