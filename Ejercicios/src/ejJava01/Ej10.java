package ejJava01;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el precio del articulo: ");
		double precio = sc.nextDouble();
		System.out.println("Dime el importe dado: ");
		double importe = sc.nextDouble();
		double cambio;
		if (precio <= importe) {
			cambio = importe - precio;
			System.out.println("El cambio que debe dar es de: " + cambio);
		}else {
			System.out.println("El precio del articulo es mayor al importe");
		}
		sc.close();
	}

}
