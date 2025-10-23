import java.util.Scanner;

class SalarioObrero{	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double aumento, salAnt, salNuevo, incremento=0.25;
		
		System.out.print("Ingresa tu salario anterior: $");
		salAnt= sc.nextDouble();
		
		aumento=salAnt*incremento;
		salNuevo=salAnt+aumento;
		
		System.out.println("Hola obrero, aqui esta el resumen de tu salario de este mes");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("Salario anterior: $%.2f%n",salAnt);
		System.out.printf("Tu nuevo salario salario es: $%.2f%n",salNuevo);
		System.out.println("---------------------------------------------");
		System.out.println("¡Felicidades! tu salario incremento un 25%%");

		sc.close();
	}
}