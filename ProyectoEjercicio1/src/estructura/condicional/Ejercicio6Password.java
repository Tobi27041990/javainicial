package estructura.condicional;

import java.util.Scanner;

public class Ejercicio6Password 
{

	
	public static void main(String[] args) 
	{
		/* 
		  * Ejemplo de programa con estructura condicional
		 * Programa que lea un carácter por teclado y compruebe si es un número
		 */
		
		String input = "";
		String mensaje = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un caracter entre 0 y 9");
		input = scan.nextLine();
		
		mensaje += validarLongitudInput(input);
		mensaje += validarInput(input);
	
	}
	
	private static String validarLongitudInput(String input) 
	{
		if (input.length() > 1) 
		{
			return "La longitud es mayor a 1 \n";
		} 
			return "";	
			
	}
	
	
	public static String validarInput(String input) 
	{
		try {
			Integer integer = new Integer(input);
			if(integer >= 0 && integer <10) {
			return "";
			}else {
					return "Es un numero invalido";
			}
			
			}catch (NumberFormatException e) {
				e.printStackTrace();
				return "El caracter no es un numero";
			}
	
	
	}	
}

	

