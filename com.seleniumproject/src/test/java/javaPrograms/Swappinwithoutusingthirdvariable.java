package javaPrograms;

public class Swappinwithoutusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=5;
		int b= 10;
		
		
		System.out.println("Before A = "+a+"Before B="+b);
		a= a +b;
		b =a - b;
		a = a - b;
		System.out.println("Before A = "+a+"Before B="+b);
	
	}

}
