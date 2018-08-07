package primerclase;

public class Employee {
	
	int legajo;
	String ubicacion; 
	Manager reportTo;
	String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {
	}
	public Manager getReportTo() {
		return reportTo;
	}
	public void setReportTo(Manager reportTo) {
		this.reportTo = reportTo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
}
