import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;
public class ld2_fp {
	
	enum STATE {
	    PERFECT,
	    ABUNDANT,
	    DEFICIENT;
	}

	public static STATE process(int n) {
		int sum= IntStream
				.range(1, n)
				.filter(k -> n % k == 0)
				.sum();		
	return sum ==n ? STATE.PERFECT : sum < n ? STATE.DEFICIENT : STATE.ABUNDANT;
	}

	public static Integer[] SqrtDivisors(int n){
		Integer[] div = IntStream
				.range(1, Math.toIntExact(Math.round(Math.sqrt(n))))
				.filter(k -> n % k == 0)
				.boxed()
				.toArray(Integer[]::new);
	return div;
	}
	
/////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int c;
		System.out.println("Please write number(Integer type)");
		Scanner sc=new Scanner(System.in);
		c = sc.nextInt();
		if (process(c)==STATE.PERFECT) System.out.println("PERFECT");
		else if (process(c)==STATE.DEFICIENT) System.out.println("DEFICIENT");
		else System.out.println("ABUNDANT");
		System.out.println(Arrays.toString(SqrtDivisors(c)));
		sc.close();
	}
}