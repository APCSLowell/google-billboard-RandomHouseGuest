

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		String digits = e.substring(2, 12);
		double dnum = Double.parseDouble(digits);
		System.out.println(dnum);
		for(int i = 2; i < e.length(); i++){
			digits = e.substring(i, i+11);
			dnum = Double.parseDouble(digits);
			System.out.println(isPrime(dnum));
			if(isPrime(dnum) == true){
				break;
			}
		}
		System.out.print(dnum);
	}
	

	//Finish this function
	public boolean isPrime(double d){
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
