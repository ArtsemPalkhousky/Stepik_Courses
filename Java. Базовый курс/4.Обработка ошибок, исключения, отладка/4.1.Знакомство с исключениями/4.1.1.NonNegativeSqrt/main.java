public class main {
	public static void main (String[] args) {
		System.out.println("|Test negativeExeption SQRT|");
     		System.out.println(sqrtNegException.sqrt(4.0)); //Good
      	try {
          	System.out.println(sqrtNegException.sqrt(-4.0)); //Exception
      	} catch (Exception e){
      	System.out.println(e.getMessage())
	}
}