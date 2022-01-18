package ejJava04;

import java.util.Random;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int num;
				Random rng = new Random();
				System.out.println("Visualizo por pantalla todos los elementos del array"
						+ "cuyo valor sea menor que un número A.");
				System.out.println("Dime el valor de A: ");
				num = sc.nextInt();
				int array[] = new int[10];

				for (int i = 0; i < array.length; i++) {
					array[i] = rng.nextInt(100);

				}
				System.out.println("Estos son los numeros guardados:");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i]+ " ");
				}
				System.out.println();
				System.out.println("Estos son los numeros guardados menores que "+ num+ ":");
				for (int i = 0; i < array.length; i++) {
					if (num > array[i]) {
						System.out.print(array[i]+ " ");
					}
				}
				
				
				sc.close();
	}

}
