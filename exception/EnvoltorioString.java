package exception;

public class EnvoltorioString {
	
	private String valor; 
	
	public char charAt(int indice) {
		
		
		try {
			return valor.charAt(indice);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
			
			
			
		}
	}
	
	public void vaciarValor() {
		
		valor = " ";
		
	}
	

}
