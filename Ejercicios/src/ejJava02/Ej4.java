package ejJava02;

import java.util.*;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AJEDREZ");
		System.out.println("Dime dos casillas y te diren si estan en la misma fila o columna o diagonal.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la primera coordenada de la primera casilla: ");
		int a1 = sc.nextInt();
		System.out.println("Dime la segunda coordenada de la primera casilla: ");
		int a2 = sc.nextInt();
		System.out.println("Dime la primera coordenada de la segunda casilla: ");
		int b1 = sc.nextInt();
		System.out.println("Dime la segunda coordenada de la segunda casilla: ");
		int b2 = sc.nextInt();
		
		if (a1 == b1) {
			System.out.println("Estan en la misma columna");
		}
		if (a2 == b2) {
			System.out.println("Estan en la misma fila");
		}
		
		if ((a1-a2)==(b1-b2)) {
			System.out.println("Estan en la misma diagonal");
		}
		if ((a1+a2)==(b1+b2)) {
			System.out.println("Estan en la misma diagonal");
		}
		
		sc.close();
		
	}

}
