import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime el radio de una esfera y te calculo su volumen: ");
		Scanner sc = new Scanner(System.in);
		double radio = sc.nextFloat();
		double volumen = radio * radio * radio;
		volumen = volumen * Math.PI * 4;
		volumen = volumen / 3.0;
		
		
		System.out.println("El volumen de la circunferencia es: " + volumen);
		sc.close();
	}

}
