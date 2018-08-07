package primerclase;

import java.util.ArrayList;
import java.util.List;

public class PrimerClase {

	public static void main(String[] args) {
	
		Manager presidente = createManager("Presidente", "presidencia",100);
		presidente.setReportTo(presidente);
		
		Manager jefeSenado = createManager("Jefe Senado", "senado", 200);
		jefeSenado.setReportTo(presidente);
		//Random generateRandomInt(maximo, minimo);
		
		jefeSenado.setReportes(generateRandomEmployees(cantidad, "senado", "jefe Senado"));	
		Manager jefeDiputado = createManager("Jefe Diputado", "congreso", 300);
		jefeDiputado.setReportTo(presidente);
	}
	
	
	
	
	private static Manager createManager(String nombre,String ubicacion, int legajo) {
		
	Manager man = new Manager();
	man.setLegajo(legajo);
	man.setName(nombre);
	man.setUbicacion(ubicacion);
		
		
		return man;
		
	}
	
	public static List<Employee> generateRandomEmployees(int cantidad, String nombreBase, int legajoBase, Manager report){
	
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp = null;
		
		for(int i =1; i<=cantidad;i++) {
			emp = new Employee();
			emp.setLegajo(legajoBase +i);
			emp.setName(nombreBase +emp.getLegajo());
			emp.setUbicacion(report.getUbicacion());
		
			
		}
		
	return employees;
	
		
		
	}
	
	
}
