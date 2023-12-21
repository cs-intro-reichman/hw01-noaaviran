public class Gen3 {
	public static void main(String args []) {
		 int a = Integer.parseInt (args[0]);
		 int b = Integer.parseInt (args[1]);
		 
		 
		
		
		 int subtraction1 = b-a;
         int multi1 = (int) (subtraction1 * Math.random()) + a;
         int multi2 = (int) (subtraction1 * Math.random()) + a;
         int multi3 = (int) (subtraction1 * Math.random()) + a;	 
		 
	    int min = Math.min (multi1, multi2); 
		int min2 = Math.min (min, multi3);
		 
		System.out.println (multi1);
		System.out.println (multi2);
		System.out.println (multi3);

		System.out.println ("The minimal generated number was " + min2); 
	
	    
		  
		
	}
}
		