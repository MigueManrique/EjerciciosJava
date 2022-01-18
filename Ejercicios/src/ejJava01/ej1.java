package ejJava01;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Dime dos numeros");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Estos son tus dos numeros:");
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}
