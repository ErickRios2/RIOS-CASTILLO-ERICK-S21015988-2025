import java.util.Scanner;

class Pulsaciones{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int edad;
		double pulsaciones;

		System.out.print("Ingresa tu edad: ");
		edad = sc.nextInt();
		pulsaciones = (220*edad)/10;

		System.out.printf(" El numero de pulsaciones por segundo de ejercicio es: %.0f%n",pulsaciones);
		
		sc.close();
	}
}