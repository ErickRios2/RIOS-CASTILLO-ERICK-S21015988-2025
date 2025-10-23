import java.util.Scanner;

class DescuentoTienda{			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double c,d=0.15,montod,pf;

		System.out.print("Ingrese el valor de su compra: ");
		c=sc.nextDouble();

		montod=c*d;
		pf=c-montod;		 
		
		System.out.println("\n--- Resumen del Pago ---");
        	System.out.printf("Total de la compra: $%.2f%n", c);
        	System.out.printf("Descuento del 15%%:   $%.2f%n", montod);
        	System.out.println("------------------------");
        	System.out.printf("Total a pagar:      $%.2f%n", pf);

		sc.close();
	}
}