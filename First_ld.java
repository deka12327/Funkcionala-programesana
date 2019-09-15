import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

enum STATE {
    PERFECT,
    ABUNDANT,
    DEFICIENT;
}

class PerfNum {
    public static STATE detect(int k) {
        return process(k);
    }

    public static STATE process(int i) {
        int sum = IntStream
                .range(1, i)
                .filter(j -> i % j == 0)
                .sum();
        if(sum == i)
            return STATE.PERFECT;
        if (sum < i)
            return STATE.DEFICIENT;
        else
            return STATE.ABUNDANT;
    }

    public static Set<Integer> divisors(int k) {
        return IntStream
                .range(1, k + 1)
                .filter(i -> k % i == 0)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
    }
}
///////////////////////////////////////////////////////////////////////////////////
		public class First_ld {
			public static void main(String[] args) {
				System.out.println("START:");
				System.out.println("6 is "+PerfNum.detect(6));
				System.out.println("-8 is "+PerfNum.detect(-8));
				System.out.println("-15 is "+PerfNum.detect(-15));
				System.out.println("15 is "+PerfNum.detect(15));
				System.out.println("13 is "+PerfNum.detect(13));
    }
}
