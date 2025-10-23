import java.util.Scanner;

class Alumnos{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double total, mujeres, hombres,porhom, pormuj;
		

		System.out.println("======¡Hola Maestro!======");
		System.out.print("Ingrese la cantidad de hombres que hay en el grupo: ");
		hombres=sc.nextDouble();
		System.out.print("Ingrese la cantidad de mujeres que hay en el grupo: ");	
		mujeres=sc.nextDouble();
		
		total=hombres+mujeres;
		porhom=(hombres/total)*100;
		pormuj=(mujeres/total)*100;
		
		System.out.println("==============================================================================");
		System.out.printf("El total de estudiantes es de %.0f%n",total);
		System.out.printf("El porcentaje de estudiantes hombres que hay en el grupo es de: %.2f%n", porhom);
		System.out.printf("El porcentaje de estudiantes mujeres que hay en el grupo es de: %.2f%n", pormuj);

		sc.close();
	}
}