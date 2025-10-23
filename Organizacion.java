import java.util.Scanner;
import java.text.NumberFormat; // Para formatear como moneda

public class CalculoNomina {

    public static void main(String[] args) {

        // --- 1. Definición de Constantes ---
        final double TASA_SALUD = 0.072;      // 7.2%
        final double TASA_SUBSIDIO = 0.15;    // 15%
        final double UMBRAL_SUBSIDIO = 1000000; // 1,000,000

        // --- 2. Inicialización de Herramientas ---
        Scanner sc = new Scanner(System.in);
        // Usamos NumberFormat para mostrar los resultados como moneda (ej. $1,000,000.00)
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        // --- 3. Obtener Entradas del Usuario ---
        System.out.println("--- Cálculo de Salario Mensual ---");
        System.out.print("Ingrese la categoría del empleado (1-4): ");
        int categoria = sc.nextInt();

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = sc.nextInt();

        // --- 4. Determinar Salario por Hora ---
        double salarioPorHora = 0.0;

        // Usamos un 'switch' para asignar el valor base según la categoría
        switch (categoria) {
            case 1:
                salarioPorHora = 20000;
                break;
            case 2:
                salarioPorHora = 15000;
                break;
            case 3:
                salarioPorHora = 10000;
                break;
            case 4:
                salarioPorHora = 7500;
                break;
            default:
                // Si la categoría no es 1-4, salarioPorHora se mantiene en 0
                System.out.println("\nError: La categoría ingresada no es válida.");
                break;
        }

        // --- 5. Realizar Cálculos (Solo si la categoría fue válida) ---
        if (salarioPorHora > 0) {
            
            // 5.1. Salario Bruto (Total devengado, sin descuentos)
            double salarioBruto = salarioPorHora * horasTrabajadas;

            // 5.2. Descuento de Salud
            double descuentoSalud = salarioBruto * TASA_SALUD;

            // 5.3. Subsidio
            double subsidio = 0.0; // Se inicializa en 0
            
            // "si el salario total devengado (mensual) es menos de 1´000.000"
            if (salarioBruto < UMBRAL_SUBSIDIO) {
                // "se le da un subsidio del 15% sobre su salario mensual (sin descuentos)"
                subsidio = salarioBruto * TASA_SUBSIDIO;
            }

            // 5.4. Salario Neto (El pago final)
            double salarioNeto = salarioBruto - descuentoSalud + subsidio;

            // --- 6. Mostrar Resultados ---
            System.out.println("\n--- Resumen de Pago ---");
            System.out.println("Categoría: \t\t" + categoria);
            System.out.println("Horas trabajadas: \t" + horasTrabajadas);
            System.out.println("Tarifa por hora: \t" + formatter.format(salarioPorHora));
            System.out.println("---------------------------------");
            
            // Usamos formatter.format() para mostrar los números como dinero
            System.out.println("Salario Bruto: \t\t" + formatter.format(salarioBruto));
            System.out.println("Descuento Salud (7.2%%): \t-" + formatter.format(descuentoSalud));
            
            if (subsidio > 0) {
                System.out.println("Subsidio (15%%): \t\t+" + formatter.format(subsidio));
            } else {
                System.out.println("Subsidio (No aplica): \t" + formatter.format(0));
            }
            
            System.out.println("---------------------------------");
            System.out.println("SALARIO NETO A PAGAR: \t" + formatter.format(salarioNeto));
        }

        sc.close();
    }
}