package javaPrograms;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "Salim";
		String reverse = new StringBuilder(input).reverse().toString();
		System.out.println(reverse);
		
		String str = "Apsana";
		char ch;
		String str1="";
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			str1 = ch + str1;
			count ++;
			
		}
		System.out.println(str1);
		System.out.println(count);
		
		String palin = "110";
		String result = new StringBuilder(palin).reverse().toString();
		if(palin.equals(result))
		{
			System.out.println("It is palindrome "+palin);
		}
		else {
			System.out.println("It is not palindrome "+palin);
		}
		int []numbers = {3,5,6,2,3};
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int num : numbers)
		{
			if(max<num) max=num;
			if(min>num) min=num;
		}
		System.out.println("Smallest Number : " +min);
		System.out.println("Largest Number : " +max);
		
		int fact = 1;
		int number = 5;
		
		for(int i =1 ; i<= number; i++)
		{
			 fact = fact * i;
		}
		System.out.println(fact);
		
		int num1=0, num2=1;
		int num = 5;
		System.out.println(num1 + num2);
		for(int i = 2; i<= num; i++ )
		{
			int sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
