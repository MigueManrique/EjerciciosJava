package ejJava03;

import java.util.*;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, resultado;
		int opcion, fin;
		boolean control = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora que implementa suma, resta, multiplicacion y division de dos operandos.");
		System.out.println("Dime el primer operando: ");
		num1 = sc.nextDouble();
		System.out.println("Dime el segundo operando: ");
		num2 = sc.nextDouble();
		do {
			System.out.println("Escribe la opcion que quieras realizar:");
			System.out.println("1.-Suma.");
			System.out.println("2.-Resta.");
			System.out.println("3.-Multiplicacion.");
			System.out.println("4.-Division.");
			System.out.println("0.-Salir del programa.");
			System.out.println("Elige tu opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				resultado = num1 + num2;
				System.out.println("El resultado de la SUMA es: " + resultado);
				break;
			case 2:
				resultado = num1 - num2;
				System.out.println("El resultado de la RESTA es: " + resultado);
				break;
			case 3:
				resultado = num1 * num2;
				System.out.println("El resultado de la MULTIPLICACION es: " + resultado);
				break;
			case 4:
				resultado = num1 / num2;
				System.out.println("El resultado de la DIVISION es: " + resultado);
				break;
			}
			System.out.println("Quieres seguir realizando operaciones: ");
			System.out.println("1.-Si");
			System.out.println("2.-No");
			fin = sc.nextInt();
			if (fin == 2) {
				control = false;
			}
		} while (control);
		sc.close();
	}

}
