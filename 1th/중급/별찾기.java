
import java.io.*;
import java.util.*;

public class 별찾기 {
    static char[][] map;
    static int N; 
    
	public static void main(String[] args) {
        
        input(); 
        
        if(N==1) {
        	System.out.println("*");
        	return; 
        }

        int size = (int) Math.pow(3, N-1);
        map = new char[size][size];

        for (int i = 0; i < size; i++) {
            Arrays.fill(map[i], ' ');
        }
        
        draw(0,0,size); 

        for (int i = 0; i < size; i++) {
            System.out.println(new String(map[i]));
        }
    }
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); 
        sc.close();
	}

    public static void draw(int row, int col, int size) {
    	if(size == 1) {
    		 map[row][col] = '*';
             return;
    	}
    	 int newSize = size / 3;

    	 draw(row, col, newSize);
    	 draw(row, col + 2 * newSize, newSize);
    	 draw(row + newSize, col + newSize, newSize);
    	 draw(row + 2 * newSize, col, newSize);
    	 draw(row + 2 * newSize, col + 2 * newSize, newSize);
    }
}

