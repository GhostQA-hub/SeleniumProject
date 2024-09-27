package javaPrograms;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class StartingLetters {

	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Sana");
		names.add("Aryan");
		names.add("Abhishek");
		names.add("Apsana");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A"))
			{
				count++;
			}

			
		}
		System.out.println(count);
	}

}
