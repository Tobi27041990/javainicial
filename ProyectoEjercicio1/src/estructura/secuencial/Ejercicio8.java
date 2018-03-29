package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio8 {

	
	public static void main(String[] args) {
		
		double radio, volumen; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el radio de la esfera: ");
		radio = scan.nextDouble();
		volumen = solveVolume(radio);
		System.out.println("La esfera: " + (volumen/10));
		
		
	}
	
	private static double solveVolume(double radio) {
		
		double volume = 4 * Math.PI * Math.pow(radio, 3) / 3;
		return volume; 
	}
}
