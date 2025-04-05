
import java.io.*;
import java.util.*;

// 4:57 - 5:08 

public class M25_사전만들기 {
	static class DictionaryComparator implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			if(o1.length() == o2.length()) {
				return o1.compareTo(o2); 
			}
			return o1.length() - o2.length(); 
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt(); 
		
		List<String> dict = new ArrayList<>(); 
		for(int i = 0 ; i<N ; i++) {
			String word = sc.next(); 
			if(!dict.contains(word)) dict.add(word); 
		}
		
		Collections.sort(dict,new DictionaryComparator());
		
		for(String word : dict) {
			System.out.println(word); 
		}
	}

}

