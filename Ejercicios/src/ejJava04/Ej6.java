package ejJava04;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TAM = 10;
		int valor, posicion = -1;
		boolean encontrado;
		int array[] = new int[TAM];
		Vectores.RellenoArray(array);
		Vectores.MostrarVector(array);
		System.out.println();
		System.out.println("Dime el valor de A:");
		valor = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			encontrado = true;
			while (encontrado) {
				if ((array[i] > valor) && posicion == -1) {
					posicion = i;
					encontrado = false;
				} else {
					encontrado = false;
				}
			}

		}
		for (int i = posicion; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
