package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.RandomCodeGenerator;

public class RandomCodeTest {

	@Test
	public void test()
	{
		for (int i = 0; i <9; i++) {
			String s = RandomCodeGenerator.generate();
			System.out.println(s);
			assertEquals(s.length(), 8);
		}
	}
}
