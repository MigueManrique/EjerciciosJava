package ejJava02;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime tres numeros enteros y te dire si forman un triangulo");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int semiperimetro = num1 + num2 + num3;
		semiperimetro = semiperimetro/2;
		double resultado;
		resultado = (semiperimetro - num3) * (semiperimetro -num2) * (semiperimetro - num1);
		resultado = Math.sqrt(resultado);
		
		if (resultado>0) {
			System.out.println("Estos tres lados SI forman un triangulo");
		}else {
			System.out.println("Estos tres lados NO forman un triangulo");
		}
		
		sc.close();

	}

}
