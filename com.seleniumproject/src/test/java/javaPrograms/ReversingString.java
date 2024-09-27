package javaPrograms;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Salim";
		String nstr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		
		System.out.println(nstr);
	
	}

}
