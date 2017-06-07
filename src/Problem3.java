import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    public void solution() {
        List<BigInteger> fibonacci100 = new ArrayList<>();

        putFibonacci(fibonacci100);

        System.out.println("First 100 Fibonacci numbers: ");
        System.out.println(fibonacci100);
    }
    private List<BigInteger> putFibonacci(List<BigInteger> list) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        list.add(a);
        list.add(b);

        for(int i = 2; i < 100; i++) {
            BigInteger big;
            big = list.get(i-2).add(list.get(i-1));
            list.add(big);
        }

        return list;
    }

}
