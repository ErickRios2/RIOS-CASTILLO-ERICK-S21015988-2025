import java.util.Scanner;

class Hospital{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double presupuesto, porGin=0.40, porTrau=0.30, porPedi=0.30, presGin, presTrau,presPed;

		System.out.print("Ingrese el total de su presupuesto para el hospital: $");
		presupuesto = sc.nextDouble();

		presGin= presupuesto*porGin;
		presTrau=presupuesto*porTrau;
		presPed=presupuesto*porPedi;

		System.out.println("Su presupuesto es de: $"+presupuesto);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("El area de Ginecología recibe un total de: $"+presGin+ " (40&) del monto presupuestal");
		System.out.println("El area de Traumatologia recibe un total de: $"+presTrau+ " (30%) del monto presupuestal");
		System.out.println("El area de Pediatra recibe un total de: $"+presPed+ " (30%) del monto presupuestal");

		sc.close();
	}
}