import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime una velocidad en km/h: ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double res = 10*a;
		res = res/36;
		System.out.println("La velocidad en m/s es de: " + res);
		sc.close();
	}

}
