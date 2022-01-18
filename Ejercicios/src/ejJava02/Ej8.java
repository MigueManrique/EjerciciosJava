package ejJava02;
import java.util.*;
public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numHijos, sueldo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dado un sueldo y el numero de hijos, calculo los impuestos que debe de pagar segun la tabla de tramos");
		System.out.println("Dime el sueldo: ");
		sueldo = sc.nextInt();
		System.out.println("Dime el numero de hijos: ");
		numHijos = sc.nextInt();
		
		if (sueldo < 1000) {
			System.out.println("No tiene que pagar");
		}
		
		if (sueldo >20) {
			
		}
	}

}
