package ejJava03;
import java.util.*;
public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Imprimo los divisores de un numero entero introducido por teclado.");
		System.out.println("Dime el numero: ");
		num = sc.nextInt();
		
		for (int i = 1; i <=num; i++) {
			if (num%i == 0) {
				System.out.println(i);
			}
		}
	}

}
