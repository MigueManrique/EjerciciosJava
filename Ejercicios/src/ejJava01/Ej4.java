package ejJava01;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime una temperatura en ºC y la pasare a ºF");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = 9*a;
		b = b/5;
		b += 32;
		System.out.println("La temperatura en ºF es de: " + b);
	}

}
