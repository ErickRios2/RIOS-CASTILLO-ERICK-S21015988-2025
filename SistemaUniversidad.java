import java.util.Scanner;

class SistemaUniversidad{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double cal; 
		String valoracion;

		System.out.println("NOTA NUMERICA");
		System.out.println("0.0-1.0");
		System.out.println("1.1-2.0");
		System.out.println("2.1-2.9");
		System.out.println("3.0-4.0");
		System.out.println("4.1-5.0");
		System.out.print("Igrese su calificación ");
		cal=sc.nextDouble();

		if(cal >= 0.0 && cal <= 1.0){
			System.out.println("Tu valoracion es una P (Pesimo)");
		}else if (cal >=1.1 && cal <=2.0) {
			System.out.println("Tu valoracion es una M (Mal)");
		}else if (cal >=2.1 && cal <=2.9) {
			System.out.println("Tu valoracion es una R (Regular)");
		}else if (cal >=3.0 && cal <=4.0) {
			System.out.println("Tu valoracion es una B (Bien)");
		}else if (cal >=4.1 && cal <=5.0) {
			System.out.println("Tu valoracion es una E (Excelente)");
		}else{
			System.out.println("¡ERROR! Calificacion fuera del rango(0.0 a 5.0)");
		}
		
		sc.close();			
	}
}