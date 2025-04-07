
import java.io.*;
import java.util.*;

//7:50-7:53
public class M38_구름별 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        String cloud = "**"; 
        for(int i = 0 ; i<a ; i++){
            System.out.println(cloud);
            cloud = " " + cloud; 
        }

    }
}

