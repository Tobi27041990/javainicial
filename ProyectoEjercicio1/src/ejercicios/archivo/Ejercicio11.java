package ejercicios.archivo;



import java.io.BufferedReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio11 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> jugadores = new ArrayList<String>();
		String registro, jugador = null; 
		int posicion = 0; 
		Random azar = new Random();
		
		Path file = Paths.get("‪‪C:/ficheros/loteria.txt");
		
		try (BufferedReader archivoLectura = Files.newBufferedReader(file);
             PrintWriter archivoEscritura = new PrintWriter("‪C:/ficheros/resultado.txt")) 
				{
					
				registro = 	archivoLectura.readLine();
				
				while(registro != null) {
					
					if(posicion %2==0) {
						archivoEscritura.println(registro);
					}
					
					
					jugadores.add(registro.split(",")[1]);
					registro = archivoLectura.readLine();
					posicion++;
				}
				int posicionGanadora = azar.nextInt(posicion);
				archivoEscritura.write(String.format("GANADOR: [%d] : %s", posicionGanadora, jugadores.get(posicionGanadora)));
									
						
				} catch(Exception e) 
				{
					
				
				
	}
	
		
}
	

}

