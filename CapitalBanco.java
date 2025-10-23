import java.util.Scanner;

class CapitalBanco{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double cap, dingan,capf, tasa=0.2;

		System.out.print("Capital a invertir: ");
		cap = sc.nextDouble();

		dingan= cap*tasa;
		capf=cap + dingan;
		
		System.out.println("=====Resumen de su inversion====");
		System.out.printf("Capital invertido $%.2f%n ", cap);
		System.out.printf("Interés ganado (2%%): $%.2f%n", dingan);
        	System.out.println("---------------------------------");
        	System.out.printf("Dinero total en el banco: $%.2f%n", capf);

       
        	sc.close();


	}
}