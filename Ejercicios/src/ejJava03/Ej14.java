package ejJava03;
import java.util.*;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2,control;
		int resta;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Algoritmo que pida dos números naturales e imprimir su cociente entero por el "
				+ "método de las restas sucesivas. ");
		System.out.println("Dime el primer numero.");
		num1 = sc.nextInt();
		System.out.println("Dime el segundo numero.");
		num2 = sc.nextInt();
		
		if (num2<num1) {
			control = num2;
			num2 = num1;
			num1 = control;
		}
		resta = num2;
		do {
			resta = resta - num1;
		} while (resta>num1);
		System.out.println("El cociente de las restas sucesivas es: " + resta);
	}

}
