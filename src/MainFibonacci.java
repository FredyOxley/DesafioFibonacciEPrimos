import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            try {
                System.out.println(String.format(Constantes.NUMERO_MAIOR_OU_IGUAL, "0", "Fibonacci"));
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Constantes.VALOR_NAO_INTEIRO);
                scanner.next();
                num = -1;
            }
        } while (num < 0);

        System.out.println(Constantes.RECURSIVA);
        try {
            System.out.println("Fibonacci de " + num + " = " + Fibonacci.fibonacciRecursiva(BigInteger.valueOf(num)));
        } catch (Exception e) {
            System.out.println(String.format(Constantes.ERRO_FIBONACCI, "recursiva", e.getMessage()));
        }

        System.out.println("\n" + Constantes.LINEAR);
        try {
            System.out.println("Fibonacci de " + num + " = " + Fibonacci.fibonacciLinear(BigInteger.valueOf(num)));
        } catch (Exception e) {
            System.out.println(String.format(Constantes.ERRO_FIBONACCI, "Linear", e.getMessage()));
        }
    }
}