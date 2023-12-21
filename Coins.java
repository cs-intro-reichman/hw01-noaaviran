public class Coins {
	public static void main(String[] args) {
		int a = Integer.parseInt (args[0]);
		int quarter= 25;
		int cent= 1;
		int centresult = (a % quarter );
		int qurtesrresult= (a / quarter) ; 
		System.out.println ("Use " + qurtesrresult + " qurters and " + centresult + " cents") ;
	}
}
		