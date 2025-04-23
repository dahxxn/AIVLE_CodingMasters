
import java.io.*;
import java.util.*;

// 9 - 9:25 
class customer {
	int arrive;
	int leave;

	public customer(int arrive, int leave) {
		this.arrive = arrive;
		this.leave = leave;
	}
}

public class M65_카페사장철수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maxP = sc.nextInt();
		int totalCnt = sc.nextInt();

		List<customer> customers = new ArrayList<>();
		for (int i = 0; i < totalCnt; i++) {
			String arriveT = sc.next();
			String leaveT = sc.next();

			customers.add(new customer(timeToSec(arriveT), timeToSec(leaveT)));
		}

		Collections.sort(customers, new Comparator<>() {

			@Override
			public int compare(customer o1, customer o2) {
				return o1.arrive - o2.arrive;
			}

		});

		int people = 0;
		int usage = 0;
		int time = 0;

		boolean[] iscafe = new boolean[totalCnt];

		for (int idx = 0; idx < totalCnt; idx++) {
			customer c = customers.get(idx);
			time = c.arrive;

			// 나간 사람이 있는지 체크
			
			for (int i = 0; i < totalCnt; i++) {
				if (iscafe[i] && customers.get(i).leave <= time) {
					iscafe[i] = false;
					people--;
				}
			}
			
			// 사람 들어올 수 있는지 체크
			if (people < maxP) {
				iscafe[idx] = true;
				people++;
				usage++;
			}
		}

	System.out.println(usage);

	}

	static int timeToSec(String hhmmss) {
		String[] times = hhmmss.split(":");
		int h = Integer.parseInt(times[0]);
		int m = Integer.parseInt(times[1]);
		int s = Integer.parseInt(times[2]);

		return 3600 * h + 60 * m + s;
	}
}
