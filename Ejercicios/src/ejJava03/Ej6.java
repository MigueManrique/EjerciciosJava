package ejJava03;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int factorial;
		Scanner sc = new Scanner(System.in);
		System.out.println("Te calculo el factorial de un numero.");
		System.out.println("Dime el valor: ");
		num = sc.nextInt();
		factorial = num;
		for (int i = num-1; i > 0; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
