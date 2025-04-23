
import java.io.*;
import java.util.*;

//9:30 - 11:00 


class Rectangle {
	int x;
	int y;
	int w;
	int h;

	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public double getIoU(Rectangle b) {
		int x1 = Math.max(x, b.x);
		int y1 = Math.max(y, b.y);
		int x2 = Math.min(x + w, b.x + b.w);
		int y2 = Math.min(y + h, b.y + b.h);

		int iw = x2 - x1;
		int ih = y2 - y1;

		if (iw <= 0 || ih <= 0)
			return 0.0;

		double intersection = iw * ih;
		double union = (double) (w * h + b.w * b.h - intersection);
		if (union == 0)
			return 0.0;

		return intersection / union;
	}

}

public class M51_IoU {
	static int N;
	static List<Rectangle> rectangles = new ArrayList<>();
	static int[] pairs = { 0, 1 };
	static double maxIoU = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();

			Rectangle rect = new Rectangle(x, y, w, h);

			for (int j = 0; j < rectangles.size(); j++) {
				Rectangle other = rectangles.get(j);
				double IoU = other.getIoU(rect);

				if (IoU > maxIoU) {
					maxIoU = IoU;
					pairs[0] = j;
					pairs[1] = i;
				}

			}

			rectangles.add(rect);
		}

		System.out.printf("%d %d", pairs[0] + 1, pairs[1] + 1);

		sc.close();

	}
}
