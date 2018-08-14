package primerclase.modelo;

import java.util.List;

public class Employee {
	int legajo;
	String ubicacion;
	Employee reportTo;
	String name;
	char genero;
	List<Employee> reportees;
	
	
	public Employee() {
		
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Employee getReportTo() {
		return reportTo;
	}
	public void setReportTo(Employee reportTo) {
		this.reportTo = reportTo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Employee> getReportees() {
		return reportees;
	}
	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

		
	}
	

