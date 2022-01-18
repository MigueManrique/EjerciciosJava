package ejJava04;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[10];
		int temp;
		Vectores.RellenoArray(array);
		System.out.println("Roto los valores de un array una posicion a la izquierda.");
		Vectores.MostrarVector(array);
		System.out.println();
		temp = array[0];
		for (int i = 1; i < array.length ; i++) {
			array[i-1]= array[i];
			if (i == array.length-1) {
				array[i] = temp; 
			}
		}
		
		Vectores.MostrarVector(array);
	}

}
