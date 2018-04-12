package estructura.condicional;

import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		
		/* 
		  * Ejemplo de programa con estructura condicional
		 * Programa que lea un carácter por teclado y compruebe si es un número
		 */
		
		String input = "";
		System.out.println("Ingrese un caracter entre 0 y 9");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		validarLongitudInput(input);
		validarInput(input);
	
	}
	
	private static void validarLongitudInput(String input) {
		if (input.length() > 1)
		{
			System.out.println("El numero tiene mas que un caracter");
		} else {
			validarInput(input);
		}	
	}
	
	
	public static void validarInput(String input) 
	{
		try {
			Integer integer = new Integer(input);
			if(integer >= 0 && integer <10) {
			System.out.println();
			}else {
					System.out.println("Es un numero invalido");
			}
			
			}catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("El caracter no es un numero");
			}
	
	
	}
	
	
		
		
	}


