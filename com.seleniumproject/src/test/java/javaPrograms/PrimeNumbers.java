package javaPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int number = 4;
		boolean isprime = true;
		 if(number <= 1) isprime =false;
		 else {
			 for(int i=2; i<= Math.sqrt(number); i++)
			 {
				 if(number % i == 0)
				 {
					 isprime = false;
					 break;
				 }
			 }
		 }
		 
		 System.out.println(number + ( isprime? "is a Prime Number" : "is not a prime number"));
}
}
