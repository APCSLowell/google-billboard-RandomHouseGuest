

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		String digits = e.substring(2, 12);
		double dnum = Double.parseDouble(digits);
		for(int i = 2; i < e.length(); i++){
			digits = e.substring(i, i+10);
			dnum = Double.parseDouble(digits);
			if(isPrime(dnum) == true){
				break;
			}
		}
		System.out.println(dnum);
	}
	

	//Finish this function
	public static boolean isPrime(double num){
		if(num < 2){
		    return false;
		} else{
		    for(int i = 2; i <= Math.sqrt(num); i++){
		      if(num%i == 0){
		        return false;
		      }
		    }
		  }
		  return true;
	}

}

