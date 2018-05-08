package ejercicio1;

public class Ejercicio3 {

	public static void main(String[] args) {
	    String name = "Nombre,Apellido";
	    
	    int posicionComa = name.indexOf(',');
	    
	    System.out.println(name.substring(0, posicionComa));
	}

}
