package ejJava04;

import java.util.*;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("DADOS DOS VECTORES, CALCULO LA SUMA DE AMBOS");
		System.out.print("Dime que tamaño tienen los vectores: ");
		int TAM = sc.nextInt();
		int vector1[] = new int[TAM];
		int vector2[] = new int[TAM];
		int vectorResultado[] = new int[TAM];
		System.out.println("Dime los datos del primer vector");
		Vectores.PedirVector(vector1);
		System.out.println();
		System.out.println("Dime los datos del segundo vector");
		Vectores.PedirVector(vector2);
		for (int i = 0; i < vector2.length; i++) {
			vectorResultado[i] = vector1[i] + vector2[i];
		}

		System.out.print("La suma de los vectores es: ");
		Vectores.MostrarVector(vectorResultado);
	}

}
