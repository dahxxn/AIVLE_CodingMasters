
import java.io.*;
import java.util.*;

public class M65_밑장빼기 {
	static int N; 
	static List<Integer> cardNums = new ArrayList<>(); 
	
	public static void main(String[] args) {
		
		input(); 
		
		if(checkCard()) System.out.println("YES"); 
		else System.out.println("NO"); 
		
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); 
		
		for(int i = 0 ; i<N ; i++) {
			cardNums.add(sc.nextInt());
		}
		
		sc.close(); 
	}
	
	public static boolean checkCard() {
		int current = 1; 
		
		while(!cardNums.isEmpty()){
			if(cardNums.get(0) == current ) cardNums.remove(0); 
			else if(cardNums.getLast() == current) cardNums.remove(cardNums.size()-1); 
			else return false; 
			current++; 
		}
		
		return true; 
		
		
	}
}

