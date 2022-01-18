package ejJava04;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tam;
		System.out.println("Relleno un array de enteros dados por teclado");
		System.out.println("Dime el tamaño que tendra el array: ");
		tam = sc.nextInt();
		int array[] = new int[tam];

		Vectores.PedirVector(array);
		System.out.println("Estos son los numeros guardados:");
		Vectores.MostrarVector(array);
		sc.close();
	}

}
