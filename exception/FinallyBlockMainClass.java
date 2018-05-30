package exception;

public class FinallyBlockMainClass {

	public static void main(String[] args) {
		
		
		EnvoltorioString a1,a2,a3;
		EnvoltorioString[]lista = new EnvoltorioString[3];
		
		
		try {
			
			a1 = "";
			a2 = "Algo";
			a3 = "Otra";
			lista[0]= a1;
			lista[1]= a2;
			lista[2]= a3;
			
			for(EnvoltorioString string : lista) {
				
				string.charAt(3);
			}
			
			
		} catch (RuntimeException e) {
			
			e.printStackTrace();
			
		}finally {
			if(a1 != null) {
				
				System.out.println("");
				
			}
			if(a2 != null) {
				System.out.println("");
				
			}
			
		}
		
		

	}

}
