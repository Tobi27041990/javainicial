package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero de 5 cifras: n");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		numero = validarIngreso(numero, scan);
		solucionCadena(numero);
		solucionEntero(numero);
		
		
		
	}

	private static void solucionEntero(int numero) {
		// TODO Auto-generated method stub
		
	}

	private static void solucionCadena(int numero) {
		String cadena = "" +num;
		for (int i = 0; i< cadena.toCharArray().length; i++) {
			char digito = cadena.toCharArray()[i];
			System.out.println(digito);
		}
		
	}

	private static int validarIngreso(int numero, Scanner scanner) {
		if(numero < 100000 && numero > 9999) {
			return numero;
	}else {
		System.out.println("El valor es incorrecot,  + reimgrese un numero de 5 cifras");
		numero = scanner.nextInt();
		return validarIngreso(numero, scanner);
	}

}
