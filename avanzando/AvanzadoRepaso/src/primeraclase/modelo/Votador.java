package primeraclase.modelo;

public interface Votador {
	public Boolean getDecisionVoto();
	public void elegirVoto();
	public static final String SENADO = "senado";
	public static final String DIPUTADO = "diputado";
	public static final String ASESORDIPUTADO = "asesorDiputado";
	public static final String ASESORSENADO = "asesorSenado";
}
