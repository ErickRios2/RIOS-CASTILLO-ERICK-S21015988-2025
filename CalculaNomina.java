import java.util.Scanner;


class CalculoNomina{
    	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double pagoxHoras, pagoFinal, descuentoSalud, tasaSalud=0.075, salarioTotal=1000000, subsidio, tasaSubsidio=0.15;
		int horasTrabajadas, categoria;

		System.out.println("========== CALCULO NOMINA ==========");
		System.out.println("CATEGORIA 1 $20000 ");
		System.out.println("CATEGORIA 2 $15000 ");
		System.out.println("CATEGORIA 3 $10000 ");
		System.out.println("CATEGORIA 4 $7500 ");
		System.out.print("Elige tu categoria(1-4): ");
		categoria =sc.nextInt();
		System.out.print("Ingresa la cantidad de horas trabajadas");
		horasTrabajadas=sc.nextInt();

		switch(categoria){
		case 1:
			categoria=20000;
			break;
		case 2:
        		categoria=15000;
			break;
		case 3:
			categoria=10000;
			break;
		case 4:
			categoria=7500;
			break;
		default:
			System.out.println("¡ERROR! Elige una opción del 1 al 4");
		}
		pagoxHoras = horasTrabajadas*categoria;
		
	}
}