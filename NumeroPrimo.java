import java.util.Scanner;

class NumeroPrimo {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        boolean esPrimo;
        int i;

        System.out.print("Ingrese un número entero (N): ");
        n = sc.nextInt();

        System.out.println("El número ingresado fue: " + n);

        esPrimo = true;

        if (n < 2) {
            esPrimo = false;
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo == true) {
            System.out.println("El número es: Primo");
        } else {
            System.out.println("El número es: No es Primo");
        }

        sc.close();
    }
}