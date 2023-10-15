public class Primos {
    private static boolean isPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primosRecursivo(int num, int atual) {
        if (atual <= num) {
            if (isPrimo(atual)) {
                System.out.print(atual + " ");
            }
            primosRecursivo(num, atual + 1);
        }
    }

    public static void primosLinear(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
