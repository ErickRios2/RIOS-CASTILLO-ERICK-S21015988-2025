import java.util.Scanner;

class CalcularEdad{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int edad, añonam;
		String name;
		System.out.print("Ingresa tu nombre nombre: ");
		name= sc.nextLine();
		System.out.print("¿En que año naciste? ");
		añonam= sc.nextInt();
		edad=2025-añonam;
		System.out.println(name+", Tu edad es: " +edad);
	}
}