package ejJava02;
import java.util.*;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		boolean control = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Determino si el a�o introducido es bisiesto o no.");
		System.out.println("Dime un a�o: ");
		year = sc.nextInt();
		
		if((year%4 ==0) && (year%100 !=0)){
			control = true;
		}else if ((year%4 ==0) && (year%100 ==0) && (year%400 ==0)) {
			control = true;
		}
		
		if (control) {
			System.out.println("El a�o es bisiesto.");
		}
		if (!control) {
			System.out.println("El a�o NO es bisiesto.");
		}
		sc.close();
	}

}
