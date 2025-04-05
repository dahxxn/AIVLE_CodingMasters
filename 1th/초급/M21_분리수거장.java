import java.io.*;
import java.util.*; 

// 12 : 32 - 12 : 50

class Apart{
    int pos;
    int peopleCount; 
    int index; 
    
    public Apart(int pos, int peopleCount, int index){
        this.pos = pos;
        this.peopleCount = peopleCount; 
        this.index = index; 
    }
}

class ApartSort implements Comparator<Apart>{
    @Override
    public int compare(Apart a1, Apart a2){
        return a1.pos - a2.pos; 
    }
}

public class M21_분리수거장 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt(); 

        List<Apart> aparts = new ArrayList<>(); 
        
        int totalPeople = 0; 
        for(int i = 1 ; i<=N ; i++){
            int pos = scanner.nextInt();
            int peopleCount = scanner.nextInt(); 
            
            aparts.add(new Apart(pos,peopleCount, i)); 
            totalPeople += peopleCount; 
        }
        
        Collections.sort(aparts, new ApartSort()); 

        int currentPeople = 0; 
        int answer = 0; 
        for(Apart ap : aparts){
            currentPeople += ap.peopleCount; 
            if(currentPeople > (totalPeople+1)/2){
                answer = ap.index; 
                break; 
            }
            
        }
        
        System.out.println(answer); 

    }
}