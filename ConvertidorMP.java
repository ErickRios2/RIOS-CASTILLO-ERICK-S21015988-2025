import java.util.Scanner;

class ConvertidorMP{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double m,p,pul,form1,form2;

		System.out.println("======== CONVERTIDOR DE METROS A PIES Y PULGADAS ========");
		System.out.print("Ingrese la cantidad de metros que usted quiere convertir a pies y pulgadas: ");
		m = sc.nextDouble();

		form1= m*3.28084;
		form2= m*39.3701; 

		System.out.println("La cantidad de "+m+"mts, Equivalen a:");
		System.out.printf("Pies = %.2f%n",form1);
		System.out.printf("Pulgadas = %.2f%n",form2);

		sc.close();
	}
}