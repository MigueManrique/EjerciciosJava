package ejJava03;
import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dime un numero y te escribo su tabla de multiplicar.");
			System.out.println("Introduce un numero del 1 al 10: ");
			num = sc.nextInt();
		}while ((num<1)||(num>10));
		
		for (int i = 1; i <=10; i++) {
			System.out.println(num +"*"+ i +" ="+ num*i);
		}
	}
}


