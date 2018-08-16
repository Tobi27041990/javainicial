package primeraclase;

import primeraclase.modelo.Employee;
import primeraclase.modelo.Votador;
import primeraclase.servicio.GestorEmpleados;

public class MainClass {

	public static void main(String[] args) {
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200, "Jefe Senado", Votador.SENADO);
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(400,"Jefe Diputado", Votador.DIPUTADO);
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
		
		//Employee Senado = GestorEmpleados.createEmployee(700, "Senado", ubicacion)
		
		//Employee asesorDiputados = GestorEmpleados.createEmployee(500, "Asesor", Votador.ASESORDIPUTADO);
		//GestorEmpleados.establecerJerarquia(asesorDiputados, jefeDiputado);
		//GestorEmpleados.generarAsesores(asesorDiputados);
		
		//Employee asesorSenado = GestorEmpleados.createEmployee(600, "Asesor", Votador.ASESORSENADO);
		//GestorEmpleados.establecerJerarquia(asesorSenado, Senado);
		//GestorEmpleados.generarAsesores(asesorSenado);
		
		for (Votador empleado: presidente.getReportees()) {
			empleado.elegirVoto();
			System.out.println(empleado.getDecisionVoto());
		}
		
		}
	}
	
}
