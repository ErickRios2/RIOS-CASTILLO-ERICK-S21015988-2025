import java.util.Scanner;

class ValorMayor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double v1, v2, v3, promedio;
        double may, men;

        System.out.print("Ingrese el primer valor: ");
        v1 = sc.nextDouble();
        System.out.print("Ingresa el segundo valor: ");
        v2 = sc.nextDouble();
        System.out.print("Ingresa el tercer valor: ");
        v3 = sc.nextDouble();

        
        promedio = (v1 + v2 + v3) / 3.0; 
        if (v1 == v2 && v2 == v3) {
            
            System.out.println("Los tres numeros son iguales.");
            may = v1;
            men = v1;
            
        } else {
            
           
            if (v1 >= v2 && v1 >= v3) {
                may = v1;
            } else if (v2 >= v1 && v2 >= v3) {
                may = v2;
            } else {
                may = v3;
            }

            if (v1 <= v2 && v1 <= v3) {
                men = v1;
            } else if (v2 <= v1 && v2 <= v3) {
                men = v2;
            } else {
                men = v3;
            }
        }
        System.out.printf("El número MAYOR es: %.2f%n", may);
        System.out.printf("El número MENOR es: %.2f%n", men);
        System.out.printf("El PROMEDIO de los tres es: %.2f%n", promedio);

        sc.close();
    }
}