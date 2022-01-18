package ejJava03;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Te digo si un numero entero dado es perfecto o no.");
		System.out.println("Dime el numero: ");
		num = sc.nextInt();
		System.out.println("Estos son sus divisores...");
		for (int i = 1; i <num; i++) {
			if (num%i == 0) {
				System.out.println(i);
				suma +=i;
			}
		}
		System.out.println("-----------------------");
		if(suma == num) {
			System.out.println("¡El numero es perfecto!");
		}
		if(suma!=num) {
			System.out.println("El numero no es perfecto");
		}
	}

}
