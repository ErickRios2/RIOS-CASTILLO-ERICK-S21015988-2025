import java.util.Scanner;
import java.lang.Math; 

class EcuacionCuadratica{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cálculo de Raíces (Ax^2 + Bx + C = 0) ---");

      
        System.out.print("Ingrese el coeficiente A: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el coeficiente B: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el coeficiente C: ");
        double c = sc.nextDouble();

        

       
        if (a == 0) {
            
            System.out.println("\n--- ERROR ---");
            System.out.println("El coeficiente A no puede ser 0.");
            System.out.println("La ecuación no es cuadrática, es lineal (Bx + C = 0).");
            
        } else {
          
            double discriminante = (b * b) - (4 * a * c);

           
            if (discriminante < 0) {
                
                System.out.println("\n--- ERROR ---");
                System.out.println("Las raíces son imaginarias (complejas).");
                System.out.printf("El discriminante (b^2 - 4ac) es negativo: %.2f%n", discriminante);
                
            } else {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                
                System.out.println("\n--- Raíces Reales Encontradas ---");
                System.out.printf("Raíz 1 (x1): %.2f%n", x1);
                System.out.printf("Raíz 2 (x2): %.2f%n", x2);
            }
        }

        sc.close();
    }
}