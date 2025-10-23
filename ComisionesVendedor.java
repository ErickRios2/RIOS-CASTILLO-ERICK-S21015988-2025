import java.util.Scanner;

public class ComisionesVendedor{

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        double comisionTotal = 0.0;
        double valorVenta;
        double comisionVenta; 

        System.out.println("--- Cálculo de Comisiones (Total 4 Ventas) ---");

       
        System.out.println("----- Venta #1 -----");
        System.out.print("Ingrese el valor de la venta: $");
        valorVenta = sc.nextDouble(); 

        if (valorVenta <= 10000000) {
            comisionVenta = valorVenta * 0.02;
        } else if (valorVenta < 15000000) { 
            comisionVenta = valorVenta * 0.04;
        } else {
            comisionVenta = valorVenta * 0.10;
        }
        
        System.out.printf("Comisión por esta venta: $%.2f%n", comisionVenta);
        comisionTotal = comisionTotal + comisionVenta; 

       
        System.out.println("----- Venta #2 -----");
        System.out.print("Ingrese el valor de la venta: $");
        valorVenta = sc.nextDouble(); 

        if (valorVenta <= 10000000) {
            comisionVenta = valorVenta * 0.02;
        } else if (valorVenta < 15000000) { 
            comisionVenta = valorVenta * 0.04;
        } else {
            comisionVenta = valorVenta * 0.10;
        }
        
        System.out.printf("Comisión por esta venta: $%.2f%n", comisionVenta);
        comisionTotal = comisionTotal + comisionVenta; 

        
        System.out.println("----- Venta #3 -----");
        System.out.print("Ingrese el valor de la venta: $");
        valorVenta = sc.nextDouble(); 

        
        if (valorVenta <= 10000000) {
            comisionVenta = valorVenta * 0.02;
        } else if (valorVenta < 15000000) { 
            comisionVenta = valorVenta * 0.04;
        } else {
            comisionVenta = valorVenta * 0.10;
        }
        
        System.out.printf("Comisión por esta venta: $%.2f%n", comisionVenta);
        comisionTotal = comisionTotal + comisionVenta; 

        System.out.println("----- Venta #4 -----");
        System.out.print("Ingrese el valor de la venta: $");
        valorVenta = sc.nextDouble(); 

    
        if (valorVenta <= 10000000) {
            comisionVenta = valorVenta * 0.02;
        } else if (valorVenta < 15000000) { 
            comisionVenta = valorVenta * 0.04;
        } else {
            comisionVenta = valorVenta * 0.10;
        }
        
        System.out.printf("Comisión por esta venta: $%.2f%n", comisionVenta);
        comisionTotal = comisionTotal + comisionVenta; 

        
       
        System.out.println("\n========================================");
        System.out.println("¡Se registraron las 4 ventas!");
        System.out.printf("La COMISIÓN TOTAL ganada es: $%.2f%n", comisionTotal);
        System.out.println("========================================");

        sc.close();
    }
}