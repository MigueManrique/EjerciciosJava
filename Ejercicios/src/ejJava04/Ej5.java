package ejJava04;

import java.util.Iterator;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TAM = 5;
		int array[] = new int[TAM];
		int temp;
		Vectores.RellenoArray(array);
		System.out.println("Roto los valores de un array una posicion a la derecha.");
		Vectores.MostrarVector(array);
		System.out.println();
		
		temp = array[TAM-1];
		for (int i = TAM-1; i > 0; i--) {
			array[i]= array[i-1];
			if (i==1) {
				array[0]= temp;
			}
		}
		
		Vectores.MostrarVector(array);
	}

}
