package ejJava04;
import java.util.*;
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[20];
		int num1, num2, control;
		Vectores.RellenoArray(array);
		Vectores.MostrarVector(array);
		System.out.println();
		System.out.println("Te digo los valores encontrados en un intervalo (a,b)");
		System.out.println("Dime el valor de a: ");
		num1 = sc.nextInt();
		System.out.println("Dime el valor de b: ");
		num2 = sc.nextInt();
		
		if (num2<num1) {
			control = num2;
			num2 = num1;
			num1 = control;
		}
		
		for (int i = 0; i < array.length; i++) {
			if ((array[i]>num1)&&(array[i]<num2)) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
