import java.util.Scanner;

class Circulo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double radio, longitud, area;

		System.out.print("Ingresa el valor del radio: ");
		radio = sc.nextDouble();

		longitud = 2*3.141592653589793*radio;
		area = 3.141592653589793*radio;

		System.out.printf("La longitud de la circunferencia es: %.2f%n",longitud);
		System.out.printf("El area del circulo es: %.2f%n",area);

		sc.close();
	}
}