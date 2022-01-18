import java.util.Scanner;
import java.math.*;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime el radio de la circunferencia: ");
		Scanner sc = new Scanner(System.in);
		double radio = sc.nextFloat();
		double longitud = 2.0 * Math.PI * radio;
		double area = Math.PI * radio * radio;
		
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
		sc.close();
		
	}

}
