package ejJava02;
import java.util.*;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a1, a2, b1, b2, c1, c2;
		
		System.out.println("ax + by + c = 0");
		System.out.println("Dime los parametros a, b ,c de la primera recta");
		System.out.println("Dime el valor de a: ");
		a1 = sc.nextDouble();
		System.out.println("Dime el valor de b: ");
		b1 = sc.nextDouble();
		System.out.println("Dime el valor de c: ");
		c1 = sc.nextDouble();
		System.out.println("Dime los parametros a, b ,c de la segunda recta");
		System.out.println("Dime el valor de a: ");
		a2 = sc.nextDouble();
		System.out.println("Dime el valor de b: ");
		b2 = sc.nextDouble();
		System.out.println("Dime el valor de c: ");
		c2 = sc.nextDouble();
		
		if ((a1/a2)!=(b1/b2)) {
			System.out.println("Las rectas son secantes");
		}
		 
		if (((a1/a2)==(b1/b2)) && ((b1/b2)!=(c1/c2))) {
			System.out.println("Las rectas son paralelas");
		}
		
		if (((a1/a2)==(b1/b2)) && ((b1/b2)==(c1/c2))) {
			System.out.println("Las rectas son coincidentes");
		}
		sc.close();
	}

}
