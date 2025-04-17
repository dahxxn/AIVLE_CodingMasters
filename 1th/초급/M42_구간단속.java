import java.io.*;
import java.util.*;

// 11:08 - 11:27
public class M42_구간단속 {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int meter = scanner.nextInt();
		int n = scanner.nextInt();

		HashMap<String, String> startTime = new HashMap<>(); 
		HashMap<String, String> endTime = new HashMap<>(); 
		List<String> carSet = new ArrayList<>(); 
		
		for(int i = 0 ; i <n ; i++) {
			String carName = scanner.next(); 
			String start = scanner.next(); 
			startTime.put(carName, start); 
			carSet.add(carName); 
		}
		
		for(int i = 0 ; i < n ; i++) {
			String carName = scanner.next(); 
			String end = scanner.next(); 
			endTime.put(carName, end); 
		}
		
		
		carSet.sort(Comparator.comparingInt(Integer::parseInt)); 
		
		for(String carNum  :carSet) {			
			double totalTime = changeToSec(endTime.get(carNum)) - changeToSec(startTime.get(carNum)); 
			totalTime /= 3600.0; 
			
			int speed = (int)(meter/totalTime); 
			System.out.println(carNum + " " + speed); 
			
		}

	}
	
	
	public static double changeToSec(String time) {
		String[] times = time.split(":"); 
		int hh = Integer.parseInt(times[0]); 
		int mm = Integer.parseInt(times[1]); 
		int ss = Integer.parseInt(times[2]); 
		
		return hh * 3600 + mm * 60 + ss; 
		
	}
}