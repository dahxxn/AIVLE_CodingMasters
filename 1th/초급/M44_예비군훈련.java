
import java.io.*;
import java.util.*;


// 9 - 9:10
public class M44_예비군훈련 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt(); // 연차 
		String armyType = sc.next(); // 육해공군 
		boolean isY = sc.next().equals("Y")? true : false ; // 동원지정여부 
		boolean isPrivate = sc.next().equals("Private")? true : false; //신분여부 
		
		System.out.println(calculateTime(year, armyType, isY, isPrivate)); 
		
		
		sc.close(); 
	}
	
	static int calculateTime (int year, String armyType, boolean isY, boolean isPrivate ) {
		if(isPrivate) {
			if(year == 0) return 0; 
			if(year <= 4) {
				if(isY) return 28; 
				if(armyType.equals("ROKAF")) return 28; 
				return 32; 
			}
			return 20; 
		}else {
			if(year == 0) return 0; 
			if(year <= 6) return 28; 	
		}
		return -1; 
		
	}

}

