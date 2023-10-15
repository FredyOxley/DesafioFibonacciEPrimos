import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static final Map<BigInteger, BigInteger> memorizar = new HashMap<>();

    public static BigInteger fibonacciRecursiva(BigInteger num) {
        if (num.compareTo(BigInteger.TWO) < 0) {
            return num;
        }

        if (memorizar.containsKey(num)) {
            return memorizar.get(num);
        }

        BigInteger result = fibonacciRecursiva(num.subtract(BigInteger.ONE)).add(fibonacciRecursiva(num.subtract(BigInteger.TWO)));
        memorizar.put(num, result);

        return result;
    }

    public static BigInteger fibonacciLinear(BigInteger num) {
        if (num.equals(BigInteger.ZERO)) return BigInteger.ZERO;
        if (num.equals(BigInteger.ONE)) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            result = a.add(b);
            a = b;
            b = result;
        }

        return result;
    }
}
