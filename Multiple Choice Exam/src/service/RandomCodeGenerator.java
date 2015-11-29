package service;

import java.util.ArrayList;

public class RandomCodeGenerator {

	static ArrayList<Character> list = new ArrayList<Character>();
	
	static{
		list = new ArrayList<Character>();
		for (char c = 'A'; c <= 'Z'; c++) {
			list.add(c);
		}
		for (char c = '0'; c <= '9'; c++) {
			list.add(c);
		}
		
	}
	public static String generate()
	{
		String result = "";
		
		for (int i = 0; i < 8; i++) {
			
			result += list.get(randomWithRange(0, list.size()-1));
			
		}
		
		return result;
	}
	static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
}
