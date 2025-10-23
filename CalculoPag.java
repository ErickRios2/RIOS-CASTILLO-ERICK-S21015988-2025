import java.util.Scanner;

class CalculoPag{
    	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		double pagoxHoras=0, pagoFinal=0, descuentoSalud=0, tasaSalud=0.075,salarioTotal=1000000,tasaSubsidio=0.15,saldiv,subsidio;
		
		int horasTrabajadas, categoria;

		System.out.println("========== CALCULO NOMINA ==========");
		System.out.println("CATEGORIA 1 $20000 ");
		System.out.println("CATEGORIA 2 $15000 ");
		System.out.println("CATEGORIA 3 $10000 ");
		System.out.println("CATEGORIA 4 $7500 ");
		System.out.print("Elige tu categoria(1-4): ");
		categoria =sc.nextInt();
		System.out.print("Ingresa la cantidad de horas trabajadas: ");
		horasTrabajadas=sc.nextInt();

		switch(categoria){
		case 1:
			pagoxHoras=20000;
			break;
		case 2:
        		pagoxHoras=15000;
			break;
		case 3:
			pagoxHoras=10000;
			break;
		case 4:
			pagoxHoras=7500;
			break;
		default:
			System.out.println("¡ERROR! Elige una opción del 1 al 4");
		}
		
		
		saldiv = horasTrabajadas*pagoxHoras;
		
		
		descuentoSalud = saldiv * tasaSalud;
		
		if(saldiv < salarioTotal){
			subsidio = saldiv * tasaSubsidio; 
		} else {
			subsidio = 0; 
		}
		pagoFinal = saldiv - descuentoSalud + subsidio;
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("Tu salario Bruto es de: $%.2f%n", saldiv);
		System.out.printf("El descuento por salud es de: $%.2f%n", descuentoSalud);
		System.out.printf("Subsidio de: $%.2f%n", subsidio);
		System.out.println("---------------------------------------------------------");
		System.out.printf("Pago Final al empleado: $%.2f%n", pagoFinal);
		
		sc.close();
		
	}
}