import java.util.Scanner;

class PagLlamada{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		double tresminutos=10.00, minutoadicional=1.00,totalLlam,tiempo,cantidadPagar,minutosExtra;
		int horas;
		

		System.out.println("Hola usuario");
		System.out.print("Ingresa el tiempo que estuviste en llamada: ");
		tiempo = sc.nextInt();

		if(tiempo >= 0 && tiempo <= 3) {
			cantidadPagar = tresminutos;
			System.out.println("La cantidad total a pagar por " + tiempo + " minutos de llamada es de: $" + cantidadPagar);
		} else if (tiempo > 3) { 
			minutosExtra = tiempo - 3;
			cantidadPagar = tresminutos + (minutosExtra * minutoadicional);
			System.out.println("La cantidad total a pagar por " + tiempo + " minutos de llamada es de: $" + cantidadPagar);
		}
		sc.close();
	}
}