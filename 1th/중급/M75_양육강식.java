import java.util.*;

class shark{
	int i; 
	int size; 
	
	public shark(int i, int size) {
		this.i = i; 
		this.size = size; 
	}
}

public class M75_양육강식 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] sharks = new int[N];
        int[] sharksCopy = new int[N];
        List<shark> sharkList = new ArrayList<>(); 
        
        for (int i = 0; i < N; i++) {
            sharks[i] = sc.nextInt();
            sharkList.add(new shark(i, sharks[i])); 
        }

        Collections.sort(sharkList, new Comparator<>() {

			@Override
			public int compare(shark o1, shark o2) {
				// TODO Auto-generated method stub
				return o1.size - o2.size;
			}

        });
        
        int cnt=0; 
        int currentMax = 0; 
        int currentMaxIndex = -1; 
        
        for(shark s : sharkList) {
        	System.out.println(currentMaxIndex + " ) " + s.i + " , " + s.size ); 
        	
        	System.out.println(currentMaxIndex < s.i); 
        	if(currentMaxIndex < s.i) {
        		cnt+=1; 
        		currentMaxIndex = s.i; 
        	}
        	
        }
        
        System.out.println(cnt); 
        
//        Arrays.fill(sharksChain, 1);
//
//        int max = 1;
//        
//        for (int i = 1; i < N; i++) {
//            for (int j = 0; j < i; j++) { 
//                if (sharks[j] < sharks[i]) { 
//                	sharksChain[i] = Math.max(sharksChain[i], sharksChain[j] + 1);
//                }
//            }
//            max = Math.max(max, sharksChain[i]);
//        }
//
//        System.out.println(max == 1 ? 0 : max);
//    }
    }
}
