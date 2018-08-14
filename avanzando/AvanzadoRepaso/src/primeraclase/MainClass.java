package primeraclase;



import primeraclase.servicio.GestorEmpleados;
import primeraclase.servicio.Utilidades;
import primerclase.modelo.Employee;


public class MainClass {

	public static void main(String[] args) {
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200,"Jefe Senado", "senado");
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(300,"Jefe Diputado", "congreso");
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
		
		
	}	
	
}

	

