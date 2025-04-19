
import java.io.*;
import java.util.*;

public class M48_문서통계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		String str = sc.nextLine(); 
		
		System.out.println(str.length()); 
		
		String[] word = str.split(" "); 
		
		int charCnt = 0; 
		int wordCnt = 0; 
		for(String w : word) {
			charCnt+=w.length(); 
			if(w.length() >0) wordCnt++; 
		}
		
		System.out.println(charCnt); 
		System.out.println(wordCnt); 
	}
}

