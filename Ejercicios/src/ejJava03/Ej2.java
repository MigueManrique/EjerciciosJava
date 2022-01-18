package ejJava03;
import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int contador = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te escribo su tabla de multiplicar.");
		System.out.println("Introduce un numero del 1 al 10: ");
		num = sc.nextInt();
		while (contador <=10) {
			System.out.println(num +"*"+ contador +" ="+ num*contador);
			contador++;
		}
	}

}
