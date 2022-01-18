package ejJava04;

import java.util.Iterator;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("COPIO UN ARRAY DE FORMA INVERSA");
		System.out.print("Dime el tamaño del array: ");
		int TAM = sc.nextInt();
		int array[] = new int[TAM];
		int copia[] = new int[TAM];
		Vectores.RellenoArray(array);
		Vectores.MostrarVector(array);
		System.out.println();
		for (int i = TAM - 1; i >= 0; i--) {
			
			copia[TAM - 1 - i] = array[i];
		}
		Vectores.MostrarVector(copia);

		System.out.println();
		sc.close();
	}

}
