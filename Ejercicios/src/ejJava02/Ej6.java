package ejJava02;
import java.util.*;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		boolean control = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Determino si el año introducido es bisiesto o no.");
		System.out.println("Dime un año: ");
		year = sc.nextInt();
		
		if((year%4 ==0) && (year%100 !=0)){
			control = true;
		}else if ((year%4 ==0) && (year%100 ==0) && (year%400 ==0)) {
			control = true;
		}
		
		if (control) {
			System.out.println("El año es bisiesto.");
		}
		if (!control) {
			System.out.println("El año NO es bisiesto.");
		}
		sc.close();
	}

}
