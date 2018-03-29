package estructura.secuencial;

public class EjercicioEI2 {

	public static void main(String[] args) {
		/*El valor de cada variable.
		La suma  X + Y
		La diferencia  X – Y
		El producto  X * Y
		El cociente  X / Y
		El resto  X % Y 
		La suma  N + M
		La diferencia  N – M
		El producto  N * M
		El cociente  N / M
		El resto  N % M
		La suma X + N
		El cociente Y / M
		El resto Y % M
		El doble de cada variable
		La suma de todas las variables
		El producto de todas las variables
		Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y a N el valor 4.7 se debe mostrar por pantalla:
		Variable X = 1
		Variable Y = 2
		Variable M = 3.2
		Variable N = 4.7
		1 + 2 = 3
		1 - 2 = -1
		1 * 2 = 2
		1 / 2 = 0
		1 % 2 = 1
		4.7 + 3.2 = 7.9
		4.7 - 3.2 = 1.5
		4.7 * 3.2 = 15.040000000000001
		4.7 / 3.2 = 1.46875
		4.7 % 3.2 = 1.5
		1 + 4.7 = 5.7
		2 / 3.2 = 0.625
		2 % 3.2 = 2.0
		Variable X = 1 el doble es 2
		Variable Y = 2 el doble es 4
		Variable M = 3.2 el doble es 6.4
		Variable N = 4.7 el doble es 9.4
		1 + 2 + 4.7 + 3.2 = 10.9
		1 * 2 * 4.7 * 3.2 = 30.080000000000002
	*/
	
		int X=1;
		int Y=2;
		double M = 3.2;
		double N = 4.7;
		
		System.out.println("Variable X =" + X);
		System.out.println("Variable Y =" + Y);
		System.out.println("Variable N =" + N);
		System.out.println("Variable M =" + M);
		System.out.println("Suma X + Y =" + (X + Y));
		System.out.println("Producto X * Y =" + (X * Y));
		System.out.println("Cociente X / Y = " +( X / Y));
		System.out.println("Resto X % Y = " + (X % Y));
		System.out.println("Suma N + M =" + (N + M));
		System.out.println("Producto N * M =" + (N * M));
		System.out.println("Cociente N / M = " + N / M);
		System.out.println("Resto N % M =" + (N % M));
		System.out.println("Doble X =" + 2*X); 
		System.out.println("Doble Y =" + 2*Y);
		System.out.println("Doble N =" + 2*N);
		System.out.println("Doble M =" + 2*M);
		System.out.println("Suma todas todas las variables " + (X+Y+N+M) ); 
		System.out.println("Producto todas todas las variables " + (X*Y*N*M) ); 



		
		
	}

}
