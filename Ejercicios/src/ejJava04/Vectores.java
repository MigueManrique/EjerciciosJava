/**
 * 
 */
package ejJava04;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Vectores {
	
	public static void PedirVector(double[] vector) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Dime un numero: ");
			vector[i] = sc.nextInt();
		}
	}
	
	public static void PedirVector(int[] vector) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Dime un numero: ");
			vector[i] = sc.nextInt();
		}
	}
	
	public static void MostrarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+ " ");
		}
	}
	
	public static void RellenoArray(int[] array) {
		Random rng = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(100);
		}
	}
	
	public static void RellenoArray(double[] array) {
		Random rng = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rng.nextDouble(100);
		}
	}
	
}
