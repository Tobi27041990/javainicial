package estructura.secuencial;

public class EjercicioEI3 {

	public static void main(String[] args) {
		
		/*Escribe un programa Java que declare una variable entera N y as�gnale un valor. A continuaci�n escribe las instrucciones que realicen los siguientes:
			Incrementar N en 77. 
			Decrementarla en 3. 
			Duplicar su valor. 
			Si por ejemplo N = 1 la salida del programa ser�:
			Valor inicial de N = 1
			N + 77 = 78
			N - 3 = 75
			N * 2 = 150
		*/
		
		int N = 5;
		System.out.println("Variable N = " + N);
		N +=77;
		System.out.println("N + 77 = " + N);
		N -=3;
		System.out.println("N - 3 =" + N);
		N*=2;
		System.out.println("N * 2 = " + N);
		
	}

}
