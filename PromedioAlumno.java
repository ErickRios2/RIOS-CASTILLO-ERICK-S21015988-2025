import java.util.Scanner;

class PromedioAlumno{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String materia1, materia2,materia3;
		double cal1,cal2,cal3, promedio;

		System.out.println("===Hola estudiante===");
		System.out.println("Ingresa las 3 materias más dificiles de tu semestre");
		System.out.print("Primer Materia: ");
		materia1= sc.nextLine();
		System.out.print("Segunda Materia: ");
		materia2= sc.nextLine();
		System.out.print("Tercer Materia: ");
		materia3= sc.nextLine();
		System.out.print("Ingresa la calificacion de la materia "+materia1+": ");
		cal1= sc.nextDouble();
		System.out.print("Ingresa la calificacion de la materia "+materia2+": ");
		cal2= sc.nextDouble();
		System.out.print("Ingresa la calificacion de la materia" +materia3+": ");
		cal3= sc.nextDouble();

		promedio=(cal1+cal2+cal3)/3;

		System.out.printf("Tu promedio es: %.2f%n",promedio);

		sc.close();
	}
}