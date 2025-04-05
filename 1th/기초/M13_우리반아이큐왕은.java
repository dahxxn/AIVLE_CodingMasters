import java.io.*;
import java.util.*; 

// 11:21 - 11:53 

class Student{
    int IQ; 
    String name; 
    int order; 
    
    public Student(String name, int IQ, int order){
        this.IQ = IQ; 
        this.name = name; 
        this.order = order; 
    }
}
    
class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if(s2.IQ == s1.IQ) return s1.order - s2.order; 
        return s2.IQ - s1.IQ; 
    }
}
    
public class M13_우리반아이큐왕은 {
   
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        int N = scanner.nextInt();

        PriorityQueue<Student> IQs = new PriorityQueue<>(new StudentComparator()); 
        
        for(int i = 0 ; i < N ; i++){
            IQs.add(new Student(scanner.next(), scanner.nextInt(), i)); 
        }
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(IQs.poll().name); 
        }

    }
}