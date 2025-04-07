
import java.io.*;
import java.util.*;

//7:43-7:45
public class M36_설거지담당 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        
        if(a%2==1){
            System.out.println("RUN"); 
        }else{
            System.out.println("STAY"); 
        }

    }
}

