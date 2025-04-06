
import java.io.*;
import java.util.*;

// 3:03 - 3:06
public class M28_중앙값 {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numList =new ArrayList<>(); 
		for(int i = 0 ; i<5 ; i++) {
			numList.add(scanner.nextInt()); 
		}
		
		Collections.sort(numList);
		System.out.println(numList.get(2)); 
		
	}
}

