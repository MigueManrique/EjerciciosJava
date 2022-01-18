package ejJava04;

import java.util.*;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean escapicua = true;
		System.out.println("Te digo si un array es capicua o no.");
		System.out.print("Dime el tamaño del array: ");
		int TAM = sc.nextInt();
		int array[] = new int[TAM];
		Vectores.PedirVector(array);

		for (int i = 0; i < array.length / 2; i++) {
			if ((array[i] != array[TAM - 1 - i])) {
				escapicua = false;
			}
		}

		if (escapicua) {
			System.out.println("El numero introducido es capicua");
		}
		if (!escapicua) {
			System.out.println("El numero introducido NO es capicua");
		}
	}

}
