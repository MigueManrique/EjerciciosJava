import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime dos catetos y te calculo la hipotenusa: ");
		Scanner sc = new Scanner(System.in);
		double cateto1 = sc.nextDouble();
		double cateto2 = sc.nextDouble();
		double resultado = cateto1*cateto1 + cateto2*cateto2;
		resultado = Math.sqrt(resultado);
		System.out.println("La hipotenusa es: " + resultado);
		sc.close();
	}

}
