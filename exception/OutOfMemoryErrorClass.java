package exception;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorClass {

	public static void main(String[] args) {
		
		
		List<String>  lista= new ArrayList<String>();
		while(true) {
			try {
				lista.add("Elemento");
			} catch (OutOfMemoryError e) {

				System.out.println(lista.size());
				e.printStackTrace();
				break; 
			}
		
		if(lista.size() % 100000 == 0) {
			
			System.out.println("El muliple de 1 millon " + lista.size());
			
		}
		

	}
		
		
	}
	
}
