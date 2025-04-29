
import java.io.*;
import java.util.*;

//8:45 - 9:08 

public class M56_단어퍼즐 {
	static List<String> words = new ArrayList<>(); 
	static List<String[]> puzzleList = new ArrayList<>(); 
	public static void main(String[] args) {
		input(); 
		
		Collections.sort(words); // 사전 순 정렬 
		
		for(int start = 0 ; start<6 ; start++ ) {
			String[] puzzle = new String[3]; 
			findPuzzle(0, puzzle); 
		}
		
		output(); 
		
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<6 ; i++) {
			words.add(sc.next()); 
		}
		
		sc.close(); 
		
	}
	
	public static void output() {
		for(String w : puzzleList.get(0)) {
			System.out.println(w); 
		}
	}
	
	public static void findPuzzle(int depth, String[] puzzle) {
		if(depth == 3) {
			List<String> newWords = new ArrayList<>(Arrays.asList(puzzle)); 
			
			for(int i = 0 ; i<3; i ++) {
				StringBuilder newWord = new StringBuilder(); 
				newWord.append(puzzle[0].charAt(i)); 
				newWord.append(puzzle[1].charAt(i)); 
				newWord.append(puzzle[2].charAt(i)); 
				
				newWords.add(newWord.toString()); 		
			}
			
			Collections.sort(newWords);
			
			if(newWords.equals(words)) {
				puzzleList.add(puzzle.clone()); 
			}
			
			return; 
			
		}
		
		for(int i = depth ; i<6; i++) {
			String[] puzzleClone = puzzle.clone(); 
			
			String nextWord = words.get(i); 
			puzzleClone[depth] = nextWord; 
			findPuzzle(depth+1, puzzleClone); 
			
		}
		
	}
	
	
}

