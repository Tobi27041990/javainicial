
package exception;

public class ExceptionMainClass {

	public static void main(String[]args) {
		
		InscriptorProfesores ins = new InscriptorProfesores();
		
		for (int i=0; i < 88;i++) {
			try{
				
				ins.inscribirProfesor(i);
			}catch(Exception e ) {
				e.printStackTrace();
				break;
			}
			
		}
		ins.mostrarProfesoresInscriptos();	
		
	}
	
	
}
