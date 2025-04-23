
import java.io.*;
import java.util.*;

// 5:30 - 6:16 
public class M54_먹보수민이 {
	static int convCnt;
	static HashMap<Integer, Integer> convVal;
	static int target;
	static int currentVal;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		convCnt = sc.nextInt();
		convVal = new HashMap<>();
		for (int i = 0; i < convCnt; i++) {
			int pos = sc.nextInt(); // 위치
			int val = sc.nextInt(); // 포만감

			convVal.put(pos, val);
		}

		List<Integer> keyList = new ArrayList<>(convVal.keySet());
		Collections.sort(keyList); // 위치 오름차순 정렬

		target = sc.nextInt(); // 식당 위치
		currentVal = sc.nextInt(); // 현재 포만감

		
		List<Integer> convStore = new ArrayList<>(); 
		int count = 0; 
		int keyIdx = 0; 
		
		
		while(currentVal < target) {
			for(; keyIdx < keyList.size() && keyList.get(keyIdx) <=  currentVal;  keyIdx ++) {
				int conv = keyList.get(keyIdx); 
				convStore.add(conv); 
			}
			
			if(convStore.isEmpty()) break; 
			Collections.sort(convStore, new Comparator<>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return convVal.get(o2) - convVal.get(o1);
				}
			});
//			System.out.println("pos : " + currentVal + "target : " + target);
//			System.out.println("checkpoint : " + convStore.get(0)); 
//			
			currentVal += convVal.get(convStore.get(0)); 
			convStore.remove(0); 
			count++; 
			
		}
		
		count = currentVal >= target ? count: -1; 
		System.out.println(count); 
	}
}
