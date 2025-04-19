
import java.io.*;
import java.math.*;
import java.util.*;

// 8:02 - 
public class M47_분수를소수로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		long p = sc.nextLong(); 
		long q = sc.nextLong(); 
		int n = sc.nextInt(); 
		
		 // BigDecimal로 변환
        BigDecimal numerator = new BigDecimal(p);
        BigDecimal denominator = new BigDecimal(q);
        BigDecimal result = numerator.divide(denominator, n, RoundingMode.HALF_UP);

        System.out.println(result.toPlainString());
		
	}
}
//
//0.3198484848484848484848484848484848484848484848484848484848484848484848484848484848484848484848484848
//0.31984848484848484848484848484848484848484848484848484848484848484848484848484848484848484848484848485
