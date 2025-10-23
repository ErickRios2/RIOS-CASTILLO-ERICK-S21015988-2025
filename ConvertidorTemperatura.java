import java.util.Scanner;

class ConvertidorTemperatura{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double c,f,tempabs;
		
		System.out.print("Ingrese su temperatura en grados centigrados: ");
		c=sc.nextDouble();
		f= (c*1.8)+32;
		tempabs= c+273.15;
		System.out.println("La temperatura de: "+c+ " equivale a:");
		System.out.printf("Grados farhrenheit: %.2f%n",f);
		System.out.printf("Temperatura absoluta: %.2f%n",tempabs);

		sc.close();
	}
}