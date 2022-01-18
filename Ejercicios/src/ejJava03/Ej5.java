package ejJava03;
import java.util.*;
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sumo los N primeros numeros enteros que me digas.");
		System.out.println("Dime el valor de N: ");
		num = sc.nextInt();
		
		for (int i = 1; i<=num; i++) {
			suma +=i;	
		}
		System.out.println("La suma de todos los numeros es: " + suma);
	}

}
