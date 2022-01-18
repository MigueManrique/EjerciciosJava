package ejJava03;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, control;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos numeros enteros y te digo los multiplos de 7 comprendidos entre ellos.");
		System.out.println("Dime el primer numero.");
		num1 = sc.nextInt();
		System.out.println("Dime el segundo numero.");
		num2 = sc.nextInt();
		if (num2<num1) {
			control = num2;
			num2 = num1;
			num1 = control;
		}
		
		for (int i = num1; i <=num2; i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
	}

}
