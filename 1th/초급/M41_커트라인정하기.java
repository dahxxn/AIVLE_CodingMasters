
import java.io.*;
import java.util.*;

//11:30 - 11:50 

class grade {
	int value; 
	int count; 
	
	public grade(int value, int count) {
		this.value = value; 
		this.count = count; 
	}
}

class gradeSort implements Comparator<grade>{

	@Override
	public int compare(grade o1, grade o2) {
		if(o1.count == o2.count) return o2.value - o1.value; 
		return o2.count - o1.count ;
	}
	
}

public class M41_커트라인정하기 {
	public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 
        int K = scanner.nextInt(); 
        

        List<Integer> scores = new ArrayList<>(); 
        int[] scoreArr = new int[N]; 
        
        for(int i = 0 ; i<N ; i++) {
        	int score = scanner.nextInt(); 
        	scores.add(score); 
        	scoreArr[i] = score; 
        }
        
        Collections.sort(scores);
        int result = scores.get(0) - 1; 

        Collections.reverse(scores);
        
        List<grade> g = new ArrayList<>(); 
        
        for(int P : scores) {
        	int cnt = 0; 
        	boolean checked[] = new boolean[N]; 
        	
        	for(int i = 0 ; i<N ; i++) {
        		if(scoreArr[i] >= P && !checked[i]) {
        			cnt++; 
        			checked[i] = true; 
        			
        			int left = i-1 >= 0 ? i-1 : i; 
        			int right = i+1 < N ? i+1 : i ; 
        			
        			if(!checked[left]) {
        				cnt++; 
        				checked[left] = true; 
        			}
        			
        			if(!checked[right]) {
        				cnt++; 
        				checked[right] = true; 
        			}
        			
        		}
        	}
            
            if(cnt <= K) g.add(new grade(P, cnt)); 
        }
        
        if(g.size() > 0){
            Collections.sort(g, new gradeSort());
            result = g.get(0).value; 
      
        }
        System.out.println(result); 

    }
}

