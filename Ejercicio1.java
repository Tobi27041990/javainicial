package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		String message = "item";
		int quantity = 10; 

		
     if (quantity >= 1) {
		System.out.println("Hay stock del producto");
    	message = message + "s"; 
     }
     
     boolean outOfStock = quantity <=0;
     
     if(outOfStock){
    	 System.out.println("Item available");
     }
    	 else {
    		 System.out.println(message);
    		 
    	 }
    	 
    	 
     }
	}
	
