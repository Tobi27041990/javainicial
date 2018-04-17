
//Programa
package trabajo.practico;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Alumno {

	public static void main(String[] args) {
		if(args.length !=2) {
		
			
			System.out.println("ERROR: El programa espera dos parametros");
			System.out.println("Ejemplo Programa <pathArchivo>nota");
			System.exit(-1);
		}else {
			
			//validar que el path sea valid
		}
		String pathArchivo = args[1];
		String nota = args[2];
		
		//hier das 
		
		Path file = Paths.get("C:\\prueba","mi primer archivo.txt");
    	ArrayList<String> lista = new ArrayList<String>();
    	String resultadoValidacionCampo = "";
    	try (BufferedReader reader = Files.newBufferedReader(file)) {
    	    String line = null;
    	    while ((line = reader.readLine()) != null) {
    	       	String[]fields = line.split(",");
    	    	resultadoValidacionCampo = validarCampos(fields);
    	    	if("OK".equals(resultadoValidacionCampo)){
    	    		Alumno alumno = new Alumno();
    	    		alumno.setDni(fields[0]);
    	    		alumno.setNombre(fields[1]);
      	    		char genero = validarGenero(fields[2]);
    	    		if(validarGenero(fields[2])!= ' ')  {
    	    			
    	    			alumno.setGenero();
    	    			
    	    		}else { //Registro invalido, mandar al archivo bad    	    			   	    	
    	    		}
    	   
    	    		int nota1 = validarNota(fields[3]);
    	    		if (nota1 != 0) {
    	    			alumno.setNota1(nota1);
    	    			
    	    			
    	    		}else {
    	    			
    	    			//informar nota invalida
    	    		}
    	    		int nota2 = validarNota(fields[4]);
    	    		if (nota2 !=0) {
    	    			alumno.setNota2(nota2);
    	    	
    	    		}else {
    	    			
    	    		}
    	    		
    	    		double asistencia = validarAsistencia(fields[5]);
    	    			
    	    			alumno.setAsistencia(asistencia);
    	    		}
    	    		
    	    	}

    	    	lista.add(alumno[1]);


    	    
    	} catch (IOException x) {
    	    x.printStackTrace();
    	}

    	ArrayList<Alumno> validos = new ArrayList<Alumno>();
    	for(Alumno alumno : lista) {
    		
    		if("OK".equals(alumno.validarAsistencia())) {
    			
    			
    		}else {
    		
    	}
    Estadistica 		
    		
	
	private void setAsistencia(double asistencia) {
		// TODO Auto-generated method stub
		
	}

	private static double validarAsistencia(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void setNota2(int nota2) {
		// TODO Auto-generated method stub
		
	}

	private void setNota1(int nota1) {
		// TODO Auto-generated method stub
		
	}

	private void setGenero() {
		// TODO Auto-generated method stub
		
	}

	private void setNombre(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDni(String string) {
		// TODO Auto-generated method stub
		
	}

	private static int validarNota(String valor) {
		int resultado = 0;
		try {

		Integer entero = new Integer(valor);
		resultado = entero.intValue();
		}catch(NumberFormatException e) {
			
		}
		return resultado; 
		
	}
	
	
	private static char validarGenero(String valor) {
		
		if(valor.length()==1) {
			return valor.charAt(0);
			
		}return ' ';
		
	}

	private static String validarCampos(String[] fields) {
		String validacion = ",";
		if (fields.length = 6)
	}
	public char getGenero() {
		// TODO Auto-generated method stub
		return Genero;
	}

}
