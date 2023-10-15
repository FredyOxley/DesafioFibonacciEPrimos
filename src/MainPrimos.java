import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPrimos {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        do {
            try {
                System.out.println(String.format(Constantes.NUMERO_MAIOR_OU_IGUAL, "2", "primos"));
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Constantes.VALOR_NAO_INTEIRO);
                scanner.next();
                num = -1;
            } catch (Exception e) {
                System.out.println(Constantes.ERRO_INESPERADO);
                scanner.next();
                num = -1;
            }
        } while (num < 2);

        System.out.println(Constantes.RECURSIVA);
        Primos.primosRecursivo(num, 2);

        System.out.println("\n");

        System.out.println(Constantes.LINEAR);
        Primos.primosLinear(num);
        scanner.close();
    }
}
