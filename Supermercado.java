import java.util.Scanner;

class Supermercado{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double descuento1=0.15, descuento2=0.20, totalCompra=0.0, compra, descuento=0.0; 
		int num;
		
		System.out.println("========BIENVENIDO=======");
		System.out.print("Ingresa el valor de tus compras: $");
		compra= sc.nextDouble();
		System.out.println("=====¡¡¡HOY ES TU DÍA DE SUERTE!!!=====");
		System.out.println("========TE TENEMOS UNA PROMOCION========");
		System.out.println(" Elige un numero al azar, ¡El que tu quieras!: ");
		num = sc.nextInt();

		if (num < 74) {
			descuento = compra*descuento1;
			totalCompra = compra-descuento;
		} else if ( num >= 74) {
			descuento = compra*descuento2;
			totalCompra = compra-descuento;
		}	 
			
		System.out.println("TICKET COMPRA");	
		System.out.println("------------------------------");
		System.out.println("Tu pago inicial  es de: $"+compra);
		System.out.printf("Descuento: $%.2f%n",descuento);
		System.out.println("------------------------------");
		System.out.printf("La cantidad final a pagar es de: $%.2f%n",totalCompra);
		
		sc.close();
		
	}
}