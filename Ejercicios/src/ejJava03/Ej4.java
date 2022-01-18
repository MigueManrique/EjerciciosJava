package ejJava03;
import java.util.*;
public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, control;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos numeros enteros y te digo los numeros primos comprendidos entre ellos.");
		System.out.println("Dime el primer numero.");
		num1 = sc.nextInt();
		System.out.println("Dime el segundo numero.");
		num2 = sc.nextInt();
		if (num2<num1) {
			control = num2;
			num2 = num1;
			num1 = control;
		}
		num1++;
		do {
			for (int i = 2; i < num2; i++) {
				if (num1%i==0) {
					contador++;
				}
			}
			if (contador == 1) {
				System.out.println(num1);
			}
			num1++;
			contador = 0;
		} while (num1<num2);
		

		
	}

}
